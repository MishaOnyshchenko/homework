package com.studentSpring.controller;

import com.studentSpring.Service.CreateStudents;
import com.studentSpring.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;


@Controller
@RequestMapping("/")
public class TestController {

    CreateStudents cs = new CreateStudents();
//    ArrayList<Student> students = new ArrayList<>(cs.create());


    @RequestMapping(method = RequestMethod.GET)
    public String showIndex(Model model){
        model.addAttribute("message", "Massachusetts Institute of Technology");
        model.addAttribute("students", cs.create());
        return "index";
    }

    @RequestMapping(value = "go", method = RequestMethod.GET)
    public String show(){
        return "redirect:/show";
    }

}
