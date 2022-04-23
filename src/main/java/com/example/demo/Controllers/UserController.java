package com.example.demo.Controllers;

import com.example.demo.Dto.ToDoListDto;
import com.example.demo.Dto.UserDto;
import com.example.demo.Entities.UserEntity;
import com.example.demo.Services.ToDoListService;
import com.example.demo.Services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
public class UserController {
    public final UserService userService;
    public final ToDoListService toDoListService;

    public UserController(UserService userService, ToDoListService toDoListService) {
        this.userService = userService;
        this.toDoListService = toDoListService;
    }

    @PostMapping("/user")
    public long createUser(@RequestBody UserDto userDto) {
        return userService.createUser(userDto);
    }

    @DeleteMapping("/user/{id}")
    public UserEntity deleteUser(@PathVariable long id){
        return userService.deleteUser(id);
    }

    @GetMapping("/user/{id}")
    public List<UserEntity> getUserById(@PathVariable long id){
        return Collections.singletonList(userService.getUser(id));
    }

    @PostMapping("/user/{id}/list")
    public UserEntity createListForUser(@RequestBody ToDoListDto toDoListDto,@PathVariable long id) {
        return userService.addListForUser(id, toDoListDto);
    }

//    @PostMapping("/user/{id}")
//    public long AddListToUser(@RequestBody ToDoListDto toDoListDto, @PathVariable long id) {
//        return userService.addListToUser(id);
//    }

//    @GetMapping("/user")
//    public List<ToDoListEntity> getLists(){
//        return userService.usergtList();
//    }
}
