package com.qixian.boot.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String handle01(){
        log.info("请求进来了.....");
        return "hello,Spring Boot 2!";
    }
    @GetMapping("/user")
    public String getUser(){
        return "hello,getUser!";
    }

    @PutMapping("/user")
    public String putUser(){
        return "hello,putUser!";
    }

    @PostMapping("/user")
    public String postUser(){
        return "hello,postUser!";
    }

    @DeleteMapping("/user")
    public String deleteUser(){
        return "hello,deleteUser!";
    }
}
