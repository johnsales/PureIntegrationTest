package com.pureintegration.pureintegrationtest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class MyControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Mock
    private MyController myController;

    @Test
    void canGetJson() throws Exception {
        //given
        // when

        //ResultActions resultActions = mockMvc.perform(get("/api").contentType(MediaType.APPLICATION_JSON));
        // then
        //resultActions.andExpect(status().isOk());

        mockMvc.perform( MockMvcRequestBuilders
                        .get("/api")
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk());

        //verify(myController, atLeastOnce()).getJson();
    }
}