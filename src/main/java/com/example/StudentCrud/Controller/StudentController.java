package com.example.StudentCrud.Controller;

import com.example.StudentCrud.Model.Student;
import com.example.StudentCrud.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/save")
    public String saveStudent(@RequestBody Student student) {
         studentService.createStudent(student);
        return"Student Created Successfully";

    }

    @GetMapping("{studentId}")
    public Student showstudent(@PathVariable("studentId") int studentId) {
        return studentService.getStudent(studentId);

    }

    @GetMapping("/all")
    public List<Student> showallstudent() {
        return studentService.getAllStudent();

    }

    @DeleteMapping("{studentId}")
    public String deleteStudent(@PathVariable("studentId") int studentId) {
        studentService.deleteStudent(studentId);
        return "Student Deleted Successfully";
    }

    @PutMapping("/update")
    public String updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
        return"Student updated Successfully";


    }





}
