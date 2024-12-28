package com.study.lol.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RequestMapping("/api/lol")
@RestController
public class ApiController {
    @GetMapping("")
    public String index() {
        return "Hello World!";
    }



}
