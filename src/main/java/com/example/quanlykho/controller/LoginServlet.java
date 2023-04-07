package com.example.quanlykho.controller;
import com.example.quanlykho.dao.LoginDao;
import com.example.quanlykho.model.Users;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServerlet", value = "/LoginServlet")
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
        Users users = LoginDao.login(username,password);
        if (users != null){
            HttpSession session = request.getSession();
            session.setAttribute("id",users.getId());
            session.setAttribute("userName",users.getUserName());
            session.setAttribute("passWord",users.getPassWord());
            response.sendRedirect("/BroadServlet");
        }else {
            response.sendRedirect("/LoginServlet");
        }
    }
}
