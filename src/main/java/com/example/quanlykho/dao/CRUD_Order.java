package com.example.quanlykho.dao;

import com.example.quanlykho.model.Order;
import com.example.quanlykho.model.User;
import com.example.quanlykho.model.Items;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CRUD_Order {

    private Connection connection;



    public CRUD_Order() {
        connection = Connect_sql.getConnect();
    }

    // Create a new order
    public void createOrder(Order order) {
        String sql = "INSERT INTO orders (user_id, total_amount, date, status) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setInt(1, order.getUser().getId());
            statement.setBigDecimal(2, order.getTotalAmount());
            statement.setDate(3, new java.sql.Date(order.getDate().getTime()));
            statement.setInt(4, order.getStatus());
            statement.executeUpdate();

            ResultSet generatedKeys = statement.getGeneratedKeys();
            if (generatedKeys.next()) {
                order.setId(generatedKeys.getInt(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Read an order by ID
    public Order getOrderById(int orderId) {
        String sql = "SELECT * FROM orders WHERE id = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, orderId);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                return mapOrder(resultSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    // Read all orders
    public List<Order> getAllOrders() {
        List<Order> orders = new ArrayList<>();
        String sql = "SELECT * FROM orders";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Order order = mapOrder(resultSet);
                orders.add(order);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return orders;
    }

    // Update an order
    public void updateOrder(Order order) {
        String sql = "UPDATE orders SET user_id = ?, total_amount = ?, date = ?, status = ? WHERE id = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, order.getUser().getId());
            statement.setBigDecimal(2, order.getTotalAmount());
            statement.setDate(3, new java.sql.Date(order.getDate().getTime()));
            statement.setInt(4, order.getStatus());
            statement.setInt(5, order.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Delete an order
    public void deleteOrder(int orderId) {
        String sql = "DELETE FROM orders WHERE id = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, orderId);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Helper method to map the current row of ResultSet to an Order object
    private Order mapOrder(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("id");
        int userId = resultSet.getInt("user_id");
        BigDecimal totalAmount = resultSet.getBigDecimal("total_amount");
        Date date = resultSet.getDate("date");
        int status = resultSet.getInt("status");

        User user = getUserById(userId);  // Assuming you have a UserDAO class to fetch the user by ID
        List<Items> items = getItemsByOrderId(id);  // Assuming you have a separate tableto store order items and a method in another DAO class to fetch items by order ID.

        Order order = new Order(id, user, items, totalAmount, date, status);
        return order;
    }

    // Helper method to fetch user by ID
    private User getUserById(int userId) {
        CRUD_User userDAO = new CRUD_User();  // Assuming you have a UserDAO class
        return userDAO.getUserById(userId);
    }

    // Helper method to fetch items by order ID
    private List<Items> getItemsByOrderId(int orderId) {
        // Implement the logic to fetch items by order ID using another DAO class or directly in this method
        return new ArrayList<>();  // Placeholder implementation
    }
}
