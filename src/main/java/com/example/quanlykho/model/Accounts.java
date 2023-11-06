package com.example.quanlykho.model;

public class Accounts {
    private int id;
    private String accountName;
    private String infor;
    private Warehouse warehouse;

    private int userId;
    private int status;

    public Accounts() {
    }

    public Accounts(String accountName, int userId, int status) {
        this.accountName = accountName;
        this.userId = userId;
        this.status = status;
    }

    public Accounts(int id, String accountName, String infor, Warehouse warehouse, int status) {
        this.id = id;
        this.accountName = accountName;
        this.infor = infor;
        this.warehouse = warehouse;
        this.status = status;
    }

    public Accounts(int id, String accountName, String infor, Warehouse warehouse, int userId, int status) {
        this.id = id;
        this.accountName = accountName;
        this.infor = infor;
        this.warehouse = warehouse;
        this.status = status;
        this.userId = userId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getInfor() {
        return infor;
    }

    public void setInfor(String infor) {
        this.infor = infor;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
