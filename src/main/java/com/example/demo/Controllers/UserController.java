package com.example.demo.Controllers;

import com.example.demo.Dto.ToDoListDto;
import com.example.demo.Dto.UserDto;
import com.example.demo.Entities.ToDoListEntity;
import com.example.demo.Entities.UserEntity;
import com.example.demo.Services.TaskService;
import com.example.demo.Services.ToDoListService;
import com.example.demo.Services.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    public final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
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
    public UserEntity getUserById(@PathVariable long id){
        return userService.getUser(id);
    }

    @PostMapping("/user/{id}")
    public long createListForUser(@RequestBody ToDoListDto toDoListDto,@PathVariable long id) {
        return userService.createListForUser(id, toDoListDto);
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
