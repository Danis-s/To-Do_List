package com.example.demo.Services;

import com.example.demo.Dto.TaskDto;
import com.example.demo.Dto.ToDoListDto;
import com.example.demo.Entities.TaskEntity;
import com.example.demo.Entities.ToDoListEntity;
import com.example.demo.Repo.TaskRepo;
import com.example.demo.Repo.ToDoListRepo;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class ToDoListService {
    private final ToDoListRepo toDoListRepo;
    private final TaskRepo taskRepo;

    public ToDoListService(ToDoListRepo toDoListRepo, TaskRepo taskRepo) {
        this.toDoListRepo = toDoListRepo;
        this.taskRepo = taskRepo;
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

    @Transactional
    public ToDoListEntity addTask(Long id, TaskDto taskDto){
        ToDoListEntity toDoListEntity = toDoListRepo.findById(id).get();
        TaskEntity taskEntity = new TaskEntity();
        taskEntity.setTitle(taskDto.getTitle());
        taskEntity.setContent(taskDto.getContent());
        taskRepo.save(taskEntity);
        toDoListEntity.setTaskEntity(taskEntity);
        this.toDoListRepo.save(toDoListEntity);
        return null;
    }
}
