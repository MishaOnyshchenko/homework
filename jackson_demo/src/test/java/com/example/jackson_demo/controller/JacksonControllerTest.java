//package com.example.jackson_demo.controller;
//
//import com.example.jackson_demo.service.JacksonService;
//import com.fasterxml.tutorJson.core.JsonFactory;
//import com.fasterxml.tutorJson.core.JsonParser;
//import com.fasterxml.tutorJson.core.JsonToken;
//import com.fasterxml.tutorJson.databind.JsonNode;
//import com.fasterxml.tutorJson.databind.ObjectMapper;
//import lombok.extern.slf4j.Slf4j;
//import org.junit.Before;
//import org.junit.Test;
//
//import java.io.File;
//import java.io.IOException;
//
//import static org.junit.Assert.assertEquals;
//
//@Slf4j
//public class JacksonControllerTest {
//
//    @Test
//    public void testJsonNode() throws IOException {
//        String expected = "David";
//        JacksonService jacksonService = new JacksonService();
//        String actual = jacksonService.parseWithJsonNode();
//        assertEquals(expected, actual);
//    }
//
//
//    @Test
//    public void testJsonParser() throws IOException {
//        String expected = "Bangalore";
//        JacksonService jacksonService = new JacksonService();
//        String actual = jacksonService.parseWithJsonParser();
//        assertEquals(expected, actual);
//    }
//}