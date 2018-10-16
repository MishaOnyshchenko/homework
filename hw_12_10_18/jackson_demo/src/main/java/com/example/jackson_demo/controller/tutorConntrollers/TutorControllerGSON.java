package com.example.jackson_demo.controller.tutorConntrollers;

import com.example.jackson_demo.dao.entity.Car;
import com.example.jackson_demo.service.tutorServices.TutorServiceGSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@Slf4j
@RequestMapping("/tutor/gson")
public class TutorControllerGSON {

    @Autowired
    private TutorServiceGSON tutorServiceGson;

    @RequestMapping
    public String hello(){
        return "Hello from GSON controller!";
    }

    @GetMapping("/parse")
    public Car parseIntoJava(){
        return tutorServiceGson.parseJsonIntoJavaObject();
    }

    @GetMapping("/generate")
    public String generateFromJava(){
        return tutorServiceGson.generateJsonFromJavaObject();
    }

    @GetMapping("/read")
    public Car jsonReader() throws IOException {
        return tutorServiceGson.jsonReader();
    }

    @GetMapping("/parser")
    public String jsonParser(){
        return tutorServiceGson.jsonParser();
    }

}
