package com.example.quanlykho.controller;

import com.example.quanlykho.model.Items;
import com.example.quanlykho.model.ProductModel;
import com.example.quanlykho.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CartServlet", value = "/CartServlet")
public class CartServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action != null && action.equalsIgnoreCase("add")) {
            doGetAdd(req, resp);
        }else {
            RequestDispatcher dispatcher = req.getRequestDispatcher("/shoppingcart.jsp");
            dispatcher.forward(req,resp);
        }

    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action != null && action.equalsIgnoreCase("update")) {
            String updateQuantity = req.getParameter("updateQuantity");
            int id = Integer.parseInt(req.getParameter("id"));
            HttpSession session = req.getSession();

            if (session.getAttribute("cart") != null) {
                List<Items> cart = (List<Items>) session.getAttribute("cart");
                for (Items item : cart) {
                    if (item.getProducts().getProductId() == id) {
                        if (updateQuantity.equalsIgnoreCase("increase")) {
                            item.setQuantity(item.getQuantity() + 1);
                        } else if (updateQuantity.equalsIgnoreCase("decrease")) {
                            if (item.getQuantity() > 1) {
                                item.setQuantity(item.getQuantity() - 1);
                            }
                        }
                        break;
                    }

                }
                session.setAttribute("totalPrice",getTotalPrice(cart));

                session.setAttribute("cart", cart);
            }
        } else if (action != null && action.equalsIgnoreCase("remove")) {
            int id = Integer.parseInt(req.getParameter("id"));
            HttpSession session = req.getSession(true); // Sử dụng session mới hoặc khởi tạo session nếu chưa tồn tại

            List<Items> cart;
            if (session.getAttribute("cart") != null) {
                cart = (List<Items>) session.getAttribute("cart");
                cart.removeIf(item -> item.getProducts().getProductId() == id);
            } else {
                cart = new ArrayList<>();
            }

            session.setAttribute("cart", cart);
        }

        resp.sendRedirect(req.getContextPath() + "/shoppingcart.jsp");
    }

    protected void doGetAdd(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProductModel productModel = new ProductModel();
        int id = Integer.parseInt(req.getParameter("id"));
        HttpSession session = req.getSession();
        LocalDateTime localDateTime = LocalDateTime.now();
        java.sql.Date sqlDate = java.sql.Date.valueOf(localDateTime.toLocalDate());
        User user = (User) session.getAttribute("user");
        if (session.getAttribute("cart") == null) {
            List<Items> cart = new ArrayList<>();
            cart.add(new Items(user.getUserName(), productModel.find(id), 1, sqlDate));
            session.setAttribute("cart", cart);
        } else {
            List<Items> cart = (List<Items>) session.getAttribute("cart");
            boolean itemExists = false;
            for (Items item : cart) {
                if (item.getProducts().getProductId() == id) {
                    item.setQuantity(item.getQuantity() + 1);
                    itemExists = true;
                    break;
                }
            }
            if (!itemExists) {
                cart.add(new Items( user.getUserName(), productModel.find(id), 1, sqlDate));
            }
            session.setAttribute("cart", cart);

        }

        resp.sendRedirect(req.getContextPath() + "/shoppingcart.jsp");
    }

    private double getTotalPrice(List<Items> cart) {
        double totalPrice = 0;
        for (Items item : cart) {
            totalPrice += item.getProducts().getProductPrice() * item.getQuantity();
        }
        return totalPrice;
    }
}
