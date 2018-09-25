package com.student_jpa.student_jpa.dao.entity;

import lombok.Data;

import javax.persistence.*;

import static javax.persistence.GenerationType.IDENTITY;

@Data
@Entity
@Table
public class StudentTask {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private int id;

    @Column
    private String title;

}