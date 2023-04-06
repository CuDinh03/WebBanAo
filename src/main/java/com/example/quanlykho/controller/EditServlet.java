package com.example.quanlykho.controller;

import com.example.quanlykho.dao.CRUD_Products;
import com.example.quanlykho.model.Products;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
        String productCode = request.getParameter("prCode1");
        String productName = request.getParameter("prName1");
        double productPrice= Double.parseDouble(request.getParameter("prPrice1"));
        int productQuantity = Integer.parseInt(request.getParameter("prQuantity1"));
        String productImg =  request.getParameter("prImg");
        String productDetail = request.getParameter("prDetail");
        Date productInputDay = Date.valueOf(request.getParameter("prDateInput"));
        Date productExpiry = Date.valueOf(request.getParameter("prDateEx"));


        CRUD_Products.edit(id,productCode,productName,productPrice,productQuantity,productImg,productDetail,productInputDay,productExpiry);
        response.sendRedirect("/ShowProductsServlet");
    }
}
