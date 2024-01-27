package com.sid.tutorials.spring.module04.data.layer;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sid.tutorials.spring.module04.ds.Person;

@Service
public class FtpDataLayer {
    public List<Person> getData() {
        System.out.println("Fetching data from ftp...");

        return Arrays.asList(
                new Person(1, "John"),
                new Person(2, "Dave"),
                new Person(3, "Peter")
        );
    }
}
