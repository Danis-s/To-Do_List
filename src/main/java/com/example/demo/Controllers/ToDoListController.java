package com.example.demo.Controllers;

import com.example.demo.Dto.ToDoListDto;
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
    public List<ToDoListDto> getLists(){
        return listService.getLists();
    }
    @GetMapping("/list/{id}")
    public ToDoListDto getListById(@PathVariable long id){
        return listService.getList(id);
    }

    @PostMapping("/list")
    public long createList(@RequestBody ToDoListDto toDoListDto) {
        return listService.createList(toDoListDto);
    }

    @PutMapping("/list/{id}")
    public ToDoListDto editList(@RequestBody ToDoListDto toDoList, @PathVariable long id){
        return listService.editList(toDoList, id);
    }

    @DeleteMapping("/list/{id}")
    public ToDoListDto deleteList(@PathVariable long id){
        return listService.deleteList(id);
    }
}
