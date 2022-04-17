package com.example.demo.Entities;

import com.example.demo.Dto.TaskDto;
import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
public class ToDoListEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String name;


    @OneToMany
    private List<TaskEntity> taskEntities;

    @ManyToOne
    private UserEntity userEntity;

    public List<TaskEntity> getTaskEntities() {
        return taskEntities;
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
        taskEntities.add(taskEntity);
    }
}
