package dao;

import Util.HibernateUtil;
import model.UserInfo;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO {
    
    public void insertUser(UserInfo userInfo) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {           
            tx = session.beginTransaction();
            session.save(userInfo);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    public UserInfo checkLogin(String mail, String pass) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction tran = session.beginTransaction();
        Query query = session.createQuery("from user where userEmail = :email and userPass = :pass");
        query.setString("email", mail);
        query.setString("pass", pass);
        UserInfo user = (UserInfo) query.uniqueResult();
        tran.commit();
        
        if (user != null) {
            return user;
        }else{
            return null;
        }
    }
    
}
