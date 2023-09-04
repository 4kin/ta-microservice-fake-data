package com.example.microservicefakedata.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Setter
@Getter
@ToString
public class TimeSheet {

    private byte hours;
    private TypesOfTimeEnum types;
    private String fileName;
    private String notes;
    private Date date;
}
