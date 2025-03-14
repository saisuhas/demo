package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Spring Boot!";
    }

    @Value("${app.message}")
    private String message;

    @GetMapping("/message")
    public String getMessage() {
        return message;
    }
}

/*
1. @RestController
@RestController is a Spring annotation that is used to define a controller that handles HTTP requests and returns data directly.

What does it do?
It is a combination of @Controller and @ResponseBody.
It tells Spring that this class will handle HTTP requests and return data (not a view).
It makes it easy to create REST APIs in Spring Boot.

Why @RestController instead of @Controller?
@Controller is used in Spring MVC for applications that return HTML views (like JSP or Thymeleaf).
@RestController is used in RESTful APIs where we return JSON, plain text, or XML responses instead of a full HTML page.
 */