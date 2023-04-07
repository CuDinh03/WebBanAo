package com.example.quanlykho.controller;

import com.example.quanlykho.dao.CRUD_Products;
import com.example.quanlykho.dao.CRUD_WareHouse;
import com.example.quanlykho.model.Products;
import com.example.quanlykho.model.Warehouse;
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
        String wrCode = request.getParameter("wrCode");
        String wrName = request.getParameter("wrName");
        String wrAddress = request.getParameter("wrAddress");


        if (wrCode.isEmpty()||wrName.isEmpty()||
                wrAddress.isEmpty() ){
            response.sendRedirect("/ShowWarehouseServlet");
        }
        for (Products p:
                CRUD_Products.getAll()) {
            if (p.getProductCode().equals(wrCode) ){

            }else {
                CRUD_WareHouse.save(new Warehouse(wrCode, wrName,wrAddress,1));
                response.sendRedirect("/ShowWarehouseServlet");
                break;
            }
        }


    }
}
