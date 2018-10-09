package com.example.jackson_demo.service;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.IOException;

@Service
@Slf4j
public class JacksonService {


//    public String json()throws IOException {
//        final String JSON = new String(
//                Files.readAllBytes(Paths.get("D:\\0 - Java\\trash\\jackson_demo\\src\\main\\resources\\parseJson.json")), "UTF-8");
//        return JSON;
//    }


    public String parseJson() throws IOException{

//        String json = new String(
//                Files.readAllBytes(Paths.get("D:\\0 - Java\\trash\\jackson_demo\\src\\main\\resources\\parseJson.json")), "UTF-8");
//
//        ObjectMapper objectMapper = new ObjectMapper();
//
//        JsonNode node = objectMapper.readValue(json, JsonNode.class);
//
//        JsonNode phoneNode = node.get("phoneNumbers");
//        String phoneNumbers = phoneNode.asText();
//        System.out.println("phones --> " + phoneNumbers);
//
//        JsonNode cityNode = node.get("cities");
//        String cities = cityNode.asText();
//        System.out.println("cities --> " + cities);


        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("D:\\0 - Java\\trash\\jackson_demo\\src\\main\\resources\\parseJson.json");
        JsonNode node = objectMapper.readValue(file, JsonNode.class);


        JsonNode empIDNode = node.get("empID");
        String empID = empIDNode.asText();
        System.out.println("empID --> " + empID);

        JsonNode nameNode = node.get("name");
        String name = nameNode.asText();
        System.out.println("name --> " + name);

//        JsonNode phoneNode = node.get("phoneNumbers");
//        String phoneNumbers = phoneNode.asText();
//        System.out.println("phones --> " + phoneNumbers);



//        JsonNode brandNode = node.get("brand");
//        String brand = brandNode.asText();
//        System.out.println("brand = " + brand);
//
//        JsonNode doorsNode = node.get("doors");
//        int doors = doorsNode.asInt();
//        System.out.println("doors = " + doors);
//
//        JsonNode array = node.get("owners");
//        JsonNode jsonNode = array.get(0);
//        String john = jsonNode.asText();
//        System.out.println("john  = " + john);
//
//        JsonNode child = node.get("nestedObject");
//        JsonNode childField = child.get("field");
//        String field = childField.asText();
//        System.out.println("field = " + field);

//        return "Check sout in console";
        return name;

    }

}
