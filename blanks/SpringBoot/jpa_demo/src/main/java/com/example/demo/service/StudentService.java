package com.example.demo.service;

import com.example.demo.dao.entity.Student;
import com.example.demo.dao.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public void addStudent(Student student){
        studentRepository.saveAndFlush(student);
    }

    public List<Student> allStudent(){
        return studentRepository.findAll();
    }

    public Student findByNameAndAge(String name, int age){
        return studentRepository.findByNameAndAge(name, age);
    }


}
