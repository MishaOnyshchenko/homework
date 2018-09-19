package com.example.jpa_new_demo.dto.testDto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Glossdiv {
    @JsonProperty("GlossList")
    private Glosslist glosslist;
    @JsonProperty("title")
    private String title;
}
