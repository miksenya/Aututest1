package com.userbug.model.request;

public class DoRegisterRequest {
    public String email;
    public String name;
    public String password;

    public DoRegisterRequest(String email, String name, String password) {
        this.email = email;
        this.name = name;
        this.password = password;
    }
}
