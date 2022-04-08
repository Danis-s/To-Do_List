package com.example.demo.Entities;

import com.example.demo.Dto.TaskDto;
import javax.persistence.*;
import java.util.List;

@Entity
public class ToDoListEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

    @ManyToOne
    @JoinColumn(name = "task_entity_id")
    private TaskEntity taskEntity;

    public TaskEntity getTaskEntity() {
        return taskEntity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTaskEntity(TaskEntity taskEntity) {
        this.taskEntity = taskEntity;
    }
}
