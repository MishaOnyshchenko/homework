package com.example.jackson_demo.controller;

import com.example.jackson_demo.dao.entity.Car;
import com.example.jackson_demo.service.GsonServiceTutor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@Slf4j
@RequestMapping("/gson")
public class GsonControllerTutor {

    @Autowired
    private GsonServiceTutor gsonServiceTutor;

    @RequestMapping
    public String hello(){
        return "Hello from Gson controller!";
    }

    @GetMapping("/parse")
    public Car parseIntoJava(){
        return gsonServiceTutor.parseJsonIntoJavaObject();
    }

    @GetMapping("/generate")
    public String generateFromJava(){
        return gsonServiceTutor.generateJsonFromJavaObject();
    }

    @GetMapping("/read")
    public Car jsonReader() throws IOException {
        return gsonServiceTutor.jsonReader();
    }

    @GetMapping("/parser")
    public String jsonParser(){
        return gsonServiceTutor.jsonParser();
    }

}
