package com.sid.tutorials.spring.module04.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sid.tutorials.spring.module04.service.NameService;

@Controller
public class HelloController {

    @Autowired
    private NameService nameService;

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello " + nameService.getName();
    }
}
