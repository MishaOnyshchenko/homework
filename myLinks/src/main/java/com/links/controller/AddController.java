package controller;

import com.testSpring.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
@RequestMapping("/show")
public class AddController {

    ArrayList<String> strings = new ArrayList<>(Arrays.asList("Anna", "Bella", "Cindy"));

    @RequestMapping(method = RequestMethod.GET)
    public String showPage(Model model){
        model.addAttribute("names", strings);
        return "/add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(@ModelAttribute Student student){
        strings.add(student.getName());
        System.out.print(student.getName() + " " + student.getSurname());
        return "redirect:/show";
    }


    @RequestMapping(value = "/delAll", method = RequestMethod.GET)
    public String deleteAll(@ModelAttribute Student student){
        strings.clear();
        return "redirect:/show";
    }


    @RequestMapping(value = "/del", method = RequestMethod.GET)
    public String delete(@ModelAttribute Student student){
        strings.remove(student.getName());
        System.out.println(student.getName());
        return "redirect:/show";
    }
}
