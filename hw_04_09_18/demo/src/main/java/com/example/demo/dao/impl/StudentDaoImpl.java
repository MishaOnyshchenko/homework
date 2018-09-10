package com.example.demo.dao.impl;

import com.example.demo.dao.StudentDao;
import com.example.demo.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {


    private List<Student> studentList = new ArrayList<>();


    @Override
    public List<Student> getAllStudents() {

        if(studentList.isEmpty()){
            for (int i = 1; i <= 10; i++) {
                Student student = new Student(i, "Student" + i, "student" + i + "@yahoo.com");
                studentList.add(student);
            }
        }
        return studentList;
    }


    @Override
    public Student getById(int id) {

        return studentList.get(id - 1);
    }


    @Override
    public Student getByName(String name) {

        Student student = new Student();

        for (Student s : studentList) {
            if (s.getName().equals(name)) {
                student = s;
            }
        }
        return student;
    }


    @Override
    public void addStudent(String name) {

        Student student = new Student(studentList.size()+1, name, name.toLowerCase() + "@yahoo.com");

        studentList.add(student);
    }


    @Override
    public void updateStudent(int id, String name) {

        studentList.get(id -1 ).setName(name);
    }


    @Override
    public void deleteStudent(int id) {

        studentList.remove(id-1);
    }

}
