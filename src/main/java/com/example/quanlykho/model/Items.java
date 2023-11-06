package com.example.quanlykho.model;

import java.sql.Date;

public class Items {
    private int id;

    private String userName;
    private Products products;
    private int quantity;
    private Date date;
    public Items() {
    }

    public Items(Products products, int quantity) {
        this.products = products;
        this.quantity = quantity;
    }

    public Items(String userName, Products products, int quantity, Date date) {
        this.userName = userName;
        this.products = products;
        this.quantity = quantity;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
