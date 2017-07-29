
package controller;

import java.util.ArrayList;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import model.Bill;
import model.BillDetails;
import model.Cart;
import model.Item;
import model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import service.BillDetailsService;
import service.BillService;

@Controller
@RequestMapping(value = "/checkout")
public class CheckoutController {
    @Autowired
    BillService billService;
    BillDetailsService billDetailsService;
    @RequestMapping(value = "/ok", method= RequestMethod.POST)
    public String insertBill(@RequestParam("address") String address, 
            HttpSession session, HttpServletRequest request){
        session = request.getSession();
        UserInfo user = (UserInfo)session.getAttribute("user");
        ArrayList<Item> itemList = (ArrayList)session.getAttribute("cart");
       
        billDetailsService.insertBillDetails(new BillDetails(58155, 58155, 3, 2, 5));
        if (itemList != null) {
            double sum = 0;
            for(int i = 0 ; i < itemList.size(); ++i){
                sum += itemList.get(i).getTotalPrice();
            }
            //billService.insertBill(new Bill(58155, "3", 54 , "Bank", "hcm"));
            long ID = new Date().getTime();
            //String sID = String.valueOf(ID);
           // billService.insertBill(new Bill(ID, user.getUserID(), sum , "Bank", address));
           
//            for (int i = 0; i < itemList.size(); i++) {
//                billDetailsService.insertBillDetails(new BillDetails(ID, ID, 
//                        (int) itemList.get(i).getProduct().getProductID(),
//                        itemList.get(i).getProduct().getProductPrice(),
//                        itemList.get(i).getSoLuong()));
//            }
            
            return "pages/checkoutOK";
        }
        return "pages/login";
    }
}
