package com.example.demo.Controllers;

import com.example.demo.Models.ToDoList;
import com.example.demo.Services.ToDoListService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ToDoListController {
    private ToDoListService listService;

    public ToDoListController(ToDoListService listService) {
        this.listService = listService;
    }

    @GetMapping("/List")
    public List<List> getLists(){
        return listService.getLists();
    }

    @PostMapping("/list/create")
    public long createBook(@RequestBody ToDoList ToDoListDto) {
        return ToDoListService.createList(ToDoListDto);
    }
}
