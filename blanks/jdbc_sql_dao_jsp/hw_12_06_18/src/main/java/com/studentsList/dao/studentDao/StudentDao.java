package com.studentsList.dao.studentDao;

import com.studentsList.model.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentDao {

    List<Student> selectAllStudents(List<Student> studListDao) throws SQLException;
}
