package ru.gb.service2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@org.springframework.stereotype.Controller
@RequestMapping("/service2")
@RestController
public class Controller {
    @GetMapping("/hello")
    public String hello(){
        return "HI!";
    }
}
