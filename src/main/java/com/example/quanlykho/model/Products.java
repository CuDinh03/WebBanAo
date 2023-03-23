package com.example.quanlykho.model;


import java.sql.Date;

public class Products {
    private int productId;
    private String productCode;
    private String productName;
    private double productPrice;
    private int productQuantity;
    private String productImg;
    private String productDetail;
    private Date productInputDay;
    private Date productExpiry;
    private ProductTypes productTypes;
    private int productStatus;

    public Products() {
    }

    public Products(int productId, String productCode, String productName, double productPrice, int productQuantity, String productImg, String productDetail, Date productInputDay, Date productExpiry, ProductTypes productTypes, int productStatus) {
        this.productId = productId;
        this.productCode = productCode;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.productImg = productImg;
        this.productDetail = productDetail;
        this.productInputDay = productInputDay;
        this.productExpiry = productExpiry;
        this.productTypes = productTypes;
        this.productStatus = productStatus;
    }

    public Date getProductInputDay() {
        return productInputDay;
    }

    public void setProductInputDay(Date productInputDay) {
        this.productInputDay = productInputDay;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getProductImg() {
        return productImg;
    }

    public void setProductImg(String productImg) {
        this.productImg = productImg;
    }

    public String getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(String productDetail) {
        this.productDetail = productDetail;
    }

    public Date getProductExpiry() {
        return productExpiry;
    }

    public void setProductExpiry(Date productExpiry) {
        this.productExpiry = productExpiry;
    }

    public ProductTypes getProductTypes() {
        return productTypes;
    }

    public void setProductTypes(ProductTypes productTypes) {
        this.productTypes = productTypes;
    }

    public int getProductStatus() {
        return productStatus;
    }

    public void setProductStatus(int productStatus) {
        this.productStatus = productStatus;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
}
