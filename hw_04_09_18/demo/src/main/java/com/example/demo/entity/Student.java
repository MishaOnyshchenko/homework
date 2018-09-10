package com.example.demo.entity;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {

    private int id;
    private String name;
    private String email;

}
