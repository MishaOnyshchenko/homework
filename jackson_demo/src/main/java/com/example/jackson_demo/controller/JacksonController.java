package com.example.jackson_demo.controller;

import com.example.jackson_demo.service.JacksonService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@Slf4j
@RequestMapping("/tutorJson")
public class JacksonController {

    @Autowired
    JacksonService jacksonService;


    @GetMapping("/node")
    public String jsonNode()throws IOException{
      return jacksonService.parseWithJsonNode();
    }

    @GetMapping("/parser")
    public String jsonParser()throws IOException{
        return jacksonService.parseWithJsonParser();
    }


}
