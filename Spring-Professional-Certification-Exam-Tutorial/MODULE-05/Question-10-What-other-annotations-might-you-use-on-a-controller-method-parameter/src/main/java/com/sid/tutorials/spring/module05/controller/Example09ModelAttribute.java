package com.sid.tutorials.spring.module05.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.sid.tutorials.spring.module05.ds.Address;

@Controller
public class Example09ModelAttribute {

    // Visit http://localhost:8080/example09
    @GetMapping("/example09")
    public String example09(@ModelAttribute Address address) {
        return "address-form";
    }

    // John	Doe
    // 455 Larkspur Dr. Apt 23
    // Baviera	CA	92908	United States
    @PostMapping("/example09")
    public String example09(@ModelAttribute @Valid Address address, BindingResult bindingResult) {
        if (bindingResult.hasErrors())
            return "address-form";
        else
            return "address-display";
    }
}
