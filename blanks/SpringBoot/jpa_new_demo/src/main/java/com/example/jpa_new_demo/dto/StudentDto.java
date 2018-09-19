package com.example.jpa_new_demo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class StudentDto {

    @JsonProperty("name")
    private String name;

    @JsonProperty("age")
    private int age;

    @JsonProperty("task_list")
    private List<TaskList> taskListDto;

    @Data
    public static class TaskList {
        @JsonProperty("title")
        private String title;
    }
}
