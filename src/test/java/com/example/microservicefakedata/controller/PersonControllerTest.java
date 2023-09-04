package com.example.microservicefakedata.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
class PersonControllerTest {
@Autowired private MockMvc mockMvc;
    @Test
    void testPaymentEndpoint() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders.get("/random-person"))
                .andExpect(status().isOk())
                .andExpectAll(
                        jsonPath("$.firstName").isString(),
                        jsonPath("$.secondName").isString(),
                        jsonPath("$.middleName").isString(),
                        jsonPath("$.dateOfBirth").isString(),
                        jsonPath("$.personNumber").isNumber()
                );
    }

}