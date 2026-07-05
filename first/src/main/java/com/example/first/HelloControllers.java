package com.example.first;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControllers {

    @GetMapping("hello")
    public String hello() {
        return "Hello";
    }

    @GetMapping("bye")
    public String bye() {
        return "Bye";
    }
}
