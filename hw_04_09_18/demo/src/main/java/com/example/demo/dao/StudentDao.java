package com.example.demo.dao;

import com.example.demo.entity.Student;

import java.util.List;

public interface StudentDao {

    List<Student> getAllStudents();

    Student getById(int id);

    Student getByName(String name);

    void addStudent(String name);

    void updateStudent(int id, String name);

    void deleteStudent(int id);
}
