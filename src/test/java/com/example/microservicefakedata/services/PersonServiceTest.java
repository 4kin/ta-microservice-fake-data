package com.example.microservicefakedata.services;

import com.example.microservicefakedata.model.Person;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.AutoConfigureDataJpa;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class PersonServiceTest {

    @Autowired
    private PersonService personService;

    @Test
    void getPerson() {
        Person newPerson = personService.getPerson();

        Assertions.assertThat(newPerson.getFirstName().length()).isGreaterThan(1);
        Assertions.assertThat(newPerson.getMiddleName().length()).isGreaterThan(1);
        Assertions.assertThat(newPerson.getSecondName().length()).isGreaterThan(1);

    }



}