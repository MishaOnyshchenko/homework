package com.example.jackson_demo.service;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

@Service
@Slf4j
public class GsonService {

    String json = "{\n" +
            "  \"empID\": 100,\n" +
            "  \"name\": \"David\",\n" +
            "  \"permanent\": false,\n" +
            "  \"address\": {\n" +
            "    \"street\": \"BTM 1st Stage\",\n" +
            "    \"city\": \"Bangalore\",\n" +
            "    \"zipcode\": 560100,\n" +
            "    \"friend_addr\": {\n" +
            "      \"street\": \"one\",\n" +
            "      \"codes\": [\n" +
            "        12345,\n" +
            "        2345\n" +
            "      ]\n" +
            "    }\n" +
            "  },\n" +
            "  \"phoneNumbers\": [\n" +
            "    123456,\n" +
            "    987654\n" +
            "  ],\n" +
            "  \"role\": \"Manager\",\n" +
            "  \"cities\": [\n" +
            "    \"Los Angeles\",\n" +
            "    \"New York\"\n" +
            "  ],\n" +
            "  \"properties\": {\n" +
            "    \"age\": \"28 years\",\n" +
            "    \"salary\": \"1000 Rs\"\n" +
            "  }\n" +
            "}";

    public Object jsonIntoObject() throws IOException {
        Object object = new Object();
        Gson gson = new Gson();

        File file = new File("D:\\0 - Java\\trash\\jackson_demo\\src\\main\\resources\\parseJson.json");
        JsonReader reader = new JsonReader(new FileReader(file));

        object = gson.fromJson(reader, Object.class);

        return object;
    }

    public String jsonFromObject()throws IOException{
        Object object = jsonIntoObject();

        Gson gson = new Gson();
        String json = gson.toJson(object);

        return json;
    }


}
