
package service;

import Util.HibernateUtil;
import dao.UserDAO;
import model.UserInfo;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    UserDAO userDAO;
    public void insertUser(UserInfo userInfo){
        userDAO.insertUser(userInfo);
        
    }
    
    public UserInfo checkLogin(String email, String pass){
        return userDAO.checkLogin(email, pass);
        
    }
}
