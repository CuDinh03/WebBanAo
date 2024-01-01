package com.example.quanlykho.controller;

import com.example.quanlykho.dao.CRUD_Products;
import com.example.quanlykho.model.Products;
import com.example.quanlykho.service.ProductService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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


        if (productCode.isEmpty()||productName.isEmpty()||productPrice == 0|| productQuantity ==0||productImg.isEmpty()
                || productDetail.isEmpty() || productInputDay.after(new java.util.Date())){
            response.sendRedirect("/ShowProductsServlet");
        }
        for (Products p:
                CRUD_Products.getAll()) {
            if (p.getProductCode().equals(productCode) ){

            }else {
                ProductService service = new ProductService();
                service.insert(new Products(productCode,productName,productPrice,
                        productQuantity,productImg,productDetail,productInputDay,1));
                response.sendRedirect("/ShowProductsServlet");
                break;
            }
        }

    }
}
