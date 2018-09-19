package com.example.jpa_new_demo.dto.testDto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Glossdef {

    @JsonProperty("GlossSeeAlso")
    private List<String> glossseealso;

    @JsonProperty("para")
    private String para;
}
