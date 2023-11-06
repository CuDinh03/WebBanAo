package com.example.quanlykho.controller.filter;

import com.example.quanlykho.model.User;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(urlPatterns = {"/store.jsp", "/CartServlet", "/adminUser.jsp", "/buttons.jsp", "/payment.jsp", "/tables2.jsp", "/tables.jsp", "/shoppingcart.jsp",
        "/historyExport.jsp", "/export.jsp", "/edit", "/charts.jsp", "/cards.jsp", "/cart.jsp"})
public class UserFilter implements Filter {
    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;

        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("user");

        if (user == null) {
            response.sendRedirect(request.getContextPath() + "/LoginServlet");
        } else {
            int status = user.getStatus();
            String url = request.getRequestURI();

            if (status == 1) {
                // Cho phép truy cập tất cả các trang
                chain.doFilter(request, response);
            } else if (status == 2) {
                // Người dùng admin chỉ được truy cập vào trang table.jsp
                if (url.endsWith("/table.jsp")) {
                    chain.doFilter(request, response);
                } else {
                    response.sendRedirect(request.getContextPath() + "/table.jsp");
                }
            } else {
                // Người dùng không có quyền truy cập
                response.sendRedirect(request.getContextPath() + "/LoginServlet");
            }
        }
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void destroy() {
    }
}
