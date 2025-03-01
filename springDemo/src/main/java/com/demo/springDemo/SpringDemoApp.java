package com.demo.springDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemoApp{
    // Create a logger instance
    private static final Logger logger = LoggerFactory.getLogger(SpringDemoApplication.class);

    public static void main(String[] args) {
        logger.info("🚀 Starting SpringDemoApplication...");
        SpringApplication.run(SpringDemoApplication.class, args);
        logger.info("✅ Application Started Successfully!");
    }
}