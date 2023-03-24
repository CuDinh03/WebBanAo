package com.example.quanlykho.controller;

import com.example.quanlykho.dao.CRUD_Products;
import com.example.quanlykho.model.Products;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ShowProductsServlet", value = "/ShowProductsServlet")
public class ShowProductsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Products> list = CRUD_Products.getAll();
        request.setAttribute("products", list);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/tables.jsp");
        dispatcher.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
