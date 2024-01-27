package com.sid.tutorials.spring.module02.beans;

import org.springframework.stereotype.Component;

@Component
public class TaxBean1 implements ITaxBean {
    @Override
    public float calculateTax(float value) {
        return 5f;
    }
}
