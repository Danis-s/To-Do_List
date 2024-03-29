package com.example.demo.Controllers;

import com.example.demo.Dto.TaskDto;
import com.example.demo.Dto.ToDoListDto;
import com.example.demo.Dto.UserDto;
import com.example.demo.Dto.UserInputDto;
import com.example.demo.Entities.TaskEntity;
import com.example.demo.Entities.ToDoListEntity;
import com.example.demo.Entities.UserEntity;
import com.example.demo.Services.TaskService;
import com.example.demo.Services.ToDoListService;
import com.example.demo.Services.UserService;
import org.apache.catalina.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")

@RestController
public class UserController {
    public final UserService userService;
    public final ToDoListService toDoListService;
    public final TaskService taskService;

    public UserController(UserService userService, ToDoListService toDoListService, TaskService taskService) {
        this.userService = userService;
        this.toDoListService = toDoListService;
        this.taskService = taskService;
    }

    @PostMapping("/user")
    public ResponseEntity<UserDto> createUser(@RequestBody UserInputDto userInputDto){
        return new ResponseEntity<>(userService.createUser(userInputDto), HttpStatus.CREATED);
    }

    @DeleteMapping("/user/{id}")
    public UserEntity deleteUser(@PathVariable long id){
        return userService.deleteUser(id);
    }

    @GetMapping("/user/{id}")
    public List<UserEntity> getUserById(@PathVariable long id){
        return Collections.singletonList(userService.getUser(id));
    }
    @GetMapping("/user")
    public List<UserEntity> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/user/{id}/list")
    public UserEntity createListToUser(@RequestBody ToDoListDto toDoListDto,@PathVariable long id) {
        return userService.addListToUser(id, toDoListDto);
    }

    @DeleteMapping("/user/{userid}/list/{listid}")
    public UserEntity deleteListFromUser(@PathVariable long userid,@PathVariable long listid) {
        return userService.deleteList(userid, listid);
    }


}
