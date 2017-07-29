package dao;

import Util.HibernateUtil;
import model.BillDetails;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class BillDetailsDAO {

    public void inserBillDetails(BillDetails billDetails) {
//        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//        Transaction transaction = session.beginTransaction();
//        Query query = session.createQuery("INSERT INTO bill_details(bill_id, productID, price, quatity) VALUES (?,?,?,?)");
//        
//        query.setInteger(1, bd.getBill_id());
//        query.setInteger(2, bd.getProductID());
//        query.setDouble(3, bd.getPrice());
//        query.setInteger(4, bd.getQuatity());
//        query.uniqueResult();
//        transaction.commit();
         Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            session.save(billDetails);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) {
                tx.rollback();
            }
            e.printStackTrace();
        } finally {
            session.flush();
            session.close();
        }
    }
}
