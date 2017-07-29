
package service;

import dao.BillDetailsDAO;
import model.BillDetails;
import org.springframework.beans.factory.annotation.Autowired;


public class BillDetailsService {
    @Autowired
    BillDetailsDAO billDetailsDAO;
    
    public void insertBillDetails(BillDetails bd){
        billDetailsDAO.inserBillDetails(bd);
    }
}
