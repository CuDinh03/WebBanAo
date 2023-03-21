package com.example.quanlykho.dao;

import com.example.quanlykho.model.ProductTypes;
import com.example.quanlykho.model.Products;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class CRUD_Products {
    static Connection connection = Connect_sql.getConnect();

    public CRUD_Products() {
    }

    public static List<Products> getAll(){
        String sql = " Select * from products where status = 1 ";
        List<Products> products = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                 int productId1 = resultSet.getInt("productId");
                 String productCode1 = resultSet.getString("productCode");
                 String productName1 = resultSet.getString("productName");
                 double productPrice1 = Double.parseDouble(resultSet.getString("productPrice"));
                 int productQuantity1 = Integer.parseInt(resultSet.getString("productQuantity"));
                 String productImg1 = resultSet.getString("productImg");
                 String productDetail1 = resultSet.getString("productDetail");
                 String productInputDay1 = resultSet.getString("productInputDay");
                 Date productExpiry1 = resultSet.getDate("productExpiry");
                 ProductTypes productTypes1 = (ProductTypes) resultSet.getObject("productTypes");
                 int productStatus1  = Integer.parseInt(resultSet.getString("productStatus"));

                 products.add(new Products(productId1,productCode1,
                         productName1,productPrice1,productQuantity1,
                         productImg1,productDetail1,productInputDay1,
                         productExpiry1,productTypes1,productStatus1));
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return  products;
    }
}
