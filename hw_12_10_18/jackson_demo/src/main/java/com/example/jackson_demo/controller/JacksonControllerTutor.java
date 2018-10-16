package com.example.jackson_demo.controller;

import com.example.jackson_demo.dao.entity.Car;
import com.example.jackson_demo.service.JacksonServiceTutor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@RestController
@Slf4j
@RequestMapping("/jackson/tutor")
public class JacksonControllerTutor {

    @Autowired
    private JacksonServiceTutor jacksonServiceTutor;

    @RequestMapping
    public List<Car> hello(){
        System.out.println("Hello from Jakson's controller");
        return jacksonServiceTutor.getAll();
    }

    @GetMapping("/string")
    public Car createJsonFromString(){
        return jacksonServiceTutor.createFromString();
    }

    @GetMapping("/reader")
    public Car createJsonFromReader() throws IOException {
        return jacksonServiceTutor.createFromReader();
    }

    @GetMapping("/file")
    public Car createJsonFromFile() throws IOException {
        return jacksonServiceTutor.createFromFile();
    }

    @GetMapping("/url")
    public Car createJsonFromUrl() throws IOException {
        return jacksonServiceTutor.createFromUrl();
    }

    @GetMapping("/stream")
    public Car createJsonFromInputStream() throws IOException {
        return jacksonServiceTutor.createfromInputStream();
    }

    @GetMapping("/byte")
    public Car gcreateJsonFromByteArray() throws IOException{
        return jacksonServiceTutor.createFromByteArray();
    }

    @GetMapping("/array")
    public Car[] readArrayFromJsonStringArray()throws IOException{
        return jacksonServiceTutor.readObjectArrayFromJsonStringArray();
    }

    @GetMapping("/list")
    public List<Car> readListFromJsonStringArray() throws IOException{
        return jacksonServiceTutor.readObjectListFromJsonStringArray();
    }

    @GetMapping("/map")
    public Map<String, Object> readMapFromJsonString() throws IOException{
        return jacksonServiceTutor.readMapFromJsonString();
    }

    @GetMapping("/ignore")
    public Car ignoreUnknownJsonFields() throws IOException{
        return jacksonServiceTutor.ignoreUnknownJsonFields();
    }


    @GetMapping("/write/file")
    public String writeToFile()throws IOException{
        return jacksonServiceTutor.writeJsonFromObjectToFile();
    }

    @GetMapping("/write/string")
    public String writeToString() throws IOException{
        return jacksonServiceTutor.writeJsonFromObjectToString();
    }

    @GetMapping("/tree")
    public String treeModel() throws IOException{
        return jacksonServiceTutor.treeModel();
    }

    @GetMapping("/node")
    public String jsonNode()throws IOException{
        jacksonServiceTutor.jsonNode();
        return "Read sout in console";
    }

    @GetMapping("/parser")
    public Car jsonParser() throws IOException{
        return jacksonServiceTutor.jsonParcer();
    }

    @GetMapping("/generator")
    public String jsonGenerator()throws IOException{
        return jacksonServiceTutor.jsonGenerator();
    }

}
