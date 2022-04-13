package com.example.demo.Repo;

import com.example.demo.Entities.TaskEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepo extends CrudRepository<TaskEntity, Long> {
    @Override
    Iterable<TaskEntity> findAll();

    @Override
    Iterable<TaskEntity> findAllById(Iterable<Long> id);
}
