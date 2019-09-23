/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banking.pojo;

/**
 *
 * @author Md Yasin Arif
 */
public class Deposite {
    int id;
    String user;
    String name;
    int acc_no;
    int availavle_blnce;
    int deposite_amount;

    public Deposite() {
    }

    public Deposite(int id, String user, String name, int acc_no, int availavle_blnce, int deposite_amount) {
        this.id = id;
        this.user = user;
        this.name = name;
        this.acc_no = acc_no;
        this.availavle_blnce = availavle_blnce;
        this.deposite_amount = deposite_amount;
    }

    public Deposite(String user, String name, int acc_no, int availavle_blnce, int deposite_amount) {
        this.user = user;
        this.name = name;
        this.acc_no = acc_no;
        this.availavle_blnce = availavle_blnce;
        this.deposite_amount = deposite_amount;
    }

    public int getId() {
        return id;
    }

    public String getUser() {
        return user;
    }

    public String getName() {
        return name;
    }

    public int getAcc_no() {
        return acc_no;
    }

    public int getAvailavle_blnce() {
        return availavle_blnce;
    }

    public int getDeposite_amount() {
        return deposite_amount;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAcc_no(int acc_no) {
        this.acc_no = acc_no;
    }

    public void setAvailavle_blnce(int availavle_blnce) {
        this.availavle_blnce = availavle_blnce;
    }

    public void setDeposite_amount(int deposite_amount) {
        this.deposite_amount = deposite_amount;
    }
    
    
    
    
}
