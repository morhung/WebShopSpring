/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.HashMap;
import java.util.Map;
import model.Cart;
import model.Item;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author TumPc
 */
public class CartDAO {
    @Autowired
    Cart cart;
    
     public HashMap<Long, Item> getCartItems() {
        return cart.getCartItems();
    }

    
    
    public void insertToCart(Long key, Item item){
       cart.insertToCart(key, item);
    }
    
    public HashMap<Long, Item> removeToCart(Long product){
       return cart.removeToCart(product);
       
    }
    
    public int countItem(){
        return cart.countItem();
    }
    
    public double totalMoney(){
       return cart.totalMoney();
    }
}
