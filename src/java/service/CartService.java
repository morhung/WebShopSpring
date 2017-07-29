package service;

import dao.CartDAO;
import java.util.HashMap;

import model.Item;
import org.springframework.beans.factory.annotation.Autowired;

public class CartService {

    @Autowired
    CartDAO cartDAO;
    public HashMap<Long, Item> getCartItems() {
        return cartDAO.getCartItems();
    }

    public void insertToCart(Long ket, Item item) {
        cartDAO.insertToCart(ket, item);
    }

    public HashMap<Long, Item> removeToCart(Long product) {
        return cartDAO.removeToCart(product);
    }

    public int countItem() {
        return cartDAO.countItem();
    }
}
