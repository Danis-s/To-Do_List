package com.example.demo.Controllers;

import com.example.demo.Dto.TaskDto;
import com.example.demo.Dto.ToDoListDto;
import com.example.demo.Entities.TaskEntity;
import com.example.demo.Entities.ToDoListEntity;
import com.example.demo.Services.TaskService;
import com.example.demo.Services.ToDoListService;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")

@RestController
public class ToDoListController {
    public final ToDoListService listService;
    public final TaskService taskService;

    public ToDoListController(ToDoListService listService, TaskService taskService) {
        this.listService = listService;
        this.taskService = taskService;
    }

    @GetMapping("/list")
    public List<ToDoListEntity> getLists(){
        return listService.getLists();
    }
    @GetMapping("/list/{id}")
    public ToDoListEntity getListById(@PathVariable long id){
        return listService.getList(id);
    }

    @GetMapping("/list/{id}/task")
    public TaskEntity getTasks(@PathVariable long id){
        return taskService.getTasks(id);
    }

    @PostMapping("/list")
    public long createList(@RequestBody ToDoListDto toDoListDto) {
        return listService.createList(toDoListDto);
    }

    @PostMapping("/list/{id}/task")
    public ToDoListEntity addTask(@RequestBody TaskDto taskDto, @PathVariable long id){
        return listService.addTask(id, taskDto);
    }

    @DeleteMapping("list/{listId}/task/{taskId}")
    public ToDoListEntity deleteTask(@PathVariable Long listId, @PathVariable Long taskId){
        return listService.deleteTask(listId, taskId);
    }

    @PutMapping("/list/{id}")
    public ToDoListEntity editList(@RequestBody ToDoListDto toDoList, @PathVariable long id){
        return listService.editList(toDoList, id);
    }

    @PutMapping("/task/{id}")
    public ToDoListEntity editTask(@RequestBody TaskDto taskDto, @PathVariable long id) {
        return listService.editTask( id, taskDto);
    }

    @DeleteMapping("/list")
    public ToDoListEntity deleteListsAll(){
        return listService.deleteListsAll();
    }

    @DeleteMapping("/list/{id}")
    public ToDoListEntity deleteList(@PathVariable long id){
        return listService.deleteList(id);
    }
}
