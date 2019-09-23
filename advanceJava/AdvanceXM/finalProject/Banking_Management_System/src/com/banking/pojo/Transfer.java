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
public class Transfer {
    int id;
    String user;
    String name;
    int acc_no;
    int available_blnce;
    int trrnsfer_amount;
    int cradit_amount;

    public Transfer() {
    }

    public Transfer(int id, String user, String name, int acc_no, int available_blnce, int trrnsfer_amount, int cradit_amount) {
        this.id = id;
        this.user = user;
        this.name = name;
        this.acc_no = acc_no;
        this.available_blnce = available_blnce;
        this.trrnsfer_amount = trrnsfer_amount;
        this.cradit_amount = cradit_amount;
    }

    public Transfer(String user, String name, int acc_no, int available_blnce, int trrnsfer_amount, int cradit_amount) {
        this.user = user;
        this.name = name;
        this.acc_no = acc_no;
        this.available_blnce = available_blnce;
        this.trrnsfer_amount = trrnsfer_amount;
        this.cradit_amount = cradit_amount;
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

    public int getAvailable_blnce() {
        return available_blnce;
    }

    public int getTrrnsfer_amount() {
        return trrnsfer_amount;
    }

    public int getCradit_amount() {
        return cradit_amount;
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

    public void setAvailable_blnce(int available_blnce) {
        this.available_blnce = available_blnce;
    }

    public void setTrrnsfer_amount(int trrnsfer_amount) {
        this.trrnsfer_amount = trrnsfer_amount;
    }

    public void setCradit_amount(int cradit_amount) {
        this.cradit_amount = cradit_amount;
    }
    
    
}
