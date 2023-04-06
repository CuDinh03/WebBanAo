package com.example.quanlykho.controller;

import com.example.quanlykho.model.Warehouse;
import com.example.quanlykho.service.WarehouseService;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(name = "ShowWarehouseServlet", value = "/ShowWarehouseServlet")
public class ShowWarehouseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        WarehouseService warehouseService = new WarehouseService();
        List<Warehouse> list = warehouseService.select();
        request.setAttribute("warehouses", list);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/tables2.jsp");
        dispatcher.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
