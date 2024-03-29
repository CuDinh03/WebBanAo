package com.example.quanlykho.controller;

import com.example.quanlykho.dao.CRUD_WareHouse;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
@WebServlet(name = "DeleteWarehouseServlet", value = "/DeleteWarehouseServlet")

public class DeleteWarehouseServlet extends HttpServlet {
        @Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            int id = Integer.parseInt(request.getParameter("id"));
            CRUD_WareHouse.delete(id);
            response.sendRedirect("/ShowWarehouseServlet");
        }

        @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        }
    }

