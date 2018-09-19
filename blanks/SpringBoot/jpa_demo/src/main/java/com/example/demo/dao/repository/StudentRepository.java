package com.example.demo.dao.repository;

import com.example.demo.dao.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long>{

//    @Query
    Student findByNameAndAge(String name, int age);

//    @Query
//    Student getStudentByNameAndAgeReturn();
}
