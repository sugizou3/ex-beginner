package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("exam04")

public class Exam04Controller {
    @GetMapping("/")
    public String index() {
        return "exam04";
    }

    @PostMapping("/user-regislation")
    public String userRegislation() {
        return "exam04-result";
    }
}
