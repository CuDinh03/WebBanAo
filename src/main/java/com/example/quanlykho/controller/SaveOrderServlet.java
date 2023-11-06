package com.example.quanlykho.controller;

import com.example.quanlykho.dao.CRUD_Items;
import com.example.quanlykho.dao.CRUD_Order;
import com.example.quanlykho.dao.CRUD_Products;
import com.example.quanlykho.model.Items;
import com.example.quanlykho.model.Order;
import com.example.quanlykho.model.Products;
import com.example.quanlykho.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@WebServlet(name = "saveOder", value = "/saveOrder")
public class SaveOrderServlet extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        BigDecimal total = BigDecimal.valueOf(Double.parseDouble(req.getParameter("total_amount")));
        int status = Integer.parseInt(req.getParameter("status"));
        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("user");
        LocalDateTime localDateTime = LocalDateTime.now();
        java.sql.Date sqlDate = java.sql.Date.valueOf(localDateTime.toLocalDate());
        Order order = new Order(user, total, sqlDate, status);

        CRUD_Order crudOrder = new CRUD_Order();
        crudOrder.createOrder(order);
        List<Items> itemsList = (List<Items>) session.getAttribute("cart");

        for (Items it : itemsList) {
            CRUD_Items.createItem(it);
        }
        session.removeAttribute("cart");

        resp.sendRedirect("/store");
    }
}
