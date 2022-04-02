package com.example.demo.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
public class HomeController {

    @GetMapping(("/"))
    public String home(Model model){
        return "home";
    }

}
