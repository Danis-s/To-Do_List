package com.example.demo.Controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")

@RestController
public class HomeController {

    @GetMapping("/")
    public String home(Model model){
        return "home";
    }

}
