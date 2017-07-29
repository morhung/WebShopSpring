
package service;

import dao.ProductDAO;
import java.util.ArrayList;
import model.Product;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductService {
    @Autowired
    ProductDAO productDAO;
    
    public ArrayList<Product> getArrayProduct(long categoryID){
        return productDAO.getAllProduct(categoryID);
    }
    
    public Product getProduct(long productID){
        return productDAO.getProduct(productID);
    }
}
