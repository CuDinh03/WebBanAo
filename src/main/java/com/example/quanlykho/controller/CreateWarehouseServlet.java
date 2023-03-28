package com.example.quanlykho.controller;

import com.example.quanlykho.model.Products;
import com.example.quanlykho.service.ProductService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Date;
import java.time.LocalDateTime;
// servlet kho

@WebServlet(name = "CreateWarehouseServlet", value = "/CreateWarehouseServlet")
public class CreateWarehouseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
