package com.example.jackson_demo.service;


import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

@Service
@Slf4j
public class GsonService {

    public Object jsonIntoObject() throws IOException {
        Object object = new Object();
        Gson gson = new Gson();

        File file = new File("D:\\0 - Java\\trash\\jackson_demo\\src\\main\\resources\\parseJson.json");
        JsonReader reader = new JsonReader(new FileReader(file));

        object = gson.fromJson(reader, Object.class);

        return object;
    }

    public String jsonFromObject() throws IOException {
        Object object = jsonIntoObject();

        Gson gson = new Gson();
        String json = gson.toJson(object);

        return json;
    }


    public String jsonReader() throws IOException {

        File file = new File("D:\\0 - Java\\trash\\jackson_demo\\src\\main\\resources\\parseJson.json");
        JsonReader jsonReader = new JsonReader(new FileReader(file));

        while (jsonReader.hasNext()) {
            JsonToken nextToken = jsonReader.peek();
            System.out.println(nextToken);

            if (JsonToken.BEGIN_OBJECT.equals(nextToken)) {

                jsonReader.beginObject();

            } else if (JsonToken.NAME.equals(nextToken)) {

                String name = jsonReader.nextName();
                System.out.println(name);

            } else if (JsonToken.STRING.equals(nextToken)) {

                String value = jsonReader.nextString();
                System.out.println(value);

            } else if (JsonToken.NUMBER.equals(nextToken)) {

                long value = jsonReader.nextLong();
                System.out.println(value);

            }
        }
        return "check sout";
    }
}
