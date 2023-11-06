package com.example.quanlykho.model;


public class User {
    private int id;
    private String userName;
    private String passWord;

    private int status;

    public User() {
    }

    public User(String userName, String passWord, int status) {
        this.userName = userName;
        this.passWord = passWord;
        this.status = status;
    }

    public User(int id, String userName, String passWord) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
    }

    public User(int id, String userName, String passWord, int status) {
        this.id = id;
        this.userName = userName;
        this.passWord = passWord;
        this.status = status;
    }

    public int getStatus() {
        return status;
    }



    public void setStatus(int status) {
        this.status = status;
    }

    public User(int id, String name, String username, String password, String contact, String address, String email, String img, int role, int i) {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
