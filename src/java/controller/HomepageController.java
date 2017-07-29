
package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import service.CategoryService;


@Controller
@RequestMapping(value = "/home")
public class HomepageController {
    @Autowired
    CategoryService categoryService;
    @RequestMapping(value = "/index")
    public String index(ModelMap mm){
        mm.put("listCategory", categoryService.getArrayCategory());
        return "pages/index";
    }
}
