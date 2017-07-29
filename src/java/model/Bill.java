
package model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;




@Entity(name = "bill")

public class Bill {
    @Id
    //@GeneratedValue
    @Column(name = "bill_id", unique = true, nullable = false)
    private long bill_id;
    
    @Column(name = "userID")
    private String userID;
    @Column(name = "total_price")
    private double total_price;
    @Column(name = "payment")
    private String payment;
    @Column(name = "address")
    private String address;
    

    public Bill() {
    }

    public Bill(String userID, double total_price, String payment, String address) {
        this.userID = userID;
        this.total_price = total_price;
        this.payment = payment;
        this.address = address;
    }
    
    
    
    public Bill(long bill_id, String userID, double total_price, String payment, String address) {
        this.bill_id = bill_id;
        this.userID = userID;
        this.total_price = total_price;
        this.payment = payment;
        this.address = address;
       
    }

    public long getBill_id() {
        return bill_id;
    }

    public void setBill_id(long bill_id) {
        this.bill_id = bill_id;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public double getTotal_price() {
        return total_price;
    }

    public void setTotal_price(double total_price) {
        this.total_price = total_price;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

   
    
    
}
