package com.example.quanlykho.controller;

import com.example.quanlykho.dao.ShowExportHistory;
import com.example.quanlykho.model.HistoryExport;
import com.example.quanlykho.model.Warehouse;
import com.example.quanlykho.service.HistoryService;
import com.example.quanlykho.service.WarehouseService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "HistoryExportServlet", value = "/HistoryExportServlet")
public class HistoryExportServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HistoryService service = new HistoryService();
        List<HistoryExport> list = service.show();
        request.setAttribute("historyExport", list);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/historyExport.jsp");
        dispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
