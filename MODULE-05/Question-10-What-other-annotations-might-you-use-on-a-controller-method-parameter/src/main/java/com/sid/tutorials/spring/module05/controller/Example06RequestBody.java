package com.sid.tutorials.spring.module05.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sid.tutorials.spring.module05.ds.Person;

@Controller
public class Example06RequestBody {

    // curl -d '{ "firstName": "John", "lastName": "Doe" }' -H 'Content-Type: application/json' http://localhost:8080/example06A
    @PostMapping("/example06A")
    @ResponseBody
    public String example06A(@RequestBody String body) {
        return String.format("Received body = [%s]\n", body);
    }

    // curl -d '{ "firstName": "John", "lastName": "Doe" }' -H 'Content-Type: application/json' http://localhost:8080/example06B
    @PostMapping("/example06B")
    @ResponseBody
    public String example06B(@RequestBody Person person) {
        return String.format("Received person = [%s]\n", person);
    }

    // curl -d '{ "firstName": "John", "lastName": "Doe" }' -H 'Content-Type: application/json' http://localhost:8080/example06C
    // curl -X POST -H 'Content-Type: application/json' http://localhost:8080/example06C
    @PostMapping("/example06C")
    @ResponseBody
    public String example06C(@RequestBody(required = false) Person person) {
        return String.format("Received person = [%s]\n", person);
    }

    // curl -d '{ "firstName": "John", "lastName": "Doe" }' -H 'Content-Type: application/json' http://localhost:8080/example06D
    // curl -X POST -H 'Content-Type: application/json' http://localhost:8080/example06D
    @PostMapping("/example06D")
    @ResponseBody
    public String example06D(@RequestBody Optional<Person> person) {
        return String.format("Received person = [%s]\n", person.orElse(new Person()));
    }

    // curl -d '{ "firstName": "John", "lastName": "Doe" }' -H 'Content-Type: application/json' http://localhost:8080/example06E
    // curl -d '{ "firstName": "John1", "lastName": "Doe" }' -H 'Content-Type: application/json' http://localhost:8080/example06E
    // curl -d '{ "firstName": "John1", "lastName": "Doe2" }' -H 'Content-Type: application/json' http://localhost:8080/example06E
    @PostMapping("/example06E")
    @ResponseBody
    public String example06E(@RequestBody @Valid Person person, BindingResult bindingResult) {
        return String.format("Received person = [%s], error count = [%d]\n", person, bindingResult.getErrorCount());
    }
}
