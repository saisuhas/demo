package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }

}


/*
When you put @SpringBootApplication on your main class (e.g., DemoApplication), Spring Boot automatically does
several important things for you:

1. Auto-Configuration:
It looks at what libraries you’ve added to your classpath (like Spring Web, Spring Data JPA, etc.) and tries to
configure them automatically.

For example, if you have “spring-boot-starter-web” as a dependency, Spring Boot sees that you likely need a web
server. It sets up an embedded Tomcat server and configures it with defaults so you can run HTTP endpoints immediately.
If you add “spring-boot-starter-data-jpa,” it configures a default JPA provider, sets up a DataSource (database
connection), and so forth.

2. Component Scanning:
Spring will scan the package of the class annotated with @SpringBootApplication (and all sub-packages) for any Spring
 beans or components.

This means it automatically looks for annotations like @RestController, @Service, @Repository, or @Component within
com.example.demo and any sub-packages (e.g., com.example.demo.controller, com.example.demo.service, etc.).
Anything that it finds will be registered as a “bean” in the Spring Application Context (so you don’t have to
manually configure each bean).

3. Configuration:
@SpringBootApplication also implies @Configuration, meaning this class can hold Spring bean definitions if you ever
need to configure additional beans.
 */