package com.example.jackson_demo.service.rccServices;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ControllerAdvice;

import java.io.DataInput;
import java.io.File;
import java.io.IOException;

@Service
@Slf4j
@ControllerAdvice
public class RccServiceJackson {


    public Object createObjectFromJson() throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        File rccJsonFile = new File("D:\\0 - Java\\trash\\jackson_demo\\src\\main\\resources\\rcc.json");

        Object obj = objectMapper.readValue(rccJsonFile, Object.class);

        return obj;
    }


    public Object javaObjectToJson() throws IOException {

        ObjectMapper objectMapper = new ObjectMapper();
        Object obj = createObjectFromJson();
        objectMapper.writeValue(new File("D:\\0 - Java\\trash\\jackson_demo\\src\\main\\resources\\rccJsonFromJavaObject.json"), obj);

        return obj;
    }


    public String jsonNode() {
        ObjectMapper objectMapper = new ObjectMapper();
        File jsonFile = new File("D:\\0 - Java\\trash\\jackson_demo\\src\\main\\resources\\rcc.json");

        try{
            JsonNode jsonNodeRoot = objectMapper.readValue(jsonFile, JsonNode.class);
            System.out.println("root --> " + jsonNodeRoot);

            JsonNode rccArray = jsonNodeRoot.get("rcc");
            System.out.println("rccArray --> " + rccArray);

                JsonNode rccObj = rccArray.get(0);
                System.out.println("rccObj --> " + rccObj);
                System.out.println();


                    JsonNode rccSofit = rccObj.get("sofit");
                    System.out.println("sofit --> " + rccSofit);

                        JsonNode rccSofitPlace = rccSofit.get("Place");
                        System.out.println("--Place --> " + rccSofitPlace);
                        System.out.println();


                    JsonNode rccArrayOvk = rccObj.get("ovk");
                    JsonNode rccOvkId = rccArrayOvk.get(0);
                    System.out.println("ovk --> " + rccOvkId);


                    JsonNode rccComment = rccObj.get("comment");
                    System.out.println("comment --> " + rccComment);
        }
        catch(IOException exc){
            exc.getStackTrace();
        }
        return "Check sout in console";
    }
}
