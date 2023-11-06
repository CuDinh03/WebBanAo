package com.example.quanlykho.controller;

import com.example.quanlykho.dao.CRUD_Account;
import com.example.quanlykho.dao.CRUD_User;
import com.example.quanlykho.model.Accounts;
import com.example.quanlykho.model.User;
import com.example.quanlykho.model.Warehouse;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/signup")
public class ControllerUsercreate extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        RequestDispatcher dispatcher = req.getRequestDispatcher("/signup.jsp");
        dispatcher.forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        User user = new User(username,password,1);
        CRUD_User.save(user);
        int idUser;
        for (User user1:
             CRUD_User.getAll()) {
            if (user1.getUserName().equals(user.getUserName())){
                idUser = user1.getId();
                CRUD_Account.save(new Accounts(name,idUser,1));
                break;
            }
        }


        resp.sendRedirect("/login.jsp");
    }
}
