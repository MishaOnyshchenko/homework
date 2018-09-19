package com.example.jpa_new_demo.dao.entity;

import lombok.Data;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;


@Data
@Entity
@Table
public class TaskStudent {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int id;

    @Column
    private String title;
}
