package com.studentsList.dao.studentDaoImpl;

import com.studentsList.dao.studentDao.StudentDao;
import com.studentsList.model.Student;

import java.sql.*;
import java.util.*;

public class StudentDaoImpl implements StudentDao {

    public Connection connection = null;

    public StudentDaoImpl(Connection connection) {
        this.connection = connection;
    }

    @Override
    public List<Student> selectAllStudents(List<Student> studListDao) throws SQLException {

        String sql = "SELECT * FROM students";
        PreparedStatement ps = connection.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();

        while(rs.next()){
            Student student = new Student();
            //System.out.println(rs.getInt(1) + ". "+ rs.getString(2) + " " + rs.getString(3));
            student.setId(rs.getInt(1));
            student.setName(rs.getString(2));
            student.setSurname(rs.getString(3));
            studListDao.add(student);
        }

        return studListDao;
    }
}
