
package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "bill_details")
//@Table(name = "bill_details")
public class BillDetails {
    @Id
   // @GeneratedValue
    @Column(name = "bill_details_id", unique = true, nullable = false)
    private long bill_details_id;

    @Column(name = "bill_id", nullable = false)
    private long bill_id;
    @Column(name = "productID", nullable = false)
    private long productID;
    @Column(name = "price", nullable = false)
    private double price;
    @Column(name = "quatity")
    private int quatity;
    
  
    
    public BillDetails() {
    }

    public BillDetails(long bill_details_id, long bill_id, long productID, double price, int quatity) {
        this.bill_details_id = bill_details_id;
        this.bill_id = bill_id;
        this.productID = productID;
        this.price = price;
        this.quatity = quatity;
    }

    public BillDetails(int bill_id, int productID, double price, int quatity) {
        this.bill_id = bill_id;
        this.productID = productID;
        this.price = price;
        this.quatity = quatity;
    }
    
    
    
    public long getBill_details_id() {
        return bill_details_id;
    }

    public void setBill_details_id(long bill_details_id) {
        this.bill_details_id = bill_details_id;
    }

    public long getBill_id() {
        return bill_id;
    }

    public void setBill_id(long bill_id) {
        this.bill_id = bill_id;
    }

    public long getProductID() {
        return productID;
    }

    public void setProductID(long productID) {
        this.productID = productID;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuatity() {
        return quatity;
    }

    public void setQuatity(int quatity) {
        this.quatity = quatity;
    }
    
    
    
    
}
