package com.example.quanlykho.dao;

import com.example.quanlykho.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {
    public  static User login(String username , String password){
        try {
            String sql = "select * from users where userName = ? and passWord = ?";
            Connection connection = Connect_sql.getConnect();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,username);
            preparedStatement.setString(2,password);

            ResultSet resultSet = preparedStatement.executeQuery();
            User users = null;

            if (resultSet.next()){
                int idUser1 = resultSet.getInt("id");
                String username1 = resultSet.getString("userName");
                String password1 = resultSet.getString("passWord");
                int status = resultSet.getInt("status");
                users = new User(idUser1,username1,password1,status);
            }
            return users;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
