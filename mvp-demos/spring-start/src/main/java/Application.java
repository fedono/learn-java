package com.example.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    String index() {
        return "Hello jack again!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}