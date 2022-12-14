package com.example.devopsproject.controllers;

import com.example.devopsproject.models.Student;
import com.example.devopsproject.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
@CrossOrigin(origins = "*")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/")
    public List<Student> getStudents() throws Exception
    {
        List<Student> studentsList = this.studentService.getAllStudents();
        return studentsList;
    }

    @PostMapping("/{teacherId}")
    public Student createNewStudent (
        @RequestBody Student newStudent, 
        @PathVariable("teacherId") Long teacherId
    ) throws Exception
    {
        Student student = this.studentService.createStudent(newStudent, teacherId);
        return student;
    }

    @GetMapping("/{studentId}")
    public Student getStudentById(@PathVariable("studentId") Long studentId) throws Exception
    {
        Student student = this.studentService.getStudentById(studentId);
        return student;
    }
}
