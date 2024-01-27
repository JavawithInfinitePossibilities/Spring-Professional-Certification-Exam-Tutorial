package com.sid.tutorials.spring.module01.annotations.beans;

import org.springframework.stereotype.Component;

@Component
public class SpringBean2 {
    public SpringBean2() {
        System.out.println(getClass().getSimpleName() + "::constructor");
    }
}
