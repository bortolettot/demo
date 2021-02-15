package com.example.demo.controller;

import com.example.demo.service.MainService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    private final MainService service;

    public MainController(MainService service) {
        this.service = service;
    }

    @RequestMapping(value = "/", params = "as")
    public String index(String as){
        return  service.index(as);
    }

}
