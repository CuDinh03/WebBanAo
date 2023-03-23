package com.example.quanlykho.dao;

import com.example.quanlykho.model.Users;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {
    public  static Users login(String username , String password){
        try {
            String sql = "select * from users where username = ? and password = ?";
            Connection connection = Connect_sql.getConnect();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,username);
            preparedStatement.setString(1,password);

            ResultSet resultSet = preparedStatement.executeQuery();
            Users users = null;

            if (resultSet.next()){
                int idUser1 = resultSet.getInt(1);
                String username1 = resultSet.getString(2);
                String password1 = resultSet.getString(3);
                users = new Users(idUser1,username1,password1);
            }
            return users;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
