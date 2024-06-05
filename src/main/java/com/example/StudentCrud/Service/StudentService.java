package com.example.StudentCrud.Service;

import com.example.StudentCrud.Model.Student;

import java.util.List;

public interface StudentService {
    public String createStudent(Student student);
    public String updateStudent(Student student);

    public Student getStudent(int id);

    public String deleteStudent(int id);

    public List<Student> getAllStudent();


}
