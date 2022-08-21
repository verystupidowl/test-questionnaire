package com.tgc.testQuestionnaire.controller;

import com.tgc.testQuestionnaire.models.Person;
import com.tgc.testQuestionnaire.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000/")
public class MainController {

    private final PersonService personService;

    @Autowired
    public MainController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/")
    public String testConnection() {
        return "Hello world!";
    }

    @PostMapping("/")
    public Person saveUser(@RequestBody Person person) {
        return personService.saveUser(person);
    }

    @GetMapping("/")
    public List<Person> getAll() {
        return personService.findAll();
    }
}
