package com.tgc.testQuestionnaire.services;

import com.tgc.testQuestionnaire.models.Person;
import com.tgc.testQuestionnaire.repositories.PersonRepository;
import com.tgc.testQuestionnaire.security.PersonDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonDetailsService implements UserDetailsService {

    private final PersonRepository personRepository;

    @Autowired
    public PersonDetailsService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Person> user = personRepository.findByName(username);

        if(user.isEmpty())
            throw new UsernameNotFoundException("User not found!");

        return new PersonDetails(user.get());
    }
}
