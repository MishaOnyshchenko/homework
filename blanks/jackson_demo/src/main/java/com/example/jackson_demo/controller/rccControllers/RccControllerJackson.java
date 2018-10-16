package com.example.jackson_demo.controller.rccControllers;

import com.example.jackson_demo.service.rccServices.RccServiceJackson;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@ControllerAdvice
@Slf4j
@RequestMapping("/rcc/jackson")
public class RccControllerJackson {

    @Autowired()
    RccServiceJackson rccServiceJackson = new RccServiceJackson();

    @GetMapping("/create")
    public Object createObjectFromJson ()throws IOException{
        return rccServiceJackson.createObjectFromJson();
    }

    @GetMapping("/object")
    public Object javaObjectToJson ()throws IOException{
        return rccServiceJackson.javaObjectToJson();
    }

    @GetMapping("/node")
    public String jsonNode ()throws IOException{
        return rccServiceJackson.jsonNode();
    }
}
