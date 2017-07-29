
package dao;

import Util.HibernateUtil;
import java.util.ArrayList;
import model.Product;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;


public class ProductDAO {
    public ArrayList<Product> getAllProduct(long categoryID){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        Query query = (Query) session.createQuery("from product where categoryID = :categoryID");
        query.setLong("categoryID", categoryID);
        ArrayList<Product> list = (ArrayList<Product>) query.list();
        transaction.commit();
        return list;
    }
    
    public Product getProduct(long productID){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Transaction transaction = session.beginTransaction();
        Query query = (Query) session.createQuery("from product where productID = :productId");
        query.setLong("productId", productID);
        Product p = (Product) query.uniqueResult();
        transaction.commit();
        return p;
    }
}
