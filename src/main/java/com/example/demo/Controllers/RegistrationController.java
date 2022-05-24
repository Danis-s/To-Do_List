//package com.example.demo.Controllers;
//
//import com.example.demo.Entities.UserEntity;
//import com.example.demo.Services.UserService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.ui.Model;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.*;
//
//import javax.validation.Valid;
//
//@CrossOrigin(origins = "http://localhost:4200")
//
//@RestController
//public class RegistrationController {
//    @Autowired
//    private UserService userService;
//
//    @GetMapping("/registration")
//    public String registration(Model model) {
//        model.addAttribute("userForm", new UserEntity());
//
//        return "registration";
//    }
//
//    @PostMapping("/registration")
//    public String addUser(@RequestBody UserEntity userEntity) {
//        userService.saveUser(userEntity);
//
//
////        if (!userForm.getPassword().equals(userForm.getPasswordConfirm())){
////            model.addAttribute("passwordError", "Passwords do not match");
////            return "Passwords do not match";
////        }
////        if (!userService.saveUser(userForm)){
////            model.addAttribute("usernameError",  "User with the same name already exists");
////            return "User with the same name already exists";
////        }
//
//        return "OK";
////        return "redirect:/";
//    }
//}
