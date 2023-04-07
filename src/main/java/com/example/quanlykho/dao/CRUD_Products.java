package com.example.quanlykho.dao;

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
                int productStatus1 = Integer.parseInt(resultSet.getString("productStatus"));

                products.add(new Products(productId1, productCode1,
                        productName1, productPrice1, productQuantity1,
                        productImg1, productDetail1, productInputDay1,
                        productExpiry1, productStatus1));
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return products;
    }

    public static void save(Products products) {
        try {
            String sql = " insert into products(productCode,productName,productPrice,productQuantity,productImg,productDetail,productInputDay,productExpiry,productStatus) values (?,?,?,?,?,?,?,?,1) ";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, products.getProductCode());
            preparedStatement.setString(2, products.getProductName());
            preparedStatement.setDouble(3, products.getProductPrice());
            preparedStatement.setInt(4, products.getProductQuantity());
            preparedStatement.setString(5, products.getProductImg());
            preparedStatement.setString(6, products.getProductDetail());
            preparedStatement.setDate(7, products.getProductInputDay());
            preparedStatement.setDate(8, products.getProductExpiry());
            preparedStatement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void delete(int id) {
        try {
            String sql = " UPDATE products SET productStatus = 0 WHERE productId = ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void edit(int productId, String productCode, String productName, double productPrice, int productQuantity, String productImg, String productDetail, Date productInputDay, Date productExpiry) {
        try {
            String sql = "UPDATE products SET productCode = ? , productName = ? , productPrice = ? , productQuantity = ? , productImg = ? , productDetail = ? , productInputDay = ? , productExpiry = ? WHERE productId = ?  ";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, productCode);
            preparedStatement.setString(2, productName);
            preparedStatement.setDouble(3, productPrice);
            preparedStatement.setInt(4, productQuantity);
            preparedStatement.setString(5, productImg);
            preparedStatement.setString(6, productDetail);
            preparedStatement.setDate(7, productInputDay);
            preparedStatement.setDate(8, productExpiry);
            preparedStatement.setInt(9, productId);
            preparedStatement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    public static void editQuantity(String productCode, int productQuantity) {
        try {
            String sql = "UPDATE products SET productQuantity = ? WHERE productCode like ?  ";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, productQuantity);
            preparedStatement.setString(2, productCode);
            preparedStatement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public Products getSingleProduct(int id) {
        Products row = null;
        try {
            String query = "select * from products where productId=? ";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                row = new Products();
                row.setProductId(rs.getInt("productId"));
                row.setProductCode(rs.getString("productCode"));
                row.setProductName(rs.getString("productName"));
                row.setProductPrice(Double.parseDouble(rs.getString("productPrice")));
                row.setProductQuantity(Integer.parseInt(rs.getString("productQuantity")));
                row.setProductImg(rs.getString("productImg"));
                row.setProductDetail(rs.getString("productDetail"));
                row.setProductInputDay(Date.valueOf(String.valueOf(rs.getDate("productInputDay"))));
                row.setProductExpiry(Date.valueOf(String.valueOf(rs.getDate("productExpiry"))));

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return row;
    }
}
