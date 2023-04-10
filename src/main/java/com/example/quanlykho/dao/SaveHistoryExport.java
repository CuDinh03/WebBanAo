package com.example.quanlykho.dao;

import com.example.quanlykho.model.HistoryExport;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SaveHistoryExport {

    static Connection connection = Connect_sql.getConnect();

    public static void save (HistoryExport historyExport){
        try {
            String sql = "insert into historyExport(hsCode,hsName,date,prName,wrName,quantity)values (?,?,?,?,?,?) ";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, historyExport.getHsCode());
            preparedStatement.setString(2, historyExport.getHsName());
            preparedStatement.setDate(3, historyExport.getDate());
            preparedStatement.setString(4, historyExport.getPrName());
            preparedStatement.setString(5, historyExport.getWrName());
            preparedStatement.setInt(6, historyExport.getQuantity());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    public static List<HistoryExport> getAll() {
        String sql = " Select * from  historyExport  ";
        List<HistoryExport> historyExports = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                String hsCode = resultSet.getString(1);
                String hsName = resultSet.getString(2);
                Date date = resultSet.getDate(3);
                String prName = resultSet.getString(4);
                String wrName = resultSet.getString(5);
                int quantity = resultSet.getInt(6);
                historyExports.add(new HistoryExport( hsCode, hsName,date,prName,wrName,quantity));
            }


        } catch (SQLException e) {
            e.printStackTrace();

        }
        return historyExports;
    }

}
