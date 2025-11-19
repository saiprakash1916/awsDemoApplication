package com.aws.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ec2Controller {

    @PostMapping("/hello")
    public String hello(){
        return "Welcome to Ec2 Instance...";
    }
}
