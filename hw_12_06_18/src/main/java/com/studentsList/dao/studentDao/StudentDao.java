package com.studentsList.dao.studentDao;

import com.studentsList.model.Student;

import java.sql.*;
import java.util.*;

public interface StudentDao {

    List<Student> selectAllStudents(List<Student> studListDao) throws SQLException;
}
