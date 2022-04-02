package com.example.demo.Models;

public class ToDoList {
    private long id;
    private String name;
    private Task task;

    public ToDoList(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public ToDoList() {

    }

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
