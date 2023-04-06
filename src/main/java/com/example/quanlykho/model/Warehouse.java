package com.example.quanlykho.model;

public class Warehouse {
    private int wareHouseId;
    private String wareHouseCode;
    private String wareHouseName;
//    private Products products;
    private String wareHouseLocation;
    private int wareHouseStatus;

    public Warehouse() {
    }

    public Warehouse(int wareHouseId, String wareHouseCode, String wareHouseName, Products products, String wareHouseLocation, int wareHouseStatus) {
        this.wareHouseId = wareHouseId;
        this.wareHouseCode = wareHouseCode;
        this.wareHouseName = wareHouseName;
//        this.products = products;
        this.wareHouseLocation = wareHouseLocation;
        this.wareHouseStatus = wareHouseStatus;
    }

    public int getWareHouseId() {
        return wareHouseId;
    }

    public void setWareHouseId(int wareHouseId) {
        this.wareHouseId = wareHouseId;
    }

    public String getWareHouseCode() {
        return wareHouseCode;
    }

    public void setWareHouseCode(String wareHouseCode) {
        this.wareHouseCode = wareHouseCode;
    }

    public String getWareHouseName() {
        return wareHouseName;
    }

    public void setWareHouseName(String wareHouseName) {
        this.wareHouseName = wareHouseName;
    }

//    public Products getProducts() {
//        return products;
//    }

//    public void setProducts(Products products) {
//        this.products = products;
//    }

    public String getWareHouseLocation() {
        return wareHouseLocation;
    }

    public void setWareHouseLocation(String wareHouseLocation) {
        this.wareHouseLocation = wareHouseLocation;
    }

    public int getWareHouseStatus() {
        return wareHouseStatus;
    }

    public void setWareHouseStatus(int wareHouseStatus) {
        this.wareHouseStatus = wareHouseStatus;
    }


}
