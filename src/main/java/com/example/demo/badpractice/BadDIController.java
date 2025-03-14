package com.example.demo.badpractice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bad-di")
public class BadDIController {
    private final BadDIService badDIService = new BadDIService(); // BAD PRACTICE

    @GetMapping("/message")
    public String getMessage() {
        return badDIService.getMessage();
    }
}

/*
Why is this a Bad Practice?
Tightly Coupled

BadDIController is directly creating an instance of BadDIService.
If BadDIService changes, we must update BadDIController.
This makes it difficult to replace or test the service.
No Spring Bean Usage

The BadDIService class is not a Spring component (@Service).
Spring cannot manage it, so dependency injection cannot work.
Hard to Unit Test

Since BadDIService is manually created inside BadDIController, it cannot be mocked easily during testing.
In a test, we might want to replace BadDIService with a fake/mock version, but we can't.
*/
