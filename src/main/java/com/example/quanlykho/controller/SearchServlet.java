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
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "SearchServlet", value = "/SearchServlet")
public class SearchServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String keyword = request.getParameter("keyword");
        List<Products> searchResults = new ArrayList<>();
        List<Products> productList = CRUD_Products.getProductByName(keyword);

        // Thực hiện quá trình tìm kiếm trong danh sách sản phẩm
        for (Products product : productList) {
            if (product.getProductName().contains(keyword)) {
                searchResults.add(product);
            }
        }

        // Lưu kết quả tìm kiếm vào thuộc tính của request để truyền cho trang kết quả tìm kiếm
        request.setAttribute("searchResults", searchResults);

        // Chuyển hướng đến trang kết quả tìm kiếm
        RequestDispatcher dispatcher = request.getRequestDispatcher("/search_results.jsp");
        dispatcher.forward(request, response);
    }
}
