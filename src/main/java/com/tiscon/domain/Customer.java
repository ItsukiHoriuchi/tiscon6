package com.tiscon.domain;

import java.io.Serializable;

public class Customer implements Serializable {

    private Integer customerId;

    private String oldPrefectureId;

    private String newPrefectureId;

    private String customerName;

    private String tel;

    private String email;

    private String oldPostalcode;

    private String oldAddress;

    private String newPostalcode;

    private String newAddress;

    private String theday;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getOldPrefectureId() {
        return oldPrefectureId;
    }

    public void setOldPrefectureId(String oldPrefectureId) {
        this.oldPrefectureId = oldPrefectureId;
    }

    public String getOldPostalcode() {
        return oldPostalcode;
    }

    public void setOldPostalcode(String oldPostalcode) {
        this.oldPostalcode = oldPostalcode;
    }

    public String getNewPrefectureId() {
        return newPrefectureId;
    }

    public void setNewPrefectureId(String newPrefectureId) {
        this.newPrefectureId = newPrefectureId;
    }

    public String getNewPostalcode() {
        return newPostalcode;
    }

    public void setNewPostalcode(String newPostalcode) {
        this.newPostalcode = newPostalcode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getOldAddress() {
        return oldAddress;
    }

    public void setOldAddress(String oldAddress) {
        this.oldAddress = oldAddress;
    }

    public String getNewAddress() { return newAddress; }

    public void setNewAddress(String newAddress) {
        this.newAddress = newAddress;
    }

    public String getTheday() { return theday; }

    public void setTheday(String theday) {
        this.theday = theday;
    }
}
