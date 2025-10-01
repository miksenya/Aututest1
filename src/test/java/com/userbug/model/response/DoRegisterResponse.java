package com.userbug.model.response;

public class DoRegisterResponse {
    public String type;    // "success"/"error" — стенд иногда так отвечает
    public String name;
    public String email;
    public String message; // если была ошибка
}
