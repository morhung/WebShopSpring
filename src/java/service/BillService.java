
package service;

import dao.BillDAO;
import model.Bill;
import org.springframework.beans.factory.annotation.Autowired;


public class BillService {
    @Autowired
    BillDAO billDAO;
    
    public void insertBill(Bill bill){
        billDAO.insertBill(bill);
    }
}
