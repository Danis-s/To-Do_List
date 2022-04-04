package com.example.demo.Repo;

import com.example.demo.Entities.ToDoListEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ToDoListRepo extends CrudRepository<ToDoListEntity, Long> {
    @Override
    public <S extends ToDoListEntity> S save(S entity) {
        return null;
    }

    @Override
    public <S extends ToDoListEntity> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<ToDoListEntity> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<ToDoListEntity> findAll() {
        return null;
    }

    @Override
    public Iterable<ToDoListEntity> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(ToDoListEntity entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends ToDoListEntity> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
