package com.example.microservicefakedata.services;

import com.example.microservicefakedata.model.TimeSheet;
import com.example.microservicefakedata.model.TypesOfTimeEnum;
import net.datafaker.Faker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.Calendar;

@Service
public class TimeSheetService {

    private final Faker faker;

    public TimeSheetService(Faker faker) {
        this.faker = faker;
    }

    public TimeSheet getFakeTimeSheet(){
        TimeSheet fakeTimeSheet = new TimeSheet();

        fakeTimeSheet.setHours((byte) faker.number().numberBetween(1, 8));
        fakeTimeSheet.setNotes(faker.lorem().maxLengthSentence(150));
        fakeTimeSheet.setFileName(faker.file().fileName());
        fakeTimeSheet.setTypes(TypesOfTimeEnum.randomType());

        java.util.Date date = new java.util.Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.YEAR, -2);
        java.util.Date stratDate = calendar.getTime();
        calendar.add(Calendar.YEAR, 2);
        calendar.add(Calendar.MONTH, -1);
        java.util.Date endDate = calendar.getTime();
        fakeTimeSheet.setDate(faker.date().between(stratDate, endDate));

        Logger logger = LogManager.getLogger(this.getClass());
        logger.info("Новое время " + fakeTimeSheet);

        return fakeTimeSheet;
    }
}
