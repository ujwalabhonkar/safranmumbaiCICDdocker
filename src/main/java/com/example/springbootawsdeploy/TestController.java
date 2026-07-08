package com.example.springbootawsdeploy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class TestController {
    @GetMapping("/data")
    public String getData() {
        return "Data1 from AWS Ecs";
    }

    @GetMapping("/message")
    public String getMessage() {
        return "Message1 from AWS Ecs";
    }
}
