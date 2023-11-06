package com.example.quanlykho.controller;

import com.example.quanlykho.model.Items;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;

@WebServlet(name = "payment", value = "/PaymentServlet")
public class PaymentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/payment.jsp");
        dispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double totalPriceShip;
        double totalPriceAfter;
        double tax;
        double totalPrice = Double.parseDouble(req.getParameter("totalPrice"));
        totalPriceShip = totalPrice + 25;
        tax = (totalPriceShip / 100) * 10;
        totalPriceAfter = tax + totalPriceShip;
        LocalDateTime localDateTime = LocalDateTime.now();
        java.sql.Date sqlDate = java.sql.Date.valueOf(localDateTime.toLocalDate());


        // Thực hiện thanh toán và xử lý logic thanh toán ở đây
        // ...
        // Sau khi thanh toán thành công, xóa giỏ hàng
        HttpSession session = req.getSession();
        List<Items> cart = (List<Items>) session.getAttribute("cart");
        session.setAttribute("date",sqlDate);
        session.setAttribute("totalPriceShip",totalPriceShip);
        session.setAttribute("cart", cart);
        session.getAttribute("account");

        session.setAttribute("tax",tax);
        session.setAttribute("totalPriceAfter",totalPriceAfter);
        resp.sendRedirect(req.getContextPath() + "/PaymentServlet");
    }

}
