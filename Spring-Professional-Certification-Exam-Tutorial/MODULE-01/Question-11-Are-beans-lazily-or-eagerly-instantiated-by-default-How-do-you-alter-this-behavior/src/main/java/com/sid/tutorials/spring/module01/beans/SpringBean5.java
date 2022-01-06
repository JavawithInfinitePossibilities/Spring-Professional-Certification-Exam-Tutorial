package com.sid.tutorials.spring.module01.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SpringBean5 {
    @Autowired
    private SpringBean6 springBean6;

    public SpringBean5() {
        System.out.println("Creating " + getClass().getSimpleName() + " - Singleton Bean that has dependency on Prototype Bean SpringBean6");
    }
}
