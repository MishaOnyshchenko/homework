package com.studentSpring.controller;


import com.studentSpring.Service.CreateStudents;
import com.studentSpring.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/show")
public class AddController {



    @RequestMapping(method = RequestMethod.GET)
    public String showPage(@ModelAttribute Student student, Model model){
        model.addAttribute("students", CreateStudents.students);
        return "/add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(@ModelAttribute Student student){
        student.getName();
        student.getSurname();
        student.getGender();
        CreateStudents.students.add(student);
        return "redirect:/show";
    }


    @RequestMapping(value = "/delAll", method = RequestMethod.GET)
    public String deleteAll(@ModelAttribute Student student){
        CreateStudents.students.clear();
        return "redirect:/show";
    }


//    @RequestMapping(value = "/del", method = RequestMethod.GET)
//    public String delete(@ModelAttribute Student student){
//        strings.remove(student.getName());
//        System.out.println(student.getName());
//        return "redirect:/show";
//    }
}
