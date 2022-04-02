package com.example.demo.Services;

import com.example.demo.Models.ToDoList;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ToDoListService {
    public final List<List> lists = new ArrayList<>();

    public static long createList(ToDoList toDoListDto) {
        return 0;
    }

    public List<List> getLists(){
        return lists;
    }
}
