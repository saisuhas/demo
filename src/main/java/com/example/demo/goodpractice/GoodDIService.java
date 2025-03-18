package com.example.demo.goodpractice;

import org.springframework.stereotype.Service;

@Service
public class GoodDIService {
    public String getMessage() {
        return "Hello from GoodDIService (Spring Dependency Injection)!";
    }
}

/*
🔹 Service Layer (GoodDIService)

Implements the actual business logic.
Can be reused by multiple controllers or components.
Keeps logic separate from the controller, making it easier to test.
🔹 Controller Layer (GoodDIController)

Acts as an entry point for HTTP requests.
Calls the service to get data.
Converts the response into HTTP format.
*/

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