package com.example.quanlykho.controller.filter;


import com.example.quanlykho.model.Users;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(urlPatterns = "/index.jsp")
public class UserFilter extends HttpFilter {
    @Override
    protected void doFilter(HttpServletRequest req, HttpServletResponse res, FilterChain chain) throws IOException, ServletException, IOException, ServletException {
        HttpSession session = req.getSession();
        Users users = (Users) session.getAttribute("user");
        if (users == null) {
            res.sendRedirect("/LoginServerlet");
        }else {
            chain.doFilter(req,res);
        }
    }
}
