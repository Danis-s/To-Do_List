package com.example.demo.Services;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoListService {
    public final List<List> lists = new ArrayList<>();

    public List<List> getLists(){
        return lists;
    }
}
