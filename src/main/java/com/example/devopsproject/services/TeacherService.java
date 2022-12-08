package com.example.devopsproject.services;
import com.example.devopsproject.models.Teacher;
import com.example.devopsproject.repositories.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {
    @Autowired
    TeacherRepository teacherRepository;

    public List<Teacher> getAllTeachers() throws Exception {
        return this.teacherRepository.findAll();
    }

    public Teacher createTeacher(Teacher teacher) throws Exception {
        return this.teacherRepository.save(teacher);
    }

    public Teacher getTeacherById(Long teacherId) throws Exception {

        Optional<Teacher> teacher = this.teacherRepository.findById(teacherId);

        return teacher.orElseThrow(()-> new Exception("Teacher not found"));
    }
}
