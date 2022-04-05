package com.example.demo.Services;

import com.example.demo.Dto.ToDoListDto;
import com.example.demo.Entities.TaskEntity;
import com.example.demo.Entities.ToDoListEntity;
import com.example.demo.Repo.TaskRepo;
import com.example.demo.Repo.ToDoListRepo;
import org.springframework.stereotype.Service;
import com.example.demo.Dto.TaskDto;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {
    private final TaskRepo taskRepo;

    public TaskService(TaskRepo taskRepo) {
        this.taskRepo = taskRepo;
    }

    @Transactional
    public Long createTask(Long id,TaskDto taskDto) {
        TaskEntity taskEntity = new TaskEntity();
        taskEntity.setTitle(taskDto.getTitle());
        taskEntity.setDescription(taskDto.getDescription());
        this.taskRepo.save(taskEntity);
        return taskEntity.getId();
    }
}
