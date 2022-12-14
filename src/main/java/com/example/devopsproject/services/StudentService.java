package com.example.devopsproject.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.devopsproject.models.Student;
import com.example.devopsproject.models.Teacher;
import com.example.devopsproject.repositories.StudentRepository;
import com.example.devopsproject.repositories.TeacherRepository;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    @Autowired
    TeacherRepository teacherRepository;

    public Student createStudent(Student student, Long teacherId) throws Exception {

        Optional<Teacher> teacherData = this.teacherRepository.findById(teacherId);
        Teacher teacher = teacherData.orElseThrow(() -> new Exception("Teacher not found"));
        student.setTeacher(teacher);
        Student createdStudent = this.studentRepository.save(student);
        return createdStudent;
    }

    public List<Student> getAllStudents() throws Exception {
        List<Student> students = this.studentRepository.findAll();
        return students;
    }

    public Student getStudentById(Long studentId) throws Exception {
        Optional<Student> studentData = this.studentRepository.findById(studentId);
        Student student = studentData.orElseThrow(()-> new Exception("Student not found"));
        return student;
    }
}
