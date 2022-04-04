package com.example.demo.Repo;

import com.example.demo.Entities.TaskEntity;
import com.example.demo.Entities.ToDoListEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepo extends CrudRepository<TaskEntity, Long> {
    @Override
    public Iterable<ToDoListEntity> findAll() {
        return null;
    }
}
