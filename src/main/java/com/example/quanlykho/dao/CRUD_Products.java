package com.example.quanlykho.dao;

import com.example.quanlykho.model.Cart;
import com.example.quanlykho.model.Products;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class CRUD_Products {
    static Connection connection = Connect_sql.getConnect();
    private Connection connection1;

    public CRUD_Products() {
    }
    public CRUD_Products(Connection connection1) {
        super();
        this.connection1 = connection1;
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
                int productStatus1 = Integer.parseInt(resultSet.getString("productStatus"));

                products.add(new Products(productId1, productCode1,
                        productName1, productPrice1, productQuantity1,
                        productImg1, productDetail1, productInputDay1,
                         productStatus1));
            }
        } catch (SQLException e) {
            e.printStackTrace();

        }
        return products;
    }

    public static void save(Products products) {
        try {
            String sql = " insert into products(productCode,productName,productPrice,productQuantity,productImg,productDetail,productInputDay,productStatus) values (?,?,?,?,?,?,?,1) ";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, products.getProductCode());
            preparedStatement.setString(2, products.getProductName());
            preparedStatement.setDouble(3, products.getProductPrice());
            preparedStatement.setInt(4, products.getProductQuantity());
            preparedStatement.setString(5, products.getProductImg());
            preparedStatement.setString(6, products.getProductDetail());
            preparedStatement.setDate(7, products.getProductInputDay());
            preparedStatement.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void delete(int id){
        try{
            String sql = " UPDATE products SET productStatus = 0 WHERE productId = ? ";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    public static void edit(int productId, String productCode, String productName, double productPrice, int productQuantity, String productImg, String productDetail, Date productInputDay) {
        try {
            String sql = "UPDATE products SET productCode = ? , productName = ? , productPrice = ? , productQuantity = ? , productImg = ? , productDetail = ? , productInputDay = ? WHERE productId = ?  ";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, productCode);
            preparedStatement.setString(2, productName);
            preparedStatement.setDouble(3, productPrice);
            preparedStatement.setInt(4, productQuantity);
            preparedStatement.setString(5, productImg);
            preparedStatement.setString(6, productDetail);
            preparedStatement.setDate(7, productInputDay);
            preparedStatement.setInt(8, productId);
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
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return row;
    }
    public List<Cart> getCartProducts(ArrayList<Cart> cartList) {
        List<Cart> book = new ArrayList<>();
        try {
            if (cartList.size() > 0) {
                for (Cart item : cartList) {
                    String query = "select * from products where productId=?";
                    PreparedStatement pst = this.connection1.prepareStatement(query);
                    pst.setInt(1, item.getId());
                    ResultSet rs = pst.executeQuery();
                    while (rs.next()) {
                        Cart row = new Cart();
                        row.setId(rs.getInt("productId"));
                        row.setProductName(rs.getString("productName"));
                        row.setProductImg(rs.getString("productImg"));
                        row.setProductPrice((int) (rs.getDouble("productPrice")*item.getQuantity()));
                        row.setQuantity(item.getQuantity());
                        book.add(row);
                    }

                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return book;
    }


    public double getTotalCartPrice(ArrayList<Cart> cartList) {
        double sum = 0;
        try {
            if (cartList.size() > 0) {
                for (Cart item : cartList) {
                    String query = "select productPrice from products where productId=?";
                    PreparedStatement pst = this.connection1.prepareStatement(query);
                    pst.setInt(1, item.getId());
                    ResultSet rs = pst.executeQuery();
                    while (rs.next()) {
                        sum+=rs.getDouble("productPrice")*item.getQuantity();
                    }

                }
            }

        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return sum;
    }

    public static List<Products> getProductByName(String productName) {
        List<Products> productList = new ArrayList<>();

        try {
            String sql = "SELECT * FROM products WHERE productName LIKE ?";

            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, "%" + productName + "%"); //
            ResultSet rs = stmt.executeQuery(sql);


            // Duyệt qua các dòng kết quả
            while (rs.next()) {
                int productId = rs.getInt("productId");
                String productCode = rs.getString("productCode");
                String productNameResult = rs.getString("productName");
                double productPrice = rs.getDouble("productPrice");
                int productQuantity = rs.getInt("productQuantity");
                String productImg = rs.getString("productImg");
                String productDetail = rs.getString("productDetail");
                Date productInputDay = rs.getDate("productInputDay");
                int productStatus = rs.getInt("productStatus");

                // Tạo đối tượng Product từ dữ liệu lấy được
                Products product = new Products(productId, productCode, productNameResult, productPrice, productQuantity, productImg, productDetail, productInputDay, productStatus);

                // Thêm sản phẩm vào danh sách
                productList.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return productList;
    }
}
