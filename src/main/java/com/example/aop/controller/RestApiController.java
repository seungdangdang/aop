package com.example.aop.controller;

import com.example.aop.dto.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestApiController {

    @GetMapping("/get/{id}")
    public void get(@PathVariable Long id, @RequestParam String name) {
        System.out.println("get method");
        System.out.println("get method" + id);
        System.out.println("get method" + name);
    }

    @PostMapping("/post")
    public void post(@RequestBody User user) {
        System.out.println("post method" + user);
    }
}
