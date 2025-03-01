package com.demo.springDemo;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@ComponentScan(basePackages = "com.demo.springDemoSTS")
public class HelloWorldSpringApp {
    public static void main(String[] args) {
        SpringApplication.run(HelloWorldSpringApp.class, args);
    }

    @Controller
    public static class HelloWorldController {

        @GetMapping("/hello")
        public String sayHello(Model model) {
            model.addAttribute("message", "Hello from BridgeLabz!");
            return "hello";  // Refers to hello.html inside 'templates' folder
        }
    }
}
