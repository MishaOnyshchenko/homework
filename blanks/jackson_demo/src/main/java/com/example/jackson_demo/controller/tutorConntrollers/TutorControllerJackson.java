package com.example.jackson_demo.controller.tutorConntrollers;

import com.example.jackson_demo.dao.entity.Car;
import com.example.jackson_demo.service.tutorServices.TutorServiceJackson;
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
@RequestMapping("/tutor/jackson")
public class TutorControllerJackson {

    @Autowired
    private TutorServiceJackson tutorServiceJackson;

    @RequestMapping
    public List<Car> hello(){
        System.out.println("Hello from Jakson's controller");
        return tutorServiceJackson.getAll();
    }

    @GetMapping("/string")
    public Car createJsonFromString(){
        return tutorServiceJackson.createFromString();
    }

    @GetMapping("/reader")
    public Car createJsonFromReader() throws IOException {
        return tutorServiceJackson.createFromReader();
    }

    @GetMapping("/file")
    public Car createJsonFromFile() throws IOException {
        return tutorServiceJackson.createFromFile();
    }

    @GetMapping("/url")
    public Car createJsonFromUrl() throws IOException {
        return tutorServiceJackson.createFromUrl();
    }

    @GetMapping("/stream")
    public Car createJsonFromInputStream() throws IOException {
        return tutorServiceJackson.createfromInputStream();
    }

    @GetMapping("/byte")
    public Car gcreateJsonFromByteArray() throws IOException{
        return tutorServiceJackson.createFromByteArray();
    }

    @GetMapping("/array")
    public Car[] readArrayFromJsonStringArray()throws IOException{
        return tutorServiceJackson.readObjectArrayFromJsonStringArray();
    }

    @GetMapping("/list")
    public List<Car> readListFromJsonStringArray() throws IOException{
        return tutorServiceJackson.readObjectListFromJsonStringArray();
    }

    @GetMapping("/map")
    public Map<String, Object> readMapFromJsonString() throws IOException{
        return tutorServiceJackson.readMapFromJsonString();
    }

    @GetMapping("/ignore")
    public Car ignoreUnknownJsonFields() throws IOException{
        return tutorServiceJackson.ignoreUnknownJsonFields();
    }


    @GetMapping("/write/file")
    public String writeToFile()throws IOException{
        return tutorServiceJackson.writeJsonFromObjectToFile();
    }

    @GetMapping("/write/string")
    public String writeToString() throws IOException{
        return tutorServiceJackson.writeJsonFromObjectToString();
    }

    @GetMapping("/tree")
    public String treeModel() throws IOException{
        return tutorServiceJackson.treeModel();
    }

    @GetMapping("/node")
    public String jsonNode()throws IOException{
        tutorServiceJackson.jsonNode();
        return "Read sout in console";
    }

    @GetMapping("/parser")
    public Car jsonParser() throws IOException{
        return tutorServiceJackson.jsonParcer();
    }

    @GetMapping("/generator")
    public String jsonGenerator()throws IOException{
        return tutorServiceJackson.jsonGenerator();
    }

}
