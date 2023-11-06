package com.example.quanlykho.controller;

import com.example.quanlykho.dao.CRUD_Account;
import com.example.quanlykho.dao.LoginDao;
import com.example.quanlykho.model.Accounts;
import com.example.quanlykho.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = LoginDao.login(username, password);

        Accounts accounts = CRUD_Account.getById(user.getId());

        if (user != null) {
            HttpSession session = request.getSession();
            session.setAttribute("user", user);
            session.setAttribute("account", accounts);

            if (user.getStatus() == 1) {
                response.sendRedirect(request.getContextPath() + "/BroadServlet");
            } else if (user.getStatus() == 2) {
                response.sendRedirect(request.getContextPath() + "/ShowProductsServlet");
            } else {
                response.sendRedirect(request.getContextPath() + "/LoginServlet");
            }
        } else {
            response.sendRedirect(request.getContextPath() + "/LoginServlet");
        }
    }
}
