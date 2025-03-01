package com.demo.springDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloLoggerController {

    private static final Logger logger = LoggerFactory.getLogger(HelloLoggerController.class);

    @GetMapping("/hello")
    public String sayHello() {
        logger.info("ℹ️ Received request for /api/hello");
        logger.debug("Debugging sayHello() method");
        return "Hello from BridgeLabz Logger!";
    }
}