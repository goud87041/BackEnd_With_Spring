package com.example.letsStarting;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class SayHello {

    @GetMapping("/hello")
    public String Hello(){
        return "hello world i am here in Spring Boot" ;
    }
}
