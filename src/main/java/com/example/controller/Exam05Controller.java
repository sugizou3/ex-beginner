package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("exam05")

public class Exam05Controller {
    @GetMapping("/")
    public String index() {
        return "exam05";
    }

    @PostMapping("name-search")
    public String nameSearch() {
        return "exam05-result";
    }

}
