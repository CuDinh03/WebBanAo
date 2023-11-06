package com.example.quanlykho.model;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Order {

    private int id;

    private User user;


    private List<Items> items;

    private BigDecimal totalAmount;

    private Date date;

    private int status;

    public Order() {
    }

    public Order(User user, BigDecimal totalAmount, Date date, int status) {
        this.user = user;
        this.totalAmount = totalAmount;
        this.date = date;
        this.status = status;
    }

    public Order(int id, User user, List<Items> items, BigDecimal totalAmount, Date date, int status) {
        this.id = id;
        this.user = user;
        this.items = items;
        this.totalAmount = totalAmount;
        this.date = date;
        this.status = status;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Items> getItems() {
        return items;
    }

    public void setItems(List<Items> items) {
        this.items = items;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
