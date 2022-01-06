package com.sid.tutorials.spring.module05.controller;

import static com.sid.tutorials.spring.module05.utils.JoinUtils.join;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

@Controller
public class Example01WebRequest {
    // curl "localhost:8080/actionA?name=John&country=US"
    @GetMapping("/actionA")
    @ResponseBody
    public String actionA(WebRequest webRequest) {
        return String.format(
                "Retrieved request with headers = [%s], parameters = [%s]\n",
                join(webRequest.getHeaderNames()),
                join(webRequest.getParameterNames())
        );
    }
}