package com.demo.springDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // Marks this class as a REST Controller
@RequestMapping("/api")  // Base URL for this controller
public class HelloWorldRestController {

    @GetMapping("/hello")  // Maps GET requests to /api/hello
    public String sayHello() {
        return "Hello from BridgeLabz!"; // Returns plain text response
    }
}