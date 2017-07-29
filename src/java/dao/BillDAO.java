package dao;

import Util.HibernateUtil;
import model.Bill;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

@Repository
public class BillDAO {

    public void insertBill(Bill bill) {
        //Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        //Transaction transaction = session.beginTransaction();

//        Query query = session.createQuery("INSERT INTO bill(userID, total_price, payment, address) VALUES (?,?,?,?)");
//        query.setString(1, bill.getUserID());
//        query.setDouble(2, bill.getTotal_price());
//        query.setString(3, bill.getPayment());
//        query.setString(4, bill.getAddress());
//        query.uniqueResult();
//        transaction.commit();
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(bill);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            //session.flush();
            session.close();
        }
    }

}
