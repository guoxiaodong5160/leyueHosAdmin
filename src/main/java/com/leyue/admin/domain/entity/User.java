package com.leyue.admin.domain.entity;

public class User {
    private String cellphone;
    private String password;
    private String pass;
    private String nickname;

    public String getCellphone() {
        return cellphone;
    }

    public void setCellphone(String cellphone) {
        this.cellphone = cellphone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    @Override
    public String toString() {
        return "User{" +
                "cellphone='" + cellphone + '\'' +
                ", password='" + password + '\'' +
                ", pass='" + pass + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}
