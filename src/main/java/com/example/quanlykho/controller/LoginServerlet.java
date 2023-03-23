package com.example.quanlykho.controller;

import com.example.quanlykho.dao.LoginDao;
import com.example.quanlykho.model.Users;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "LoginServerlet", value = "/LoginServerlet")
public class LoginServerlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
String username = request.getParameter("username");
String password = request.getParameter("password");
        Users users = LoginDao.login(username,password);
        if (users != null){
            HttpSession session = request.getSession();
            session.setAttribute("id",users.getId());
            session.setAttribute("userName",users.getUserName());
            session.setAttribute("passWord",users.getPassWord());

            response.sendRedirect("/broad");
        }else {
            response.sendRedirect("/LoginServerlet");
        }
    }
}
