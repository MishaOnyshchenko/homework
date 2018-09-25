package com.student_jpa.student_jpa.dao.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
@Table
public class StudentEntity {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column
    private long id;

    @Column(nullable = false)
    private String name;

    private int age;


    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<StudentTask> studentTaskList;



}
