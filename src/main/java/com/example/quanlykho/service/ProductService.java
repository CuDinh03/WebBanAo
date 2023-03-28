package com.example.quanlykho.service;

import com.example.quanlykho.dao.CRUD_Products;
import com.example.quanlykho.model.Products;

import java.util.List;

public class ProductService implements IService<Products>{
    @Override
    public void insert(Products products) {
        CRUD_Products.save(products);
    }

    @Override
    public void update(Products products, int index) {
        CRUD_Products.edit(products.getProductId(), products.getProductCode(), products.getProductName(), products.getProductPrice(), products.getProductQuantity(), products.getProductImg(), products.getProductDetail(), products.getProductInputDay(),products.getProductExpiry());
    }

    @Override
    public void delete(int index) {
        CRUD_Products.delete(index);
    }

    @Override
    public List<Products> select() {
        return CRUD_Products.getAll();
    }

    @Override
    public Products findById(int id) {
        return null;
    }
}
