package com.example.jackson_demo.controller;

import com.example.jackson_demo.service.GsonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@Slf4j
@RequestMapping
public class GsonController {

    @Autowired
    GsonService gsonService;

//    @GetMapping
//    public String hello(){
//        return "Hello from GSON controller";
//    }

    @GetMapping("/object")
    public Object createObjectFromJson()throws IOException {
        return gsonService.jsonIntoObject();
    }

    @GetMapping
    public String createJsonFromObject()throws IOException{
        return gsonService.jsonFromObject();
    }
}
