package edu.ucsb.cs156.docker.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {
    @GetMapping("/")
    public String getMessage() {
        return "Hello from Docker!";
    }
}