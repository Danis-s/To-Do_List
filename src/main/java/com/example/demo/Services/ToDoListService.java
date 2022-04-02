package com.example.demo.Services;

import com.example.demo.Entities.ToDoListEntity;
import com.example.demo.Models.ToDoList;
import com.example.demo.Repo.ToDoListRepo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class ToDoListService {
    private ToDoListRepo toDoListRepo;

    public ToDoListService(ToDoListRepo toDoListRepo) {
        this.toDoListRepo = toDoListRepo;
    }

    public final List<ToDoList> lists = new ArrayList<>();

    public Long createList(ToDoList toDoListDto) {
        ToDoListEntity toDoListEntity = new ToDoListEntity();
        toDoListEntity.setId(toDoListDto.getId());
        toDoListEntity.setName(toDoListDto.getName());
        lists.add(toDoListDto);
        return toDoListEntity.getId();
    }

    public List<ToDoList> getLists(){
        return lists;
    }

    public ToDoList getList(long id){
        for (ToDoList toDoList: lists){
            if (toDoList.getId() == id){
                return toDoList;
            }
        }
        return null;
    }

    public ToDoList editList(ToDoList toDoList, long id) {
        for (ToDoList toDoList1: lists){
            if (toDoList1.getId() == id){
                if (!Objects.equals(toDoList.getName(), null)){
                    toDoList1.setName(toDoList.getName());
                }
            }
        }
        return null;
    }
}
