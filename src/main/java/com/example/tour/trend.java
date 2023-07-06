package com.example.tour;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class trend {
    @GetMapping("/trend")
    public String getData() {return  "DevOps journey"; }
}