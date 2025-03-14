package com.example.demo.goodpractice;

import org.springframework.stereotype.Service;

@Service
public class GoodDIService {
    public String getMessage() {
        return "Hello from GoodDIService (Spring Dependency Injection)!";
    }
}

/*
Why is this a Good Practice?
Loose Coupling (Best Practice)

The GoodDIController does not create GoodDIService.
Instead, Spring injects it automatically using Constructor Injection.
If GoodDIService changes or needs to be replaced, GoodDIController does not need modification.
Uses Spring Beans (@Service)

GoodDIService is managed by Spring because of the @Service annotation.
Spring automatically creates an instance of it and injects it wherever needed.
Easier to Test

Since GoodDIService is injected, we can mock it easily in unit tests.
Example:
@MockBean
private GoodDIService goodDIService;
 */