package com.example.demo.Repo;

import com.example.demo.Dto.TaskDto;
import com.example.demo.Entities.TaskEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepo extends CrudRepository<TaskEntity, Long> {
    @Override
    Iterable<TaskEntity> findAll();

    List<TaskDto> findByListId(Long id);
}
