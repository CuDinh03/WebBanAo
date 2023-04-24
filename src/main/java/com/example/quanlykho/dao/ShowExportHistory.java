package com.example.quanlykho.dao;

import com.example.quanlykho.model.HistoryExport;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ShowExportHistory {
    static Connection connection = Connect_sql.getConnect();



    public ShowExportHistory() {
        
    }
    public static void saveHistory(HistoryExport export){
        try{
            String sql = " insert into historyExport (hsCode,hsName,date,prName,wrName,quantity) values (?,?,?,?,?,?) ";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,export.getHsCode());
            preparedStatement.setString(2,export.getHsName());
            preparedStatement.setDate(3,export.getDate());
            preparedStatement.setString(4, export.getPrName());
            preparedStatement.setString(5, export.getWrName());
            preparedStatement.setInt(6,export.getQuantity());
            preparedStatement.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
    public static List<HistoryExport> getAll() {
        String sql = " Select * from historyExport ";
        List<HistoryExport> historyExports = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String code = resultSet.getString("hsCode");
                String hsName = resultSet.getString("hsName");
                Date date = resultSet.getDate("date");
                String prName = resultSet.getString("prName");
                String wrName = resultSet.getString("wrName");
                int quantity = resultSet.getInt("quantity");

                historyExports.add(new HistoryExport(id,code,hsName,date,prName,wrName,quantity));
             }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return historyExports;
    }
}
