package com.example.quanlykho.service;

import com.example.quanlykho.model.Products;

import java.util.List;

public class ProductService implements IService<Products>{
    static List<Products> list = null;
    @Override
    public void insert(Products products) {
        list.add(products);
    }

    @Override
    public void update(Products products, int index) {
        list.set(index,products);
    }

    @Override
    public void delete(int index) {
        list.remove(index);
    }

    @Override
    public List<Products> select() {
        return list;
    }

    @Override
    public Products findById(int id) {
        return null;
    }
}
