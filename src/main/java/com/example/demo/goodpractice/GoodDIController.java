package com.example.demo.goodpractice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/good-di")
public class GoodDIController {
    private final GoodDIService goodDIService;

    // Constructor Injection (Best Practice)
    public GoodDIController(GoodDIService goodDIService) {
        this.goodDIService = goodDIService;
    }

    @GetMapping("/message")
    public String getMessage() {
        return goodDIService.getMessage();
    }
}
