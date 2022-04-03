package com.example.demo.Controllers;

import com.example.demo.Models.ToDoList;
import com.example.demo.Services.ToDoListService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ToDoListController {
    public final ToDoListService listService;

    public ToDoListController(ToDoListService listService) {
        this.listService = listService;
    }

    @GetMapping("/list")
    public List<ToDoList> getLists(){
        return listService.getLists();
    }
    @GetMapping("/list/{id}")
    public ToDoList getListById(@PathVariable long id){
        return listService.getList(id);
    }

    @PostMapping("/list")
    public long createBook(@RequestBody ToDoList toDoListDto) {
        return listService.createList(toDoListDto);
    }

    @PutMapping("/list/{id}")
    public ToDoList editList(@RequestBody ToDoList toDoList, @PathVariable long id){
        return listService.editList(toDoList, id);
    }

    @DeleteMapping("/list/{id}")
    public long deleteList(@PathVariable long id){
        return listService.deleteList(id);
    }
}
