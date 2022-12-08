package com.example.devopsproject.controllers;
import com.example.devopsproject.models.Teacher;
import com.example.devopsproject.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teachers")
@CrossOrigin(origins = "*")
public class TeacherController {
    @Autowired
    TeacherRepository teacherRepository;
    @GetMapping("/")
    public List<Teacher> getTeachers() throws Exception
    {
        List<Teacher> teachersList = this.teacherRepository.findAll();
        return teachersList;
    }

}
