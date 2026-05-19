package com.example.controller;

import com.example.domain.Member;
import com.example.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("exam05")

public class Exam05Controller {
    @Autowired
    private MemberRepository repository;

    @GetMapping("/")
    public String index(Model model) {
        return "exam05";
    }

    @PostMapping("/name-search")
    public String nameSearch(String word, Model model) {
        System.out.println("word:" + word);
        List<Member> memberList = repository.searchFromName(word);
        model.addAttribute("memberList", memberList);
        System.out.println("-----------");
        memberList.forEach(System.out::println);
        System.out.println("-----------");
        return "exam05-result";
    }

}
