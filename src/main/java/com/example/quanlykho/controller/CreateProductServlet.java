package com.example.quanlykho.controller;

import com.example.quanlykho.model.Products;
import com.example.quanlykho.service.ProductService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Date;
// servlet tao san pham
@WebServlet(name = "CreateProductServlet", value = "/CreateProductServlet")
public class CreateProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productCode = request.getParameter("prCode");
        String productName = request.getParameter("prName");
        double productPrice= Double.parseDouble(request.getParameter("prPrice"));
        int productQuantity = Integer.parseInt(request.getParameter("prQuantity"));
        String productImg =  request.getParameter("prImg");
        String productDetail = request.getParameter("prDetail");
        Date productInputDay = Date.valueOf(request.getParameter("prDateInput"));
        Date productExpiry = Date.valueOf(request.getParameter("prDateEx"));

        if (productCode.isEmpty()||productName.isEmpty()||productPrice == 0|| productQuantity ==0||productImg.isEmpty()
                || productDetail.isEmpty() || productExpiry.before(productInputDay) || productInputDay.after(new java.util.Date())){
            response.sendRedirect("/ShowProductsServlet");
        }else {
            ProductService service = new ProductService();
            service.insert(new Products(productCode,productName,productPrice,
                    productQuantity,productImg,productDetail,productInputDay,productExpiry,1));
            response.sendRedirect("/ShowProductsServlet");

        }
    }
}
