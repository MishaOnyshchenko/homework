package com.example.jackson_demo.service;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import jdk.nashorn.internal.parser.JSONParser;
import lombok.extern.slf4j.Slf4j;
import net.minidev.json.JSONObject;
import org.json.JSONArray;
import org.springframework.boot.json.JacksonJsonParser;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

@Service
@Slf4j
public class JacksonService {

    File jsonFile = new File("D:\\0 - Java\\trash\\jackson_demo\\src\\main\\resources\\parseJson.json");


    public String parseWithJsonNode() throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        JsonNode node = objectMapper.readValue(jsonFile, JsonNode.class);


        JsonNode empIDNode = node.get("empID");
        int empID = empIDNode.asInt();
        log.info("empID --> " + empID);


        JsonNode nameNode = node.get("name");
        String name = nameNode.asText();
        log.info("name --> " + name);

        JsonNode permanentNode = node.get("permanent");
        boolean permanent = permanentNode.asBoolean();
        log.info("permanent --> " + permanent);


        JsonNode addressNode = node.get("address");
        log.info("addressNode --> " + addressNode);

        JsonNode childFieldStreet = addressNode.get("street");
        String street = childFieldStreet.asText();
        System.out.println("street --> " + street);


        JsonNode friendAddrNode = addressNode.get("friend_addr");
        System.out.println("friendAddrNode --> " + friendAddrNode);

        JsonNode childFieldFriendStreet = addressNode.get("friend_addr").get("street");
        String friendStreet = childFieldFriendStreet.asText();
        System.out.println("friendStreet --> " + friendStreet);

        JsonNode childFieldFriendCodes = addressNode.get("friend_addr").get("codes");
        System.out.println("childFieldFriendCodes --> " + childFieldFriendCodes);

        JsonNode codeArray = addressNode.get("friend_addr").get("codes");
        JsonNode secondValue = codeArray.get(1);
        String secondValueString = secondValue.asText();
        System.out.println("secondValueString  = " + secondValueString);

        return name;
    }


    public String parseWithJsonParser() throws IOException {

        JsonFactory factory = new JsonFactory();
        JsonParser parser = factory.createParser(jsonFile);

        String name = null;
        int empId = 0;
        String city = null;
        String cityArr1 = null;
        String cityArr2 = null;



        while (!parser.isClosed()) {
            JsonToken jsonToken = parser.nextToken();

            if (JsonToken.FIELD_NAME.equals(jsonToken)) {
                String fieldName = parser.getCurrentName();
                System.out.println("fieldName ---> " + fieldName);

                jsonToken = parser.nextToken();

                if ("name".equals(fieldName)) {
                    name = parser.getValueAsString();
                    log.info("!name! ---> " + name);
                } else if ("empID".equals(fieldName)) {
                    empId = parser.getValueAsInt();
                    log.info("!Id! ---> " + empId);
                } else if ("city".equals(fieldName)) {
                    city = parser.getValueAsString();
                    log.info("!city! ---> " + city);
                }

                else if ("cities".equals(fieldName)) {

                    jsonToken = parser.nextToken();

                    cityArr1 = parser.getValueAsString();
                    log.info("!!!cityArr1!!! ---> " + cityArr1);
                    jsonToken = parser.nextToken();


                    cityArr2 = parser.getValueAsString();
                    log.info("!!!cityArr2!!! ---> " + cityArr2);
                }
            }
        }
        return city;
    }

}
