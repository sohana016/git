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
public class ViewBalance {
    int id;
    String user;
    String name;
    int acc_no;
    int micr_no;
    int rate_of_interest;
    int available_blnce;
    int mod_blnce;
    String nomination_reg;

    public ViewBalance() {
    }

    public ViewBalance(int id, String user, String name, int acc_no, int micr_no, int rate_of_interest, int available_blnce, int mod_blnce, String nomination_reg) {
        this.id = id;
        this.user = user;
        this.name = name;
        this.acc_no = acc_no;
        this.micr_no = micr_no;
        this.rate_of_interest = rate_of_interest;
        this.available_blnce = available_blnce;
        this.mod_blnce = mod_blnce;
        this.nomination_reg = nomination_reg;
    }

    public ViewBalance(String user, String name, int acc_no, int micr_no, int rate_of_interest, int available_blnce, int mod_blnce, String nomination_reg) {
        this.user = user;
        this.name = name;
        this.acc_no = acc_no;
        this.micr_no = micr_no;
        this.rate_of_interest = rate_of_interest;
        this.available_blnce = available_blnce;
        this.mod_blnce = mod_blnce;
        this.nomination_reg = nomination_reg;
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

    public int getMicr_no() {
        return micr_no;
    }

    public int getRate_of_interest() {
        return rate_of_interest;
    }

    public int getAvailable_blnce() {
        return available_blnce;
    }

    public int getMod_blnce() {
        return mod_blnce;
    }

    public String getNomination_reg() {
        return nomination_reg;
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

    public void setMicr_no(int micr_no) {
        this.micr_no = micr_no;
    }

    public void setRate_of_interest(int rate_of_interest) {
        this.rate_of_interest = rate_of_interest;
    }

    public void setAvailable_blnce(int available_blnce) {
        this.available_blnce = available_blnce;
    }

    public void setMod_blnce(int mod_blnce) {
        this.mod_blnce = mod_blnce;
    }

    public void setNomination_reg(String nomination_reg) {
        this.nomination_reg = nomination_reg;
    }
    
    
    
}
