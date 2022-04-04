package com.example.demo.Repo;

import com.example.demo.Entities.ToDoListEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ToDoListRepo extends CrudRepository<ToDoListEntity, Long> {
    @Override
    Iterable<ToDoListEntity> findAll();

}
