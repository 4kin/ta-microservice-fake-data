package com.example.microservicefakedata.services;

import com.example.microservicefakedata.model.Person;
import lombok.ToString;
import net.datafaker.Faker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.sql.Date;

@Service
public class PersonService {

    private final Faker faker;

    public PersonService(Faker faker) {
        this.faker = faker;
    }

    public Person getPerson() {
        Person person = new Person();
        String[] fio = faker.name().nameWithMiddle().split(" ");
        person.setFirstName(fio[2]);
        person.setMiddleName(fio[1]);
        person.setSecondName(fio[0]);
        person.setDateOfBirth(new Date(faker.date().birthday(15, 78).getTime()));
        person.setPersonNumber(faker.number().numberBetween(1, 300));

        Logger logger = LogManager.getLogger(this.getClass());
        logger.info("Новая персона " + person.toString());

        return person;

    }
}
