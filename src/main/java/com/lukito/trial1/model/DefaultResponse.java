package com.lukito.trial1.model;

public class DefaultResponse {
    private Boolean status;
    private String message;

    public Boolean getStatus() {
        return status;
    }

    //Generate getter and setter
    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
