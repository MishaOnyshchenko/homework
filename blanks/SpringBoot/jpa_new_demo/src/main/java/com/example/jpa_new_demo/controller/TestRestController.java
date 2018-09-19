package com.example.jpa_new_demo.controller;

import com.example.jpa_new_demo.dao.entity.StudentEntity;
import com.example.jpa_new_demo.dto.StudentDto;
import com.example.jpa_new_demo.dto.testDto.TestDto;
import com.example.jpa_new_demo.service.StudentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Log4j2
public class TestRestController {

    @Autowired
    private StudentService studentService;


    @GetMapping("/")
    public String test() {
        log.info("test controller is working");
        return "Hello boot";
    }

    @PostMapping("/addStudent")
    public String post(@RequestBody StudentDto studentDto) {
        log.info("studentDto received from body: {}", studentDto);
        return studentService.addStudent(studentDto);
    }

    @PostMapping("/test")
    public String test(@RequestBody TestDto testDto) {
        log.info("testDto: {} -> ",testDto);
//        return studentService.addStudent(studentDto);
        return "ok";
    }

    @GetMapping("/students")
    public List<StudentEntity> getStudents() {
        log.info("return all students");
        return studentService.allStudents();
    }

    @GetMapping("/student/{name}/{age}")
    public StudentEntity post(@PathVariable String name, @PathVariable int age) {
        log.info("return student by name and age");
        return studentService.findStudentByNameAndAge(name, age);
    }
}
