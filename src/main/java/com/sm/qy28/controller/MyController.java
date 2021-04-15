package com.sm.qy28.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("demo")
    public String demo(){
        return "OK~~~~~~~~~~";
    }
}
