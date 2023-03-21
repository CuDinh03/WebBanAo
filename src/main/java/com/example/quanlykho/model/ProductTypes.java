package com.example.quanlykho.model;

public class ProductTypes {
    private int productTypesId;
    private String productTypesCode;
    private String productTypesName;
    private int productTypesStatus;

    public ProductTypes() {
    }

    public ProductTypes(int productTypesId, String productTypesCode, String productTypesName, int productTypesStatus) {
        this.productTypesId = productTypesId;
        this.productTypesCode = productTypesCode;
        this.productTypesName = productTypesName;
        this.productTypesStatus = productTypesStatus;
    }

    public int getProductTypesId() {
        return productTypesId;
    }

    public void setProductTypesId(int productTypesId) {
        this.productTypesId = productTypesId;
    }

    public String getProductTypesCode() {
        return productTypesCode;
    }

    public void setProductTypesCode(String productTypesCode) {
        this.productTypesCode = productTypesCode;
    }

    public String getProductTypesName() {
        return productTypesName;
    }

    public void setProductTypeName(String productTypesName) {
        this.productTypesName = productTypesName;
    }

    public int isProductTypesStatus() {
        return productTypesStatus;
    }

    public void setProductTypeStatus(int productTypesStatus) {
        this.productTypesStatus = productTypesStatus;
    }
}
