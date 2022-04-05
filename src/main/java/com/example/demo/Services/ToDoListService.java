package com.example.demo.Services;

import com.example.demo.Dto.ToDoListDto;
import com.example.demo.Entities.ToDoListEntity;
import com.example.demo.Repo.ToDoListRepo;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class ToDoListService {
    private final ToDoListRepo toDoListRepo;

    public ToDoListService(ToDoListRepo toDoListRepo) {
        this.toDoListRepo = toDoListRepo;
    }

    public final List<ToDoListDto> lists = new ArrayList<>();

    @Transactional
    public Long createList(ToDoListDto toDoListDto) {
        ToDoListEntity toDoListEntity = new ToDoListEntity();
        toDoListEntity.setName(toDoListDto.getName());
        lists.add(toDoListDto);
        this.toDoListRepo.save(toDoListEntity);
        return toDoListEntity.getId();
    }

    public List<ToDoListDto> getLists(){
        return lists;
    }

    public ToDoListDto getList(long id){
        for (ToDoListDto toDoList: lists){
            if (toDoList.getId() == id){
                return toDoList;
            }
        }
        return null;
    }

    public ToDoListDto editList(ToDoListDto toDoList, long id) {
        for (ToDoListDto toDoList1: lists){
            if (toDoList1.getId() == id){
                if (!Objects.equals(toDoList.getName(), null)){
                    toDoList1.setName(toDoList.getName());
                }
            }
        }
        return null;
    }

    public ToDoListDto deleteList(long id) {
        for (ToDoListDto item: lists){
            if(item.getId() == id) {
                lists.remove(item);
            }
        }
        return null;
    }
}
