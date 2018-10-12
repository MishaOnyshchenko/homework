package com.example.jackson_demo.service;


import com.example.jackson_demo.dao.entity.Car;
import com.example.jackson_demo.dao.repository.GsonRepositoryTutor;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.StringReader;

@Service
@Slf4j
public class GsonServiceTutor {

    @Autowired
    GsonRepositoryTutor gsonRepositoryTutor;


    public Car parseJsonIntoJavaObject() {

        String json = "{\"brand\":\"Jeep\", \"doors\": 3}";
        Gson gson = new Gson();
        Car car = gson.fromJson(json, Car.class);

        gsonRepositoryTutor.saveAndFlush(car);
        log.info(car.getBrand() + " saved");
        return car;
    }

    public String generateJsonFromJavaObject() {

        Car car = new Car();
        car.setBrand("Rover");
        car.setDoors(3);
        gsonRepositoryTutor.saveAndFlush(car);

        Gson gson = new Gson();
        String json = gson.toJson(car);

        return json;
    }


    public Car jsonReader() throws IOException {

        String json = "{\"brand\" : \"Toyota\", \"doors\" : 15}";

        JsonReader jsonReader = new JsonReader(new StringReader(json));

        Car car = new Car();

        try {
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
                    System.out.println("brand --> " + value);
                    car.setBrand(value);

                } else if (JsonToken.NUMBER.equals(nextToken)) {

                    long value = jsonReader.nextLong();
                    System.out.println("doors --> " + value);
                    car.setDoors((int)value);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        gsonRepositoryTutor.saveAndFlush(car);
        return car;
    }


    public String jsonParser(){
        JsonParser parser = new JsonParser();

        String json = "{ \"f1\":\"Hello\",\"f2\":{\"f3:\":\"World\"}}";

        JsonElement jsonTree = parser.parse(json);

        if(jsonTree.isJsonObject()){
            JsonObject jsonObject = jsonTree.getAsJsonObject();

            JsonElement f1 = jsonObject.get("f1");
            System.out.println("f1 --> " + f1);

            JsonElement f2 = jsonObject.get("f2");
            System.out.println("f2 --> " + f2);

            if(f2.isJsonObject()){
                JsonObject f2Obj = f2.getAsJsonObject();

                JsonElement f3 = f2Obj.get("f3");
                System.out.println("f3 --> " + f3);
            }
        }
        return "Check sout in console";
    }

}
