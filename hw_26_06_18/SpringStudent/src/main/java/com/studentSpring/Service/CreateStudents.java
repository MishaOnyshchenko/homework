package com.studentSpring.Service;

import com.studentSpring.model.Student;

import java.util.ArrayList;



public class CreateStudents {

    public static ArrayList<Student> students = new ArrayList<>();


    public ArrayList<Student> create(){
//        Student st1 = new Student();
//        st1.setName("Vasya");
//        st1.setSurname("Petya");
//        st1.setGender("m");
//        students.add(st1);
//
//
//        Student st2 = new Student();
//        st2.setName("Vasya2");
//        st2.setSurname("Petya2");
//        st2.setGender("m2");
//        students.add(st2);
//        for (Student s: students) {
//            System.out.println(s.getName() + " " + s.getSurname() + ", " + s.getGender());
//        }

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
