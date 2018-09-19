package com.example.jpa_new_demo.dto.testDto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Glossentry {
    @JsonProperty("GlossSee")
    private String glosssee;
    @JsonProperty("GlossDef")
    private Glossdef glossdef;
    @JsonProperty("Abbrev")
    private String abbrev;
    @JsonProperty("Acronym")
    private String acronym;
    @JsonProperty("GlossTerm")
    private String glossterm;
    @JsonProperty("SortAs")
    private String sortas;
    @JsonProperty("ID")
    private String id;
}
