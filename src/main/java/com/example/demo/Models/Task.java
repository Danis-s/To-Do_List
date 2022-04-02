package com.example.demo.Models;


public class Task {
    public long id;
    public String text;
    public String deadline;
    public boolean status=false;

    public Task(String text, String deadline) {
        this.text = text;
        this.deadline = deadline;
    }
}
