package com.example.quanlykho.service;

import com.example.quanlykho.dao.CRUD_WareHouse;
import com.example.quanlykho.model.Warehouse;

import java.util.List;

public class WarehouseService implements IService<Warehouse>{
    @Override
    public void insert(Warehouse warehouse) {

    }

    @Override
    public void update(Warehouse warehouse, int index) {

    }

    @Override
    public void delete(int index) {

    }

    @Override
    public List<Warehouse> select() {
        return CRUD_WareHouse.getAll();
    }

    @Override
    public Warehouse findById(int id) {
        return null;
    }
}
