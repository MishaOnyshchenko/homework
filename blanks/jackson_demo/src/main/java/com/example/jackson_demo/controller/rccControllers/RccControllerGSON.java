package com.example.jackson_demo.controller.rccControllers;


import com.example.jackson_demo.service.rccServices.RccServiceGSON;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@Slf4j
@RequestMapping("/rcc/gson")
public class RccControllerGSON {


    @Autowired
    RccServiceGSON rccServiceGSON;


    @GetMapping
    public String parser() throws IOException {
        rccServiceGSON.createJsonTree();

        return "Check sout in console";
    }
}
