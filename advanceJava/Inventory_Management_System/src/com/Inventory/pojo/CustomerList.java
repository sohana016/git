/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Inventory.pojo;

import java.sql.Date;

/**
 *
 * @author Java
 */
public class CustomerList {
    int id;
    String name;
    String mobileNo;
    String email;
    String date;

    public CustomerList() {
    }

    public CustomerList(int id, String name, String mobileNo, String email, String date) {
        this.id = id;
        this.name = name;
        this.mobileNo = mobileNo;
        this.email = email;
        this.date = date;
    }

    public CustomerList(String name, String mobileNo, String email, String date) {
        this.name = name;
        this.mobileNo = mobileNo;
        this.email = email;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    
    

    
    
    
    
    
    
}
