package com.example.tour;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Git {
    @GetMapping("/Git")
    public String getData() {return  "Git is a version control tool offers to track all the changes"; }
}