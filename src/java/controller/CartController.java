package controller;

import dao.ProductDAO;
import java.util.ArrayList;
import javax.servlet.http.HttpSession;
import model.Cart;

import model.Item;
import model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import service.CartService;
import service.ProductService;

@Controller
@RequestMapping(value = "/oder")
public class CartController {

    @Autowired
    Cart cart;
    @Autowired
    ProductService productService;
    @Autowired
    CartService cartService;

    @RequestMapping(value = "/cart/{productId}", method = RequestMethod.GET)
    public String insertCart(@PathVariable("productId") long productId, ModelMap mm, HttpSession session) {

        Product product = productService.getProduct(productId);
        if (cart.getCartItems().containsKey(productId)) {
            cartService.insertToCart(productId, new Item(product, cart.getCartItems().get(productId).getSoLuong()));
        }else{
            cartService.insertToCart(productId, new Item(product, 1));
        }
        
        ArrayList<Item> cartItemList = new ArrayList<>();
        cartService.getCartItems().entrySet().forEach(entry -> {
            cartItemList.add(entry.getValue());
        });
        session.setAttribute("cart", cartItemList);
        return "pages/cart";

    }
    
    @RequestMapping(value = "/cart/remove/{productId}", method = RequestMethod.GET)
    public String removeCart(@PathVariable("productId") long productId, HttpSession session){
        cartService.removeToCart(productId);
        ArrayList<Item> cart = new ArrayList<>();
        cartService.getCartItems().entrySet().forEach(entry -> {
            cart.add(entry.getValue());
        });
        session.setAttribute("cart", cart);
        return "pages/cart";
    }

}
