package com.demo.springDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloWorldMvcApp {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldMvcApp.class, args);
    }

    @SpringBootApplication
    public static class HelloWorldRestApp {
        public static void main(String[] args) {
            SpringApplication.run(HelloWorldRestApp.class, args);
        }
    }
}
