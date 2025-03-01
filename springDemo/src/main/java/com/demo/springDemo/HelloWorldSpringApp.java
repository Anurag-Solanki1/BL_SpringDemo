package com.demo.springDemo;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.demo.springDemoSTS")
public class HelloWorldSpringApp {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldSpringApp.class, args);
    }
}
