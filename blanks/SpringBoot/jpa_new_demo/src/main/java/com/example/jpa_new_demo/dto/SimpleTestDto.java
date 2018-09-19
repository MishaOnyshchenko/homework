package com.example.jpa_new_demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class SimpleTestDto {

    @JsonProperty("orderCompleted")
    private boolean ordercompleted;

    @JsonProperty("contents")
    private List<Contents> contents;

    @JsonProperty("shopperEmail")
    private String shopperemail;

    @JsonProperty("shopperName")
    private String shoppername;

    @JsonProperty("orderID")
    private int orderid;

    public static class Contents {

        @JsonProperty("quantity")
        private int quantity;

        @JsonProperty("productName")
        private String productname;

        @JsonProperty("productID")
        private int productid;
    }
}
