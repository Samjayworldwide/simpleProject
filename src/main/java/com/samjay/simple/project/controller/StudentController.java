package com.samjay.simple.project.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
    @GetMapping("/welcome")
    public String welcomePage(){
        return "welcome customer";
    }
}
