package com.example.demo.Controllers;

import com.example.demo.Services.TaskService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public class TaskController {
    private TaskService taskService;
    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }

    @PostMapping("/list{id}/createTask")
    public long createBook(@PathVariable Long id @RequestBody Task TaskDto) {
        return TaskService.createTask(id, TaskDto);
    }
}
