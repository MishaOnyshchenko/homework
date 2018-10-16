package com.example.jackson_demo.service;

        import org.junit.Test;

        import java.io.IOException;

        import static org.junit.Assert.*;

public class JacksonServiceTest {

    @Test
    public void parseWithJsonNode() throws IOException {
        String expected = "David";
        JacksonService jacksonService = new JacksonService();
        String actual = jacksonService.parseWithJsonNode();
        assertEquals(expected, actual);
    }

    @Test
    public void parseWithJsonParser() throws IOException {
        String expected = "Bangalore";
        JacksonService jacksonService = new JacksonService();
        String actual = jacksonService.parseWithJsonParser();
        assertEquals(expected, actual);
    }
}