package com.example.quanlykho.controller;

import com.example.quanlykho.dao.SaveHistoryExport;
import com.example.quanlykho.model.HistoryExport;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "HistoryExportServlet", value = "/HistoryExportServlet")
public class HistoryExportServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        List<HistoryExport> list = SaveHistoryExport.getAll();
        request.setAttribute("historyExports", list);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/historyExport.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
