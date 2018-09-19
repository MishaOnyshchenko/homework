package com.example.jpa_new_demo.dto.testDto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Glossary {

    @JsonProperty("GlossDiv")
    private Glossdiv glossdiv;

    @JsonProperty("title")
    private String title;
}
