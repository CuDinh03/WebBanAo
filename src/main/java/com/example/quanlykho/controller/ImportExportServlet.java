package com.example.quanlykho.controller;

import com.example.quanlykho.dao.CRUD_Products;
import com.example.quanlykho.model.Products;
import com.example.quanlykho.service.ProductService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ImportExportServlet", value = "/ImportExportServlet")
public class ImportExportServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ProductService productService = new ProductService();
        List<Products> list = productService.select();
        request.setAttribute("products", list);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/export.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productCode = request.getParameter("prCode");
        int prQuantity = Integer.parseInt(request.getParameter("prQuantity"));

        ProductService service = new ProductService();
        boolean responseSent = false;
        for (Products p : CRUD_Products.getAll()) {
            if (p.getProductCode().equals(productCode)) {
                if (prQuantity <= p.getProductQuantity()) {
                    service.changeQuantity(prQuantity, productCode);
                    response.sendRedirect("/HistoryExportServlet");
                    responseSent = true;
                    break;
                }
            }
        }
        if (!responseSent) {
            response.sendRedirect("/ImportExportServlet");
        }
    }
}
