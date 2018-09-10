package com;

import java.util.*;

public class CreateStudentList {

    public static List<Student> studlist = new ArrayList<>();


    public List <Student> createStudlist(){

        Student st1 = new Student("Vasya", "Morda", "Man");
        Student st2 = new Student("Kolya", "Mordatiy", "Man");
        Student st3 = new Student("Petya", "Mordyga", "Man");

        studlist.add(st1);
        studlist.add(st2);
        studlist.add(st3);

        return studlist;
    }
}
