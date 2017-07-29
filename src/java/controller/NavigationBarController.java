
package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.bind.annotation.RenderMapping;
import service.CategoryService;

@Controller
@RequestMapping(value = "/home")
public class NavigationBarController {
    @Autowired
    CategoryService categoryService;
    @RequestMapping(value = "/product")
    public String product(ModelMap mm){
        mm.put("listCategory", categoryService.getArrayCategory());
        return "pages/product";
    }
    @RequestMapping(value = "/product-details")
    public String productDetails(){
        return "pages/product-details";
    }
    
    
    @RequestMapping(value = "/blog")
    public String blog(){
        return "pages/blog";
    }
    @RequestMapping(value = "/blogsingle")
    public String blogsingle(){
        return "pages/blogsingle";
    }
    
    @RequestMapping(value = "/error")
    public String error(){
        return "pages/error";
    }
    @RequestMapping(value = "/contactus")
    public String contactus(){
        return "pages/contactus";
    }
}
