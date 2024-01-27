package com.sid.tutorials.spring.module02.beans;

import java.io.IOException;

import org.springframework.stereotype.Component;

import com.sid.tutorials.spring.module02.annotation.CustomTransaction;
import com.sid.tutorials.spring.module02.ds.Person;

@Component("hello_child_bean")
public class HelloChildBean extends HelloBean {
    @Override
    public void sayHello(String name, int ex) {
        System.out.println("Hello from Spring Child Bean for " + name);
    }

	public void validateName(String name) throws IOException {
    }

    @CustomTransaction
    public void saveCounterValue(int counterValue) {
    }

    public void savePerson(Person person) {
    }
}
