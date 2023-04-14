package com.example.quanlykho.controller;

import com.example.quanlykho.model.Products;
import com.example.quanlykho.service.ProductService;
import org.junit.jupiter.api.Test;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import static org.mockito.Mockito.*;

class CreateProductServletTest {
     //1. Kiểm tra việc tạo sản phẩm thành công:

    @Test
    public void testCreateProductSuccess() throws ServletException, IOException {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        ProductService productService = mock(ProductService.class);

        when(request.getParameter("prCode")).thenReturn("SP001");
        when(request.getParameter("prName")).thenReturn("Sản phẩm 1");
        when(request.getParameter("prPrice")).thenReturn("10000");
        when(request.getParameter("prQuantity")).thenReturn("10");
        when(request.getParameter("prImg")).thenReturn("product.png");
        when(request.getParameter("prDetail")).thenReturn("Chi tiết sản phẩm");
        when(request.getParameter("prDateInput")).thenReturn("2022-01-01");
        when(request.getParameter("prDateEx")).thenReturn("2022-12-31");

        CreateProductServlet servlet = new CreateProductServlet();
        servlet.doPost(request, response);

        verify(productService, times(1)).insert(any(Products.class));
        verify(response, times(1)).sendRedirect("/ShowProductsServlet");
    }

    //2 . Kiểm tra việc tạo sản phẩm không thành công do các trường thông tin thiếu:
    @Test
    public void testCreateProductMissingFields() throws ServletException, IOException {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        ProductService productService = mock(ProductService.class);

        when(request.getParameter("prCode")).thenReturn("");
        when(request.getParameter("prName")).thenReturn("Sản phẩm 1");
        when(request.getParameter("prPrice")).thenReturn("0");
        when(request.getParameter("prQuantity")).thenReturn("10");
        when(request.getParameter("prImg")).thenReturn("");
        when(request.getParameter("prDetail")).thenReturn("Chi tiết sản phẩm");
        when(request.getParameter("prDateInput")).thenReturn("2022-01-01");
        when(request.getParameter("prDateEx")).thenReturn("2022-12-31");

        CreateProductServlet servlet = new CreateProductServlet();
        servlet.doPost(request, response);

        verify(productService, never()).insert(any(Products.class));
        verify(response, times(1)).sendRedirect("/ShowProductsServlet");
    }
//    3. Kiểm tra việc tạo sản phẩm không thành công do ngày nhập không hợp lệ:
    @Test
    public void testCreateProductInvalidDate() throws ServletException, IOException {
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        ProductService productService = mock(ProductService.class);

        when(request.getParameter("prCode")).thenReturn("SP001");
        when(request.getParameter("prName")).thenReturn("Sản phẩm 1");
        when(request.getParameter("prPrice")).thenReturn("10000");
        when(request.getParameter("prQuantity")).thenReturn("10");
        when(request.getParameter("prImg")).thenReturn("product.png");
        when(request.getParameter("prDetail")).thenReturn("Chi tiết sản phẩm");
        when(request.getParameter("prDateInput")).thenReturn("2022-12-31");
        when(request.getParameter("prDateEx")).thenReturn("2022-01-01");

        CreateProductServlet servlet = new CreateProductServlet();
        servlet.doPost(request, response);

        verify(productService, never()).insert(any(Products.class));
        verify(response, times(1)).sendRedirect("/ShowProductsServlet");
    }





}