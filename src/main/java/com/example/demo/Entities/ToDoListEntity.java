package com.example.demo.Entities;

import javax.persistence.*;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;


@Entity
public class ToDoListEntity implements List<ToDoListEntity> {
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

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<ToDoListEntity> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(ToDoListEntity toDoListEntity) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends ToDoListEntity> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends ToDoListEntity> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public ToDoListEntity get(int index) {
        return null;
    }

    @Override
    public ToDoListEntity set(int index, ToDoListEntity element) {
        return null;
    }

    @Override
    public void add(int index, ToDoListEntity element) {

    }

    @Override
    public ToDoListEntity remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<ToDoListEntity> listIterator() {
        return null;
    }

    @Override
    public ListIterator<ToDoListEntity> listIterator(int index) {
        return null;
    }

    @Override
    public List<ToDoListEntity> subList(int fromIndex, int toIndex) {
        return null;
    }
}
