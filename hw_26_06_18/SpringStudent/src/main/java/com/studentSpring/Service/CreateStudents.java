package com.studentSpring.Service;

import com.studentSpring.model.Student;

import java.util.ArrayList;



public class CreateStudents {

    public static ArrayList<Student> students = new ArrayList<>();


    public ArrayList<Student> create(){

        if(students.isEmpty()){
            for(int i = 1; i <= 10; i++){
                Student student = new Student();
                student.setName("John" + i);
                student.setSurname("Deere" + i);
                if(i % 2 == 0){
                    student.setGender("m");
                }
                else{
                    student.setGender("w");
                }
                students.add(student);
            }
        }
        return students;
    }








}
