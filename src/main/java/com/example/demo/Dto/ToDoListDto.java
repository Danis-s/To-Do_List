package com.example.demo.Dto;

import java.util.ArrayList;
import java.util.List;

public class ToDoListDto {
    private long id;
    private String name;
    public List<TaskDto> tasks = new ArrayList<>();

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
