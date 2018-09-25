package com.student_jpa.student_jpa.controller;

import com.student_jpa.student_jpa.dao.entity.StudentEntity;
import com.student_jpa.student_jpa.dto.StudentDto;
import com.student_jpa.student_jpa.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
public class StartController {

    StudentDto studentDto;


    @Autowired
    private StudentService studentService;


    @GetMapping("/")
    public String test() {
        log.info("test controller is working");

        return "Hello from StartController";
    }


    @GetMapping("/students")
    public List<StudentEntity> getAllStudents() {

        log.info("return all students");

        return studentService.getAllStudents();
    }


    @GetMapping("/student/{name}/{age}")
    public StudentEntity findByNameAndAge(@PathVariable String name, @PathVariable int age) {

        log.info("return student by name and age");

        return studentService.findStudentByNameAndAge(name, age);
    }


    @PostMapping("/addStudent")
    public String addStudent(@RequestBody StudentDto studentDto) {

        log.info("studentDto received from body: {}", studentDto);

        return studentService.addStudent(studentDto);
    }


    @GetMapping("/id/{id}")
    public StudentEntity getById(@PathVariable long id) {

        log.info("Show student by id");

        return studentService.getById(id);
    }


    @GetMapping("/name/{name}")
    public StudentEntity getByName(@PathVariable String name) {

        log.info("Show student by name");

        return studentService.getByName(name);
    }


    @PutMapping("/update/{id}/{name}")
    public StudentEntity updateStudent(@PathVariable long id, @PathVariable String name){

        log.info("Update student for " + name);

        return studentService.updateStudent(id, name);
    }


    @DeleteMapping("/delete/{id}")
    public List<StudentEntity> deleteStudent(@PathVariable long id){

        log.info(id + " deleted");
        studentService.deleteStudent(id);

        return getAllStudents();
    }

}
