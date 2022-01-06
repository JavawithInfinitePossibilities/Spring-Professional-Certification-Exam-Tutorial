package com.sid.tutorials.spring.module05.controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;

import com.sid.tutorials.spring.module05.ds.MutableCountHolder;

@Controller
public class Example10SessionAttribute {

    // curl -b cookie.txt -c cookie.txt http://localhost:8080/example10A
    @GetMapping("/example10A")
    @ResponseBody
    public String example10A(@SessionAttribute MutableCountHolder mutableCountHolder) {
        mutableCountHolder.increment();

        return String.format("count value = [%d]\n", mutableCountHolder.get());
    }

    // curl -b cookie.txt -c cookie.txt http://localhost:8080/example10B
    @GetMapping("/example10B")
    @ResponseBody
    public String example10B(@SessionAttribute(required = false, name = "current-count") Integer count) {
        return String.format("count value = [%d]\n", count);
    }

    // curl -b cookie.txt -c cookie.txt http://localhost:8080/example10C
    @GetMapping("/example10C")
    @ResponseBody
    public String example10C(@SessionAttribute("current-count") Optional<Integer> count) {
        return String.format("count value = [%d]\n", count.orElse(-1));
    }
}
