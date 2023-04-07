package com.example.quanlykho.dao;


import com.example.quanlykho.model.Products;
import com.example.quanlykho.model.Warehouse;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CRUD_WareHouse {

    static Connection connection = Connect_sql.getConnect();

    public CRUD_WareHouse() {
    }

    public static List<Warehouse> getAll() {
        String sql = " Select * from warehouses where wareHouseStatus = 1 ";
        List<Warehouse> warehouses = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int wareHouseId1 = resultSet.getInt("wareHouseId");
                String wareHouseCode1 = resultSet.getString("wareHouseCode");
                String wareHouseName1 = resultSet.getString("wareHouseName");
                String wareHouseLocation1 = resultSet.getString("wareHouseLocation");
                int wareHouseStatus1 = Integer.parseInt(resultSet.getString("wareHouseStatus"));

                warehouses.add(new Warehouse(wareHouseId1, wareHouseCode1,
                        wareHouseName1, wareHouseLocation1,
                        wareHouseStatus1));
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return warehouses;
    }

    public static void save(Warehouse warehouses) {
        try {
            String sql = " insert into warehouses(wareHouseCode,wareHouseName,wareHouseLocation,wareHouseStatus) values (?,?,?,1) ";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, warehouses.getWareHouseCode());
            preparedStatement.setString(2, warehouses.getWareHouseName());
            preparedStatement.setString(3, warehouses.getWareHouseLocation());

            preparedStatement.execute();
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
    }

    public static void delete(int id){
        try{
            String sql = " UPDATE warehouses SET wareHouseStatus = 0 WHERE wareHouseId = ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            preparedStatement.executeUpdate();
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
    }

    public static void edit(int wareHouseId, String wareHouseCode, String wareHouseName, String wareHouseLocation){
        try{
            String sql = "UPDATE warehouses SET wareHouseCode = ? , wareHouseName = ? , wareHouseLocation = ?, WHERE wareHouseId = ?  ";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,wareHouseCode);
            preparedStatement.setString(2,wareHouseName);
            preparedStatement.setString(3,wareHouseLocation);
            preparedStatement.setInt(4,wareHouseId);

            preparedStatement.execute();
        }catch (SQLException throwables){
            throwables.printStackTrace();
        }
    }

    public Warehouse getSingleProduct(int id) {
        Warehouse row = null;
        try {
            String query = "select * from warehouses where wareHouseId=? ";

            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();

            while (rs.next()) {
                row = new Warehouse();
                row.setWareHouseId(rs.getInt("wareHouseId"));
                row.setWareHouseCode(rs.getString("wareHouseCode"));
                row.setWareHouseName(rs.getString( "wareHouseName"));
                row.setWareHouseLocation(rs.getString( "wareHouseLocation"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return row;
    }

}

