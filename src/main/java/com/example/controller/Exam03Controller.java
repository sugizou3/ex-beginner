package com.example.controller;

import jakarta.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("exam03")
public class Exam03Controller {
    @Autowired
    ServletContext application;

    @GetMapping("/")
    public String index() {
        return "exam03";
    }

    @PostMapping("shopping-post")
    public String shoppingPost(Integer itemPrice1, Integer itemPrice2, Integer itemPrice3) {
        final double TAX = 1.1;
        int netPrice = itemPrice1 + itemPrice2 + itemPrice3;
        int totalPrice = (int) (TAX * netPrice);

        application.setAttribute("netPrice", netPrice);
        application.setAttribute("totalPrice", totalPrice);

        return "exam03-result";
    }

}
