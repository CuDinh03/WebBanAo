package com.example.quanlykho.controller;

import com.example.quanlykho.dao.CRUD_Products;
import com.example.quanlykho.dao.CRUD_WareHouse;
import com.example.quanlykho.model.Products;
import com.example.quanlykho.model.Warehouse;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "EditWrServlet", value = "/EditWrServlet")
public class EditWrServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        CRUD_WareHouse crud_wareHouse = new CRUD_WareHouse();
        Warehouse warehouse = crud_wareHouse.getSingleProduct(id);
        request.setAttribute("w", warehouse);
        request.getRequestDispatcher("editWr.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id1 = Integer.parseInt(request.getParameter("idWr"));
        String wrCode = request.getParameter("codeWr");
        String wrName = request.getParameter("nameWr");
        String wrLocation = request.getParameter("locationWr");

        for (Warehouse w:
                CRUD_WareHouse.getAll()) {
            if (wrCode.equals(w.getWareHouseCode())) {
                CRUD_WareHouse.edit(id1, wrCode, wrName,wrLocation);
                response.sendRedirect("/ShowWarehouseServlet");
                break;
            }
        }
    }
}
