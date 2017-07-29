
package service;

import dao.CategoryDAO;
import java.util.ArrayList;
import model.Category;
import org.springframework.beans.factory.annotation.Autowired;


public class CategoryService {
    @Autowired
    CategoryDAO categoryDAO;
    
    public ArrayList<Category> getArrayCategory(){
        return categoryDAO.getAllcategory();
    }
    
  
}
