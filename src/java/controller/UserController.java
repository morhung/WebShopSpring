package controller;


import javax.servlet.http.HttpSession;
import model.UserInfo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import service.UserService;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping(value = "/log")
    public String pageUser() {
        return "pages/login";
    }

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String singUp(@RequestParam("userName") String userName,
            @RequestParam("userEmail") String userEmail,
            @RequestParam("userPass") String userPass) {

        userService.insertUser(new UserInfo(userName, userEmail, userPass));
        return "pages/login";
    }

    @RequestMapping(value = "/logins", method = RequestMethod.POST)
    public String login(
            @RequestParam("userEmail") String userEmail,
            @RequestParam("userPass") String userPass,
            ModelMap mm, HttpSession session) {
        UserInfo c = userService.checkLogin(userEmail,userPass);
        
        if (c != null) {
            session.setAttribute("user", c);
            return "pages/index";
        } else {
            mm.put("check", c);
            mm.put("msg", "Incorrect email or password!");
            return "pages/login";
        }
    }
    
    @RequestMapping(value = "/checkout")
    public String checkout(HttpSession session){
        UserInfo user = (UserInfo) session.getAttribute("user");
        if (user == null) {
            return "pages/login";
        } else{
        return "pages/checkout";
        }
    }
   
    @RequestMapping(value = "/cart")
    public String cart(){
        return "pages/cart";
    }

}
