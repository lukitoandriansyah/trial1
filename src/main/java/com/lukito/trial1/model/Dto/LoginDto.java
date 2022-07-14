package com.lukito.trial1.model.Dto;

public class LoginDto {
    private String uname;
    private String pass;

    public String getUname() {
        return uname;
    }
//Generate Getter and setter
    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
