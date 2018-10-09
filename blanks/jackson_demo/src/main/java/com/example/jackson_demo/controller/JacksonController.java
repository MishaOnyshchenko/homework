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
@RequestMapping
public class JacksonController {

    @Autowired
    JacksonService jacksonService;


    @GetMapping
    public String json()throws IOException{
      return jacksonService.parseJson();
    }



}
