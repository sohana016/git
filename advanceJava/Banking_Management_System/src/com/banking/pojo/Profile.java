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
public class Profile {
    int id;
    String name;
    String date_of_birth;
    String nationality;
    String address;
    String acc_no;
    String acc_type;
    String caste;
    String seq_qsn;
    int mobile;
    String gender;

    public Profile() {
    }

    public Profile(int id, String name, String date_of_birth, String nationality, String address, String acc_no, String acc_type, String caste, String seq_qsn, int mobile, String gender) {
        this.id = id;
        this.name = name;
        this.date_of_birth = date_of_birth;
        this.nationality = nationality;
        this.address = address;
        this.acc_no = acc_no;
        this.acc_type = acc_type;
        this.caste = caste;
        this.seq_qsn = seq_qsn;
        this.mobile = mobile;
        this.gender = gender;
    }

    public Profile(String name, String date_of_birth, String nationality, String address, String acc_no, String acc_type, String caste, String seq_qsn, int mobile, String gender) {
        this.name = name;
        this.date_of_birth = date_of_birth;
        this.nationality = nationality;
        this.address = address;
        this.acc_no = acc_no;
        this.acc_type = acc_type;
        this.caste = caste;
        this.seq_qsn = seq_qsn;
        this.mobile = mobile;
        this.gender = gender;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAcc_no() {
        return acc_no;
    }

    public void setAcc_no(String acc_no) {
        this.acc_no = acc_no;
    }

    public String getAcc_type() {
        return acc_type;
    }

    public void setAcc_type(String acc_type) {
        this.acc_type = acc_type;
    }

    public String getCaste() {
        return caste;
    }

    public void setCaste(String caste) {
        this.caste = caste;
    }

    public String getSeq_qsn() {
        return seq_qsn;
    }

    public void setSeq_qsn(String seq_qsn) {
        this.seq_qsn = seq_qsn;
    }

    public int getMobile() {
        return mobile;
    }

    public void setMobile(int mobile) {
        this.mobile = mobile;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    

   

    

    
    
    
}
