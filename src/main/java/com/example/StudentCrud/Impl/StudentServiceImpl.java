package com.example.StudentCrud.Impl;

import com.example.StudentCrud.Model.Student;
import com.example.StudentCrud.Repository.StudentRepository;
import com.example.StudentCrud.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepository studentRepository;
    @Override
    public String createStudent(Student student) {
        studentRepository.save(student);
        return "Student Created";
    }

    @Override
    public String updateStudent(Student student) {
        studentRepository.save(student);
        return "Student Updated";
    }

    @Override
    public Student getStudent(int id) {
        return  studentRepository.findById(id).get();

    }

    @Override
    public String deleteStudent(int id) {
       studentRepository.deleteById(id);
        return "Student Deleted";
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }
}
