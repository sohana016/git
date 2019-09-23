/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banking.pojo;

import java.util.Date;

/**
 *
 * @author Md Yasin Arif
 */
public class Account {
    int id;
    String accout_no;
    String micr_no;
    int pin;
    String account_type;
    String gender;
    String address;
    Double amount;
    String name;
    String date_of_birth;
    String nationality;
    String caste;
    int mobile;
    String sequirity_qsn;
    String ans;
    
     public Account() {
         
    }

    public Account(int id, String accout_no, String micr_no, int pin, String account_type, String gender, String address, Double amount, String name, String date_of_birth, String nationality, String caste, int mobile, String sequirity_qsn, String ans) {
        this.id = id;
        this.accout_no = accout_no;
        this.micr_no = micr_no;
        this.pin = pin;
        this.account_type = account_type;
        this.gender = gender;
        this.address = address;
        this.amount = amount;
        this.name = name;
        this.date_of_birth = date_of_birth;
        this.nationality = nationality;
        this.caste = caste;
        this.mobile = mobile;
        this.sequirity_qsn = sequirity_qsn;
        this.ans = ans;
    }

    public Account(String accout_no, String micr_no, int pin, String account_type, String gender, String address, Double amount, String name, String date_of_birth, String nationality, String caste, int mobile, String sequirity_qsn, String ans) {
        this.accout_no = accout_no;
        this.micr_no = micr_no;
        this.pin = pin;
        this.account_type = account_type;
        this.gender = gender;
        this.address = address;
        this.amount = amount;
        this.name = name;
        this.date_of_birth = date_of_birth;
        this.nationality = nationality;
        this.caste = caste;
        this.mobile = mobile;
        this.sequirity_qsn = sequirity_qsn;
        this.ans = ans;
    }

    

    public Account(String accout_no, String account_type, String gender, String address, String name, String date_of_birth, String nationality, String caste, int mobile, String sequirity_qsn) {
        this.accout_no = accout_no;
        this.account_type = account_type;
        this.gender = gender;
        this.address = address;
        this.name = name;
        this.date_of_birth = date_of_birth;
        this.nationality = nationality;
        this.caste = caste;
        this.mobile = mobile;
        this.sequirity_qsn = sequirity_qsn;
    }
    //update cons

    public Account(String gender, String address, String nationality, String caste, int mobile, String sequirity_qsn) {
        this.gender = gender;
        this.address = address;
        this.nationality = nationality;
        this.caste = caste;
        this.mobile = mobile;
        this.sequirity_qsn = sequirity_qsn;
    }

    public Account(int id, String accout_no, String account_type, String gender, String name, String date_of_birth, int mobile) {
        this.id = id;
        this.accout_no = accout_no;
        this.account_type = account_type;
        this.gender = gender;
        this.name = name;
        this.date_of_birth = date_of_birth;
        this.mobile = mobile;
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccout_no() {
        return accout_no;
    }

    public void setAccout_no(String accout_no) {
        this.accout_no = accout_no;
    }

    public String getMicr_no() {
        return micr_no;
    }

    public void setMicr_no(String micr_no) {
        this.micr_no = micr_no;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public String getAccount_type() {
        return account_type;
    }

    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getCaste() {
        return caste;
    }

    public void setCaste(String caste) {
        this.caste = caste;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public String getSequirity_qsn() {
        return sequirity_qsn;
    }

    public void setSequirity_qsn(String sequirity_qsn) {
        this.sequirity_qsn = sequirity_qsn;
    }

    public String getAns() {
        return ans;
    }

    public void setAns(String ans) {
        this.ans = ans;
    }

   
    

   
    
    
   
    
    
}
