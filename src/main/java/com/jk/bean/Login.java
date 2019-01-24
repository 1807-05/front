package com.jk.bean;

import java.io.Serializable;

public class Login implements Serializable {

    private Integer id;

    private String loginacct;

    private String userpswd;

    private String RememberPswd;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLoginacct() {
        return loginacct;
    }

    public void setLoginacct(String loginacct) {
        this.loginacct = loginacct;
    }

    public String getUserpswd() {
        return userpswd;
    }

    public void setUserpswd(String userpswd) {
        this.userpswd = userpswd;
    }

    public String getRememberPswd() {
        return RememberPswd;
    }

    public void setRememberPswd(String rememberPswd) {
        RememberPswd = rememberPswd;
    }

    @Override
    public String toString() {
        return "Login{" +
                "id=" + id +
                ", loginacct='" + loginacct + '\'' +
                ", userpswd='" + userpswd + '\'' +
                ", RememberPswd='" + RememberPswd + '\'' +
                '}';
    }
}
