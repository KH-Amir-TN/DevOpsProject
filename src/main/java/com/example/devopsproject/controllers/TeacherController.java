package com.example.devopsproject.controllers;
import com.example.devopsproject.models.Teacher;
import com.example.devopsproject.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
@CrossOrigin(origins = "*")
public class TeacherController {
    @Autowired
    TeacherService teacherService;
    @GetMapping("/")
    public List<Teacher> getTeachers() throws Exception
    {
        List<Teacher> teachersList = this.teacherService.getAllTeachers();
        return teachersList;
    }

}
