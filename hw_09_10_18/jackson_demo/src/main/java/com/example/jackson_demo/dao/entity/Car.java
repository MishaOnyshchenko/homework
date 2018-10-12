package com.example.jackson_demo.dao.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table
public class Car {

    @Id
    @GeneratedValue
    long id;

    @Column
    private String brand = null;

    @Column
    private int doors = 0;
}
