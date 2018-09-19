package com.example.jpa_new_demo.dto.testDto;

import com.example.jpa_new_demo.dto.testDto.Glossary;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class TestDto {


    @JsonProperty("glossary")
    private Glossary glossary;
}
