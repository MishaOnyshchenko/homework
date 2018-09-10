package com.example.demo.controller;

import com.example.demo.dao.impl.StudentDaoImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class StartController {


    private StudentDaoImpl studentDao = new StudentDaoImpl();


    @GetMapping("/")
    public String showAllStudents() {

        log.info("List of students");

        return studentDao.getAllStudents().toString();
    }


    @GetMapping("/id/{id}")
    public String getById(@PathVariable int id) {

        log.info("Show student by id");

        return studentDao.getById(id).toString();
    }


    @GetMapping("/name/{name}")
    public String getByName(@PathVariable String name) {

        log.info("Show student by name");

        return studentDao.getByName(name).toString();
    }


//  @RequestMapping(value = "/add/{name}", method = {RequestMethod.GET, RequestMethod.POST})
    @PutMapping("/add/{name}")
    public String addStudent(@PathVariable String name) {

        log.info("Add student");

        studentDao.addStudent(name);

        return "Student " + name + " added.";
    }


    @PostMapping("/update/{id}/{name}")
    public String updateStudent(@PathVariable int id, @PathVariable String name){

        log.info("Update student for " + name);

        studentDao.updateStudent(id, name);

        return id + " updated to " + name;
    }


    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable int id){

        log.info(id + " deleted");

        studentDao.deleteStudent(id);

        return id +" deleted";
    }

}
