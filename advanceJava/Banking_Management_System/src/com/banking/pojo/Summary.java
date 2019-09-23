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
public class Summary {
    int id;
    String name;
    String acc_no;
    double availavle_blnce;
    double deposite_amount;
    double withamount;
    double total;

    public Summary() {
    }

    public Summary(String acc_no) {
        this.acc_no = acc_no;
    }

    public Summary(String name, String acc_no, double availavle_blnce) {
        this.name = name;
        this.acc_no = acc_no;
        this.availavle_blnce = availavle_blnce;
    }

    public Summary(String acc_no, double availavle_blnce, double deposite_amount, double total) {
        this.acc_no = acc_no;
        this.availavle_blnce = availavle_blnce;
        this.deposite_amount = deposite_amount;
        this.total = total;
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

    public String getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(String acc_no) {
        this.acc_no = acc_no;
    }

    public double getAvailavle_blnce() {
        return availavle_blnce;
    }

    public void setAvailavle_blnce(double availavle_blnce) {
        this.availavle_blnce = availavle_blnce;
    }

    public double getDeposite_amount() {
        return deposite_amount;
    }

    public void setDeposite_amount(double deposite_amount) {
        this.deposite_amount = deposite_amount;
    }

    public double getWithamount() {
        return withamount;
    }

    public void setWithamount(double withamount) {
        this.withamount = withamount;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

   

    
    
    
}
