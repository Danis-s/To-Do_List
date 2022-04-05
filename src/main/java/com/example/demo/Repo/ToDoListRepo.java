package com.example.demo.Repo;

import com.example.demo.Entities.ToDoListEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ToDoListRepo extends CrudRepository<ToDoListEntity, Long> {

    @Override
    Iterable<ToDoListEntity> findAll();

    @Override
    Iterable<ToDoListEntity> findAllById(Iterable<Long> id);

    @Override
    void deleteById(Long aLong);

    @Override
    void deleteAll();
}
