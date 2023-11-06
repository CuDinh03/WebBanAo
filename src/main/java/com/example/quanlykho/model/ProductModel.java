package com.example.quanlykho.model;

import com.example.quanlykho.dao.CRUD_Products;

import java.util.List;

public class ProductModel {

    private List<Products> list;

    public ProductModel() {
        this.list = CRUD_Products.getAll();
    }

    public ProductModel(List<Products> list) {
        this.list = list;
    }

    public Products find(int id ){
        for (Products product: list){
            if (product.getProductId() == id){
                return product;
            }
        }
        return null;
    }

}
