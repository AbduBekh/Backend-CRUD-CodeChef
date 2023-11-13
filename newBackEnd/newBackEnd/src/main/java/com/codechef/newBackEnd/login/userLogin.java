package com.codechef.newBackEnd.login;



import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@jakarta.persistence.Entity
@Table(name="USER_LOGIN")
public class userLogin {

    @jakarta.persistence.Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )

    private String USERNAME;
    private String  PASSWORD;
    private String USERTYPE;
    private String ID;




    // Constructors

    // no arg constructor
    public userLogin() {
    }
    // Constructor without username(key)
    public userLogin(String ID, String PASSWORD, String USERTYPE) {
        this.ID = ID;
        this.PASSWORD = PASSWORD;
        this.USERTYPE = USERTYPE;
    }
    // Constructor with everything

    public userLogin(String ID, String USERNAME, String PASSWORD, String USERTYPE) {
        this.ID = ID;
        this.USERNAME = USERNAME;
        this.PASSWORD = PASSWORD;
        this.USERTYPE = USERTYPE;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    public String getUSERTYPE() {
        return USERTYPE;
    }

    public void setUSERTYPE(String USERTYPE) {
        this.USERTYPE = USERTYPE;
    }

    @Override
    public String toString() {
        return "userLogin{" +
                "ID='" + ID + '\'' +
                ", USERNAME='" + USERNAME + '\'' +
                ", PASSWORD='" + PASSWORD + '\'' +
                ", USERTYPE='" + USERTYPE + '\'' +
                '}';
    }
}
