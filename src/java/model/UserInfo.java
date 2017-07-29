
package model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;



@Entity(name = "user")

public class UserInfo implements Serializable{
    @Id
    @GeneratedValue
    @Column (name="userID")
    private String userID;
    @Column(name = "userName")
    private String userName;
    @Column(name = "userEmail")
    private String userEmail;
    @Column(name = "userPass")
    private String userPass;
    
    
    public UserInfo(){}

    public UserInfo(String userEmail, String userPass) {
        this.userPass = userPass;
        this.userEmail = userEmail;
    }
    
    public UserInfo( String userName, String userEmail, String userPass) {
        
        this.userName = userName;
        this.userPass = userPass;
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
    
    
}
