package com.example.devopsproject.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.devopsproject.models.Student;
import com.example.devopsproject.repositories.StudentRepository;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents() throws Exception {
        List<Student> students = this.studentRepository.findAll();
        return students;
    }
}
