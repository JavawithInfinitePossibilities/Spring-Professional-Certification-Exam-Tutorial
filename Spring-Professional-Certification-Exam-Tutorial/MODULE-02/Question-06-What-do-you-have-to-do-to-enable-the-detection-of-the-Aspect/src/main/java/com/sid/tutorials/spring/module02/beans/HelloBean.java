package com.sid.tutorials.spring.module02.beans;

import org.springframework.stereotype.Component;

@Component
public class HelloBean {
    public void sayHello() {
        System.out.println("Hello from Spring Bean");
    }
}
