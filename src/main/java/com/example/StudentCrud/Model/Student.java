package com.example.StudentCrud.Model;

import jakarta.persistence.*;

@Entity
public class Student {



    @Id
    int id;
    String name;
    String Department;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }
}
