package com.example.demo.Services;

import com.example.demo.Dto.ToDoListDto;
import com.example.demo.Entities.ToDoListEntity;
import com.example.demo.Repo.ToDoListRepo;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class ToDoListService {
    private final ToDoListRepo toDoListRepo;

    public ToDoListService(ToDoListRepo toDoListRepo) {
        this.toDoListRepo = toDoListRepo;
    }


    @Transactional
    public Long createList(ToDoListDto toDoListDto) {
        ToDoListEntity toDoListEntity = new ToDoListEntity();
        toDoListEntity.setName(toDoListDto.getName());
        this.toDoListRepo.save(toDoListEntity);
        return toDoListEntity.getId();
    }

    public List<ToDoListEntity> getLists(){
        return (List<ToDoListEntity>) toDoListRepo.findAll();
    }

    public ToDoListEntity getList(long id){
        return toDoListRepo.findById(id).get();
    }

    public ToDoListEntity editList(ToDoListDto toDoList, long id) {
        ToDoListEntity toDoListEntity = toDoListRepo.findById(id).get();
        toDoListEntity.setName(toDoList.getName());
        this.toDoListRepo.save(toDoListEntity);
        return null;
    }

    public ToDoListEntity deleteList(long id) {
        toDoListRepo.deleteById(id);
        return null;
    }

    public ToDoListEntity deleteListsAll(){
        toDoListRepo.deleteAll();
        return null;
    }
}
