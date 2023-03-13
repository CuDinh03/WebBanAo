package com.example.quanlykho.service;


import java.util.List;

public interface IService<T> {
    void insert(T t);
    void update(T t, int index);
    void delete(int index );
    List<T> select();
    T findById(int id);

}
