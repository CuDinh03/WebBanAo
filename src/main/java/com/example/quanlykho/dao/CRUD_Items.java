package com.example.quanlykho.dao;

import com.example.quanlykho.model.Items;
import com.example.quanlykho.model.Products;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CRUD_Items {
    static Connection connection = Connect_sql.getConnect();



    public CRUD_Items() {
        this.connection = Connect_sql.getConnect();
    }


    // Create a new item
    public static void createItem(Items item) {
        String sql = "INSERT INTO items (user_name, product_id, quantity, date) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, item.getUserName());
            statement.setInt(2, item.getProducts().getProductId());
            statement.setInt(3, item.getQuantity());
            statement.setDate(4,item.getDate());
            statement.executeUpdate();

            ResultSet generatedKeys = statement.getGeneratedKeys();
            if (generatedKeys.next()) {
                item.setId(generatedKeys.getInt(1));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Read an item by ID
    public static Items getItemByUsername(String username) {
        String sql = "SELECT * FROM items WHERE user_name = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                return mapItem(resultSet);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    // Read all items
    public static List<Items> getAllItems() {
        List<Items> items = new ArrayList<>();
        String sql = "SELECT * FROM items";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Items item = mapItem(resultSet);
                items.add(item);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return items;
    }

    // Update an item
    public static void updateItem(Items item) {
        String sql = "UPDATE items SET user_name = ?, product_id = ?, quantity = ?, date = ? WHERE id = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setString(1, item.getUserName());
            statement.setInt(2, item.getProducts().getProductId());
            statement.setInt(3, item.getQuantity());
            statement.setDate(4, new java.sql.Date(item.getDate().getTime()));
            statement.setInt(5, item.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Delete an item
    public static void deleteItem(int itemId) {
        String sql = "DELETE FROM items WHERE id = ?";
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, itemId);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Helper method to map the current row of ResultSet to an Item object
    private static Items mapItem(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("id");
        String userName = resultSet.getString("user_name");
        int productId = resultSet.getInt("product_id");
        int quantity = resultSet.getInt("quantity");
        Date date = resultSet.getDate("date");

        CRUD_Products productsDAO = new CRUD_Products();  // Assuming you have a ProductsDAO class
        Products product = productsDAO.getSingleProduct(productId);

        return new Items(userName, product, quantity, date);
    }
}

