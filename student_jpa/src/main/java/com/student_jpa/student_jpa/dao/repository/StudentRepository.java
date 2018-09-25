package com.student_jpa.student_jpa.dao.repository;

import com.student_jpa.student_jpa.dao.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity,Long> {

    StudentEntity findStudentByNameAndAge(String name, int age);

    StudentEntity findStudentById(long id);

    StudentEntity findStudentByName(String name);

}
