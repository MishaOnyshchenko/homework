package com.example.jpa_new_demo.dao.entity;


import lombok.Data;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;


@Data
@Entity
@Table(name = "new_student")
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int id;


    @Column(nullable = false)
    private String name;

    //    does nullable work with int (0 != null)?
    @Column(nullable = false)
    private int age;


    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<TaskStudent> taskListStudent;

}
