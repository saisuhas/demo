package com.example.demo.day4crud;

import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/day4/users")
public class CrudController {
    private final List<User> users = new ArrayList<>();

    @PostMapping
    public String createUser(@RequestBody User user) {
        users.add(user);
        return "User created successfully";
    }

    @GetMapping
    public List<User> getAllUsers() {
        return users;
    }

    @GetMapping("/{id}")
    public User getUserId(@PathVariable Long id) {
        return users.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable Long id, @RequestBody User updateUser) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                user.setName(updateUser.getName());
                user.setEmail(updateUser.getEmail());
                return "User updated successfully";
            }
        }
        return "User not found";
    }

    @DeleteMapping("/id")
    public String deleteUser(@PathVariable Long id) {
        boolean removed = users.removeIf(u -> u.getId().equals(id));
        return removed ? "User deleted successfully" : "User not found";
    }
}

/*
@RequestBody	Takes JSON input from the API request and maps it to a Java object
@PathVariable	Captures dynamic data from the URL (like user ID)
List<User>	Simulates a database
Separation of CRUD	Prepares you for real database interactions (coming soon)

curl http://localhost:8080/api/day4/users/1
curl -X PUT http://localhost:8080/api/day4/users/1 \
     -H "Content-Type: application/json" \
     -d '{"name": "Suhas Updated", "email": "newemail@example.com"}'
curl -X DELETE http://localhost:8080/api/day4/users/1
curl -X POST http://localhost:8080/api/day4/users \
     -H "Content-Type: application/json" \
     -d '{"id": 1, "name": "Suhas", "email": "suhas@example.com"}'

 */