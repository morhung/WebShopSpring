
package model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public class Cart {
    private HashMap<Long, Item> cartItems;

    public Cart() {
        cartItems = new HashMap<>();
    }

    public Cart(HashMap<Long, Item> cartItems) {
        this.cartItems = cartItems;
    }

    public HashMap<Long, Item> getCartItems() {
        return cartItems;
    }

    public void setCartItems(HashMap<Long, Item> cartItems) {
        this.cartItems = cartItems;
    }
    
    public void insertToCart(Long key, Item item){
       boolean bln = cartItems.containsKey(key);
        if (bln) {
            int soLuongCu = item.getSoLuong();
            item.setSoLuong(soLuongCu + 1);
            double tonggia = item.getSoLuong() * item.getProduct().getProductPrice();
            item.setTotalPrice(tonggia);
            cartItems.put(key, item);
        }else{
            double tonggia = item.getSoLuong() * item.getProduct().getProductPrice();
            item.setTotalPrice(tonggia);
            cartItems.put(key, item);
        }
    }
    
    public HashMap<Long, Item> removeToCart(Long product){
        boolean bln = cartItems.containsKey(product);
        if (bln) {
            cartItems.remove(product);
        }
        return cartItems;
    }
    
    public int countItem(){
        int count = 0;
        count = cartItems.size();
        return count;
    }
    
    public double totalMoney(){
        int count = 0;
        for (Map.Entry<Long, Item> list : cartItems.entrySet()){
            count += list.getValue().getProduct().getProductPrice() * list.getValue().getSoLuong();
        }
        return count;
    }
   
}
