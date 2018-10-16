package com.example.jackson_demo.service.rccServices;

import com.google.gson.*;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@Service
@Slf4j
public class RccServiceGSON {


    public void createJsonTree() throws IOException {

        File rccJsonFile = new File("D:\\0 - Java\\trash\\jackson_demo\\src\\main\\resources\\rcc.json");
        JsonReader reader = new JsonReader(new FileReader(rccJsonFile));
        JsonParser parser = new JsonParser();

        JsonElement jsonTree = parser.parse(reader);
        System.out.println("jsonTree-->" + jsonTree);

        checkIfObjectOrArray(jsonTree);
    }


    public void checkIfObjectOrArray(JsonElement jsonTree) throws IOException {

        if (jsonTree.isJsonObject()) {
            System.out.println("It is object-->" + jsonTree);

            parseAsObject(jsonTree);
        } else if (jsonTree.isJsonArray()) {
            JsonArray jsonArray = jsonTree.getAsJsonArray();
            System.out.println("It is array ------> " + jsonArray);

            parseAsArray(jsonTree);
        } else {
            System.out.println("not object/array");
        }
    }


    public void parseAsObject(JsonElement jsonTree) throws IOException {
        JsonObject jsonObject = jsonTree.getAsJsonObject();
        System.out.println("Parsing as object --> " + jsonObject);

        if (jsonObject.has("rcc")) {
            JsonElement rcc = jsonObject.get("rcc");
            System.out.println("Get element rcc --> " + rcc);
            checkIfObjectOrArray(rcc);
        } else if (jsonObject.has("sofit")) {
            JsonElement sofit = jsonObject.get("sofit");
            System.out.println("Get element sofit --> " + sofit);
            checkIfObjectOrArray(sofit);
        } else if (jsonObject.has("Place")) {

            JsonElement element = jsonObject.get("Place");
            System.out.println("Get element Place --> " + element);

            Map<String, String> map = new HashMap<>();

            Type type = new TypeToken<Map<String, String>>() {
            }.getType();
            map = new Gson().fromJson(jsonObject, (Type) map.getClass());

            System.out.println("--!--MAP--! ---> " + map);

        }

    }

    public void parseAsArray(JsonElement jsonElement) throws IOException {
        JsonArray jsonArray = jsonElement.getAsJsonArray();
        System.out.println("Parsing as array --> " + jsonArray);

        Iterator<JsonElement> iterator = jsonArray.iterator();

        while (iterator.hasNext()) {
            JsonElement element = iterator.next();
            System.out.println("array[i] -> " + element);

            if (element.isJsonObject()) {
                parseAsObject(element);
            }
        }

    }

}
