package com.example.quanlykho.dao;

import com.example.quanlykho.model.Accounts;
import com.example.quanlykho.model.Warehouse;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CRUD_Account {
    private static final String INSERT_SQL = "INSERT INTO accounts (accountName, userId, status) VALUES ( ?, ?, ?)";
    private static final String SELECT_ALL_SQL = "SELECT * FROM accounts";
    private static final String SELECT_BY_ID_SQL = "SELECT * FROM accounts WHERE accountId = ?";
    private static final String UPDATE_SQL = "UPDATE accounts SET accountName = ?, informationAccount = ?, userId = ?, status = ? WHERE id = ?";
    private static final String DELETE_SQL = "DELETE FROM accounts WHERE id = ?";

    public static void save(Accounts account) {
        Connection connection = Connect_sql.getConnect();
        if (connection == null) {
            return;
        }

        try {
            PreparedStatement statement = connection.prepareStatement(INSERT_SQL);
            statement.setString(1, account.getAccountName());
            statement.setInt(2, account.getUserId());
            statement.setInt(3, account.getStatus());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeConnection(connection);
        }
    }

    public static List<Accounts> getAll() {
        Connection connection = Connect_sql.getConnect();
        if (connection == null) {
            return new ArrayList<>();
        }

        List<Accounts> accountsList = new ArrayList<>();
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_ALL_SQL);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String accountName = resultSet.getString("accountName");
                String infor = resultSet.getString("informationAccount");
                int warehouseId = resultSet.getInt("warehouseList");
                int userId = resultSet.getInt("userId");
                int status = resultSet.getInt("status");

                Warehouse warehouse = getWarehouseById(warehouseId);

                Accounts account = new Accounts(id, accountName, infor, warehouse, userId, status);
                accountsList.add(account);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeConnection(connection);
        }

        return accountsList;
    }

    public static Accounts getById(int id) {
        Connection connection = Connect_sql.getConnect();
        if (connection == null) {
            return null;
        }

        Accounts account = null;
        try {
            PreparedStatement statement = connection.prepareStatement(SELECT_BY_ID_SQL);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                String accountName = resultSet.getString("accountName");
                String infor = resultSet.getString("informationAccount");
                int warehouseId = resultSet.getInt("warehouseList");
                int userId = resultSet.getInt("userId");
                int status = resultSet.getInt("status");

                Warehouse warehouse = getWarehouseById(warehouseId);

                account = new Accounts(id, accountName, infor, warehouse, userId, status);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeConnection(connection);
        }

        return account;
    }

    public static void update(Accounts account) {
        Connection connection = Connect_sql.getConnect();
        if (connection == null) {
            return;
        }

        try {
            PreparedStatement statement = connection.prepareStatement(UPDATE_SQL);
            statement.setString(1, account.getAccountName());
            statement.setString(2, account.getInfor());
            statement.setInt(3, account.getUserId());
            statement.setInt(4, account.getStatus());
            statement.setInt(5, account.getId());
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeConnection(connection);
        }
    }

    public static void delete(int id) {
        Connection connection = Connect_sql.getConnect();
        if (connection == null) {
            return;
        }

        try {
            PreparedStatement statement = connection.prepareStatement(DELETE_SQL);
            statement.setInt(1, id);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeConnection(connection);
        }
    }

    private static Warehouse getWarehouseById(int id) {
        // Hàm này để lấy thông tin kho hàng dựa trên id, bạn cần triển khai logic của nó
        // để truy vấn và trả về đối tượng Warehouse tương ứng với id được cung cấp.
        // Trong ví dụ này, tôi giả định rằng đã có một lớp CRUD_Warehouse tương tự để xử lý
        // các thao tác CRUD cho đối tượng Warehouse.
        // Bạn có thể tùy chỉnh hàm này để phù hợp với cấu trúc cơ sở dữ liệu và logic của bạn.
        // Dưới đây là một mẫu tạm thời:

        // return CRUD_Warehouse.getById(id);

        return null;
    }

    private static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
