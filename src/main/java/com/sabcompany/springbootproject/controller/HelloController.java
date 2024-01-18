package com.sabcompany.springbootproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/api/v1/hello")
    public String giveInputStringValue(){
        return "Hello World Program sasas";
    }
}
