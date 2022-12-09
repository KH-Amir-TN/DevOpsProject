package com.example.devopsproject.controllers;

import com.example.devopsproject.models.Student;
import com.example.devopsproject.services.StudentService;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.doReturn;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.hamcrest.Matchers.*;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

@SpringBootTest
@AutoConfigureMockMvc
public class StudentControllerTest {

    @MockBean
    private StudentService service;

    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("GET /students/")
    void testGetStudentsSuccess() throws Exception {

        Student student = new Student("Foulen");
        Student student1 = new Student("Foulena");
        doReturn(Lists.newArrayList(student, student1)).when(service).getAllStudents();

        mockMvc.perform(get("/students/"))
                // Validate the response code and content type
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))

                // Validate the returned fields
                .andExpect(jsonPath("$", hasSize(2)))
                .andExpect(jsonPath("$[0].name", is("Foulen")))
                .andExpect(jsonPath("$[1].name", is("Foulena")));
    }
}
