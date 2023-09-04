package com.example.microservicefakedata.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Person {
    private String firstName;
    private String secondName;
    private String middleName;
    private Date dateOfBirth;
    private int personNumber;
}
