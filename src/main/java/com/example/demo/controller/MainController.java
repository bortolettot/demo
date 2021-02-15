package com.example.demo.controller;

import com.example.demo.entity.Person;
import com.example.demo.service.MainService;
import javassist.NotFoundException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    private final MainService service;

    public MainController(MainService service) {
        this.service = service;
    }

    @RequestMapping(value = "/", params = "name")
    public Person find(String name) throws NotFoundException {
        return  service.find(name);
    }

    @PostMapping(value = "/", consumes = "application/json")
    public Long post(@RequestBody Person p){
        return service.save(p);
    }

}
