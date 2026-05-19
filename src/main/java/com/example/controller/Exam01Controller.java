package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")

public class Exam01Controller {
    @GetMapping("/")
    public String index(Model model) {
        return "exam01";
    }

    @PostMapping("/name-post")
    public String namePost(String name, Model model) {
        model.addAttribute("name", name);
        return "exam01-result";
    }

}
