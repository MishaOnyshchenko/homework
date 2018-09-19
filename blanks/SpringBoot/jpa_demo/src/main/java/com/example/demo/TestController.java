package com.example.demo;

import com.example.demo.dao.entity.Student;
import com.example.demo.service.StudentService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Log4j2
public class TestController {

    @Autowired
    private StudentService studentService;


    @GetMapping("/")
    public String test() {
        log.info("test controller");
        return "Hello boot";
    }

    @PostMapping("/student")
    public String post(@RequestBody Student student) {
        log.info("student() ", student);
        studentService.addStudent(student);
        return "okt";
    }

    @GetMapping("/student")
    public List<Student> getStudent() {
        log.info("return all student");
        return studentService.allStudent();
    }

    @GetMapping("/student/{name}/{age}")
    public Student post(@PathVariable String name, @PathVariable int age) {
        log.info("return by name and age");
        return studentService.findByNameAndAge(name, age);
    }

}
