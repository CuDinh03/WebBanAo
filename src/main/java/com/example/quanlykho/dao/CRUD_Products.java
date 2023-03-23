package com.example.quanlykho.dao;

import com.example.quanlykho.model.ProductTypes;
import com.example.quanlykho.model.Products;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class CRUD_Products {
    static Connection connection = Connect_sql.getConnect();

    public CRUD_Products() {
    }

    public static List<Products> getAll() {
        String sql = " Select * from products where productStatus = 1 ";
        List<Products> products = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int productId1 = resultSet.getInt("productId");
                String productCode1 = resultSet.getString("productCode");
                String productName1 = resultSet.getString("productName");
                double productPrice1 = Double.parseDouble(resultSet.getString("productPrice"));
                int productQuantity1 = Integer.parseInt(resultSet.getString("productQuantity"));
                String productImg1 = resultSet.getString("productImg");
                String productDetail1 = resultSet.getString("productDetail");
                Date productInputDay1 = resultSet.getDate("productInputDay");
                Date productExpiry1 = resultSet.getDate("productExpiry");
                ProductTypes productTypes1 = (ProductTypes) resultSet.getObject("productTypes");
                int productStatus1 = Integer.parseInt(resultSet.getString("productStatus"));

                products.add(new Products(productId1, productCode1,
                        productName1, productPrice1, productQuantity1,
                        productImg1, productDetail1, productInputDay1,
                        productExpiry1, productTypes1, productStatus1));
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return products;
    }

    public static void save(Products products) {
        try {
            String sql = " insert into product(productCode,productName,productPrice,productQuantity,productImg,productDetail,productInputDay,productExpiry,productTypes,productStatus) values (?,?,?,?,?,?,?,?,?,1) ";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, products.getProductCode());
            preparedStatement.setString(2, products.getProductName());
            preparedStatement.setDouble(3, products.getProductPrice());
            preparedStatement.setInt(4, products.getProductQuantity());
            preparedStatement.setString(5, products.getProductImg());
            preparedStatement.setString(6, products.getProductDetail());
            preparedStatement.setDate(7, products.getProductInputDay());
            preparedStatement.setDate(8, products.getProductExpiry());
            preparedStatement.setInt(9, products.getProductTypes().getProductTypesId());
            preparedStatement.execute();
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
    }

    public static void delete(int id){
        try{
            String sql = " UPDATE products SET productStatus = 0 WHERE productId = ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
    }

    public static void edit(int productId, String productCode, String productName, double productPrice, int productQuantity, String productImg, String productDetail, Date productInputDay, Date productExpiry, int productTypes){
    try{
        String sql = "UPDATE products SET productCode = ? , productName = ? , productPrice = ? , productQuantity = ? , productImg = ? , productDetail = ? , productInputDay = ? , productExpiry = ? , productTypes = ? WHERE productId = ?  ";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,productCode);
        preparedStatement.setString(2,productName);
        preparedStatement.setDouble(3,productPrice);
        preparedStatement.setInt(4,productQuantity);
        preparedStatement.setString(5,productImg);
        preparedStatement.setString(6,productDetail);
        preparedStatement.setDate(7,productInputDay);
        preparedStatement.setDate(8,productExpiry);
        preparedStatement.setInt(9,productTypes);
        preparedStatement.execute();
    }catch (SQLException throwables){
        throwables.printStackTrace();
    }
    }
}
