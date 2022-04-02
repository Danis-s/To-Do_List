package com.example.demo.Controllers;

import com.example.demo.Services.ListService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ListController {
    private ListService listService;

    public ListController(ListService listService) {
        this.listService = listService;
    }

    @GetMapping("/List")
    public List<List> getLists(){
        return listService.getLists();
    }
}
