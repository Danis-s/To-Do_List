package com.example.demo.Controllers;

import com.example.demo.Dto.TaskDto;
import com.example.demo.Services.TaskService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
    public final TaskService taskService;

    public TaskController(TaskService taskService){
        this.taskService = taskService;
    }

    @PostMapping("/list{id}/task")
    public long createTask(@PathVariable Long id, @RequestBody TaskDto taskDto) {
        return taskService.createTask(id, taskDto);
    }
}
