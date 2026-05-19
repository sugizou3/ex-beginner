package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")

public class Exam02Controller {
    @GetMapping("/")
    public String index() {
        return "exam02";
    }

    @PostMapping("/calc-post")
    public String calcPost() {
        return "exam02-result";
    }


}
