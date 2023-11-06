package com.example.quanlykho.dao;

import com.example.quanlykho.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CRUD_User {
    static Connection connection = Connect_sql.getConnect();

    public static List<User> getAll() {
        String sql = "Select * from users where status = 0";
        List<User> users = new ArrayList<>();
        try {
            // tạo cái xe để đưa câu lệnh sql qua CSDL
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("iduser");
                String name = resultSet.getString("nameUser");

                String username = resultSet.getString("userName");
                String password = resultSet.getString("passWord");
                String contact = resultSet.getString("contact");
                String address = resultSet.getString("address");
                String email = resultSet.getString("email");
                String img = resultSet.getString("img");
                int role = resultSet.getInt("role");
                users.add(new User(id, name, username, password,contact, address, email,img,role, 0));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return users;
    }

    public static void save(User user) {
        try {
            String sql = "insert into users (userName,passWord ,status) values (?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, user.getUserName());
            preparedStatement.setString(2, user.getPassWord());
            preparedStatement.setInt(3,user.getStatus());
            preparedStatement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void edit(int id, String name,String email, String phone , String img, String address) {
        try {

            String sql = "UPDATE users SET nameuser = ? , contact = ? , address = ?, email = ? , img = ? WHERE idUser = ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,name);
            preparedStatement.setString(2,phone);
            preparedStatement.setString(3,address);
            preparedStatement.setString(4,email);
            preparedStatement.setString(5,img);
            preparedStatement.setInt(6,id);
            preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }

    public User getUserById(int userId) {
        String sql = "SELECT * FROM users WHERE id = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, userId);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                return mapUser(resultSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    private User mapUser(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("id");
        String userName = resultSet.getString("userName");
        String passWord = resultSet.getString("passWord");
        int status = resultSet.getInt("status");

        return new User(id, userName, passWord, status);
    }
    public static void delete(int id) {
        try {

            String sql = "UPDATE users SET status = 1 WHERE iduser = ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }

}
