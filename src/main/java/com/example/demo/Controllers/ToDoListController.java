package com.example.demo.Controllers;

import com.example.demo.Dto.ToDoListDto;
import com.example.demo.Entities.ToDoListEntity;
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
    public List<ToDoListEntity> getLists(){
        return listService.getLists();
    }
    @GetMapping("/list/{id}")
    public ToDoListEntity getListById(@PathVariable long id){
        return listService.getList(id);
    }

    @PostMapping("/list")
    public long createList(@RequestBody ToDoListDto toDoListDto) {
        return listService.createList(toDoListDto);
    }

    @PutMapping("/list/{id}")
    public ToDoListEntity editList(@RequestBody ToDoListDto toDoList, @PathVariable long id){
        return listService.editList(toDoList, id);
    }

    @DeleteMapping("list")
    public ToDoListEntity deleteListsAll(){
        return listService.deleteListsAll();
    }

    @DeleteMapping("/list/{id}")
    public ToDoListEntity deleteList(@PathVariable long id){
        return listService.deleteList(id);
    }
}
