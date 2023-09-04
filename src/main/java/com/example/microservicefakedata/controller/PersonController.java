package com.example.microservicefakedata.controller;

import com.example.microservicefakedata.model.Person;
import com.example.microservicefakedata.services.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
    public final PersonService personService;

    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping("/random-person")
    public Person getRamdomPerson(){
        return personService.getPerson();
    }
}
