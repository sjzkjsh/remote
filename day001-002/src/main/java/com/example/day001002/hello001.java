package com.example.day001002;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hello001 {
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }
}
