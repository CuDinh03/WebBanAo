package com.example.quanlykho.model;

import java.util.Date;

public class HistoryExport {
    private int id;
    private String hsCode;
    private String hsName;
    private Date date;
    private String prName;
    private String wrName;
    private int quantity;

    public HistoryExport() {
    }

    public HistoryExport(int id, String hsCode, String hsName, Date date, String prName, String wrName, int quantity) {
        this.id = id;
        this.hsCode = hsCode;
        this.hsName = hsName;
        this.date = date;
        this.prName = prName;
        this.wrName = wrName;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHsCode() {
        return hsCode;
    }

    public void setHsCode(String hsCode) {
        this.hsCode = hsCode;
    }

    public String getHsName() {
        return hsName;
    }

    public void setHsName(String hsName) {
        this.hsName = hsName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getPrName() {
        return prName;
    }

    public void setPrName(String prName) {
        this.prName = prName;
    }

    public String getWrName() {
        return wrName;
    }

    public void setWrName(String wrName) {
        this.wrName = wrName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
