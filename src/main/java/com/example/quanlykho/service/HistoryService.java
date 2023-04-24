package com.example.quanlykho.service;

import com.example.quanlykho.dao.ShowExportHistory;
import com.example.quanlykho.model.HistoryExport;

import java.util.List;

public class HistoryService {

    public void addHistory (HistoryExport export){
        ShowExportHistory.saveHistory(export);
    }
    public List<HistoryExport> show (){
        return ShowExportHistory.getAll();
    }
}
