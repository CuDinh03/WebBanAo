//package com.example.quanlykho.controller;
//
//import com.example.quanlykho.dao.CRUD_Products;
//import com.example.quanlykho.dao.Connect_sql;
//import org.junit.jupiter.api.Test;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//import static org.mockito.Mockito.*;
//
//public class DeleteProductServletTest {
//    @Test
//    public void testDelete() throws SQLException {
//        // mock connection
//        Connection mockConnection = mock(Connection.class);
//        when(Connect_sql.getConnect()).thenReturn(mockConnection);
//
//        // mock PreparedStatement
//        PreparedStatement mockPreparedStatement = mock(PreparedStatement.class);
//        when(mockConnection.prepareStatement(anyString())).thenReturn(mockPreparedStatement);
//
//        // invoke delete method
//        CRUD_Products.delete(1);
//
//        // verify the PreparedStatement was executed with the correct parameters
//        verify(mockPreparedStatement).setInt(1, 1);
//        verify(mockPreparedStatement).executeUpdate();
//    }
//
//}
