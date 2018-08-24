package com.studentsList;

import com.studentsList.dao.studentDaoImpl.StudentDaoImpl;
import com.studentsList.model.Student;
import com.studentsList.model.createStudents.CreateStudents;
import com.studentsList.service.connection.JdbcConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*Создать метод, который получает из базы данных имена студентов,
далее вывести их в браузере. Естественно предварительно нужно создать БД,
таблицу и наполнить ее студентами с именами..*/

public class AccessStudents {

    public static List<Student> createList() throws SQLException {

        List <Student> studlist = new ArrayList<>();

        Connection connection = JdbcConnection.createConnection();

        CreateStudents cs = new CreateStudents(connection);
        cs.fillStudentsTable(6);

        StudentDaoImpl studentDaoImpl = new StudentDaoImpl(connection);
        studentDaoImpl.selectAllStudents(studlist);

        return studlist;
    }
}