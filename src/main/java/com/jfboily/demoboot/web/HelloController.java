package com.jfboily.demoboot.web;

import com.jfboily.demoboot.data.entities.Client;
import com.jfboily.demoboot.data.repos.ClientRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class HelloController {

    private ClientRepo clientRepo;


    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }
}
