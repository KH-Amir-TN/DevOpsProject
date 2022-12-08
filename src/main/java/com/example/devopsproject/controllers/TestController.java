package com.example.devopsproject.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
@CrossOrigin(origins = "*")
public class TestController {
    @Autowired

    @GetMapping("/")
    public String getTeachers() throws Exception
    {
        return "Hello World!";
    }

}
