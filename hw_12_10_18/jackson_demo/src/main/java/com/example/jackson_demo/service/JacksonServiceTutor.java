package com.example.jackson_demo.service;

import com.example.jackson_demo.dao.entity.Car;
import com.example.jackson_demo.dao.repository.JacksonRepositoryTutor;
import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.*;
import java.net.URL;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
public class JacksonServiceTutor {

    @Autowired
    JacksonRepositoryTutor jacksonRepositoryTutor;

    public List<Car> getAll() {
        return jacksonRepositoryTutor.findAll();
    }


    public Car createFromString() {
        ObjectMapper objectMapper = new ObjectMapper();
        String carJson =
                "{ \"brand\" : \"Mercedes\", \"doors\" : 5 }";
        try {
            Car car = objectMapper.readValue(carJson, Car.class);
            System.out.println("car brand = " + car.getBrand());
            System.out.println("car doors = " + car.getDoors());
            jacksonRepositoryTutor.saveAndFlush(car);
            log.info("car saved");
            return car;
        } catch (IOException e) {
            e.printStackTrace();
            log.error("car not saved");
            return null;
        }
    }


    public Car createFromReader() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        String carJson = "{ \"brand\" : \"BMW\", \"doors\" : 4 }";
        Reader reader = new StringReader(carJson);
        Car car = objectMapper.readValue(reader, Car.class);
        System.out.println("car brand = " + car.getBrand());
        System.out.println("car doors = " + car.getDoors());
        jacksonRepositoryTutor.saveAndFlush(car);
        log.info("car saved");
        return car;
    }


    public Car createFromFile() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        File file = new File("D:\\0 - Java\\trash\\jackson_demo\\src\\main\\resources\\jackson\\car.json");
        Car car = objectMapper.readValue(file, Car.class);
        System.out.println("car brand = " + car.getBrand());
        System.out.println("car doors = " + car.getDoors());
        jacksonRepositoryTutor.saveAndFlush(car);
        log.info("car saved from File");
        return car;
    }


    public Car createFromUrl() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        URL url = new URL("file:D:\\0 - Java\\trash\\jackson_demo\\src\\main\\resources\\jackson\\car.json");
        Car car = objectMapper.readValue(url, Car.class);
        System.out.println("car brand = " + car.getBrand());
        System.out.println("car doors = " + car.getDoors());
        jacksonRepositoryTutor.saveAndFlush(car);
        log.info("car saved from URL");
        return car;

    }


    public Car createfromInputStream() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        InputStream input = new FileInputStream("D:\\0 - Java\\trash\\jackson_demo\\src\\main\\resources\\jackson\\car.json");
        Car car = objectMapper.readValue(input, Car.class);
        System.out.println("car brand = " + car.getBrand());
        System.out.println("car doors = " + car.getDoors());
        jacksonRepositoryTutor.saveAndFlush(car);
        log.info("car saved from FileInputstream");
        return car;
    }


    public Car createFromByteArray() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        String carJson = "{ \"brand\" : \"Combi\", \"doors\" : 6 }";
        byte[] bytes = carJson.getBytes("UTF-8");
        Car car = objectMapper.readValue(bytes, Car.class);
        System.out.println("car brand = " + car.getBrand());
        System.out.println("car doors = " + car.getDoors());
        jacksonRepositoryTutor.saveAndFlush(car);
        log.info("car saved from DyteArray");
        return car;
    }


    public Car[] readObjectArrayFromJsonStringArray() throws IOException {
        String jsonArray = "[{\"brand\":\"ford\"}, {\"brand\":\"Fiat\"}]";
        ObjectMapper objectMapper = new ObjectMapper();
        Car[] cars = objectMapper.readValue(jsonArray, Car[].class);
        log.info("read Object Array from JSON Array");
        return cars;
    }


    public List<Car> readObjectListFromJsonStringArray() throws IOException {
        String jsonArray = "[{\"brand\":\"Pontiac\"}, {\"brand\":\"Bugatti\"}]";
        ObjectMapper objectMapper = new ObjectMapper();
        List <Car> cars = objectMapper.readValue(jsonArray, new TypeReference<List<Car>>(){});
        log.info("List from Json String Array");
        return cars;
    }

    public Map<String, Object> readMapFromJsonString() throws IOException{
        String jsonObj = "{\"brand\":\"Nissan\", \"doors\":8}";
        ObjectMapper objectMapper = new ObjectMapper();
        Map<String, Object> carMap = objectMapper.readValue(jsonObj, new TypeReference<Map<String, Object>>(){});
        log.info("Map from Json String Array");
        return carMap;

    }

    public Car ignoreUnknownJsonFields() throws IOException{
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        String carJson = "{ \"brand\":\"Toyota\", \"doors\":null }";
        Car car = objectMapper.readValue(carJson, Car.class);
        log.info("Ignored doors");
        return car;
    }


    public String writeJsonFromObjectToFile() throws IOException{
        ObjectMapper objectMapper = new ObjectMapper();
        Car car = new Car();
        car.setBrand("Matiz");
        car.setDoors(1);
        objectMapper.writeValue(new FileOutputStream("D:\\0 - Java\\trash\\jackson_demo\\src\\main\\resources\\jackson\\write.json"), car);
        return "Car saved to file \"write.json\"";
    }


    public String writeJsonFromObjectToString() throws IOException{
        ObjectMapper objectMapper = new ObjectMapper();
        Car car = new Car();
        car.setBrand("DeLorian");
        car.setDoors(2);
        return objectMapper.writeValueAsString(car);
    }


    public String treeModel() throws IOException{
        String carJson = "{ \"brand\" : \"Molokovoz\", \"doors\" : 2 }";
        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode jsonNode = objectMapper.readValue(carJson, JsonNode.class);
        return "Json parsed via tree model";
    }


    public void jsonNode()throws IOException{
        String carJson =
                "{ \"brand\" : \"Cadillac\", \"doors\" : 5," +
                        "  \"owners\" : [\"John\", \"Jack\", \"Jill\"]," +
                        "  \"nestedObject\" : { \"field\" : \"value\" } }";

        ObjectMapper objectMapper = new ObjectMapper();

        JsonNode node = objectMapper.readValue(carJson, JsonNode.class);

        JsonNode brandNode = node.get("brand");
        String brand = brandNode.asText();
        System.out.println("brand = " + brand);

        JsonNode doorsNode = node.get("doors");
        int doors = doorsNode.asInt();
        System.out.println("doors = " + doors);

        JsonNode array = node.get("owners");
        JsonNode jsonNode = array.get(0);
        String john = jsonNode.asText();
        System.out.println("john  = " + john);

        JsonNode child = node.get("nestedObject");
        JsonNode childField = child.get("field");
        String field = childField.asText();
        System.out.println("field = " + field);
    }


    public Car jsonParcer()throws IOException{
        String carJson = "{ \"brand\" : \"Buhanka\", \"doors\" : 1 }";
        JsonFactory factory = new JsonFactory();
        JsonParser parser = factory.createParser(carJson);

        Car car = new Car();

        while(!parser.isClosed()){
            JsonToken jsonToken = parser.nextToken();

            if(JsonToken.FIELD_NAME.equals(jsonToken)){
                String fieldName = parser.getCurrentName();
                System.out.println(fieldName);

                jsonToken = parser.nextToken();

                if("brand".equals(fieldName)){
                    car.setBrand(parser.getValueAsString());
                } else if ("doors".equals(fieldName)){
                    car.setDoors(parser.getValueAsInt());
                }
            }
        }
        jacksonRepositoryTutor.saveAndFlush(car);
        log.info("car saved");
        System.out.println("car.brand = " + car.getBrand());
        System.out.println("car.doors = " + car.getDoors());

        return car;
    }

    public String jsonGenerator() throws IOException{

        JsonFactory factory = new JsonFactory();
        JsonGenerator generator = factory.createGenerator(new File("D:\\0 - Java\\trash\\jackson_demo\\src\\main\\resources\\jackson\\generator.json"), JsonEncoding.UTF8);

        generator.writeStartObject();
        generator.writeStringField("brand", "Tesla");
        generator.writeNumberField("doors", 5);
        generator.writeEndObject();

        generator.close();

        return "JSON saved to \"generator.json\".";
    }

}
