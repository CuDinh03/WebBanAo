package com.example.quanlykho.dao;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.assertNotNull;

class Connect_sqlTest {

    @Test
    void getConnect() {
        Connection conn = Connect_sql.getConnect();
        assertNotNull(conn);
        try {
            conn.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
