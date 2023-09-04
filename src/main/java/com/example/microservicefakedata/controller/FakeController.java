package com.example.microservicefakedata.controller;

import com.example.microservicefakedata.model.TimeSheet;
import com.example.microservicefakedata.services.TimeSheetService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

@RestController
public class FakeController {

    private final TimeSheetService timeSheetService;

    public FakeController(TimeSheetService timeSheetService) {
        this.timeSheetService = timeSheetService;
    }

    @GetMapping("/fake-ts")
    public TimeSheet getFakeTimeSheet(){
        return timeSheetService.getFakeTimeSheet();
    }
}
