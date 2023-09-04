package com.example.microservicefakedata;

import net.datafaker.Faker;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Locale;

@SpringBootApplication
public class MicroserviceFakeDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceFakeDataApplication.class, args);
    }

    @Bean
    public Faker getFaker() {
        return new Faker(new Locale.Builder().setLanguage("ru").setRegion("RU").build());
    }


}
