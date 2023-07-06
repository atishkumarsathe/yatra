package com.example.tour;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class tools {
    @GetMapping("/tools")
    public String getData() {return  "DevOps tools are Git, Github, Jenkins,etc"; }
}