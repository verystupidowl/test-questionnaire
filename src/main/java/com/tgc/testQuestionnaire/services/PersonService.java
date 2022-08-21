package com.tgc.testQuestionnaire.services;

import com.tgc.testQuestionnaire.models.Person;
import com.tgc.testQuestionnaire.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public void saveUser(Person person) {
        personRepository.save(person);
    }
}
