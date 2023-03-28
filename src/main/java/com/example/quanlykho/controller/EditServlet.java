package com.example.quanlykho.controller;

import com.example.quanlykho.dao.CRUD_Products;
import com.example.quanlykho.model.Products;
import com.example.quanlykho.service.ProductService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Date;

@WebServlet(name = "EditServlet", value = "/EditServlet")
public class EditServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        CRUD_Products crud_product = new CRUD_Products();
        Products product = crud_product.getSingleProduct(id);
        request.setAttribute("pr",product);
        request.getRequestDispatcher("edit.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id1"));
        String productCode = request.getParameter("prCode");
        String productName = request.getParameter("prName");
        double productPrice= Double.parseDouble(request.getParameter("prPrice"));
        int productQuantity = Integer.parseInt(request.getParameter("prQuantity"));
        String productImg =  request.getParameter("prImg");
        String productDetail = request.getParameter("prDetail");
        Date productInputDay = Date.valueOf(request.getParameter("prDateInput"));
        Date productExpiry = Date.valueOf(request.getParameter("prDateEx"));


        CRUD_Products.edit(id,productCode,productName,productPrice,productQuantity,productImg,productDetail,productInputDay,productExpiry);
        response.sendRedirect("/ProductServlet");
    }
}
