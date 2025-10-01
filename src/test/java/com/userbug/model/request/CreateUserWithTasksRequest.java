package com.userbug.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class CreateUserWithTasksRequest {
    public String email;
    public String name;
    public List<TaskDto> tasks;

    public String hobby;
    public String adres;
    public String inn;
    public String gender;
    public String birthday;

    @JsonProperty("date_start")
    public String dateStart;

    public CreateUserWithTasksRequest() {}

    public CreateUserWithTasksRequest(String email,
                                      String name,
                                      List<TaskDto> tasks,
                                      String hobby,
                                      String adres,
                                      String inn,
                                      String gender,
                                      String birthday,
                                      String dateStart) {
        this.email = email;
        this.name = name;
        this.tasks = tasks;
        this.hobby = hobby;
        this.adres = adres;
        this.inn = inn;
        this.gender = gender;
        this.birthday = birthday;
        this.dateStart = dateStart;
    }
}
