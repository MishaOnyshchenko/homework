package com.studentsList.dao.studentDao;

import com.studentsList.model.Student;

public interface StudentDao {

    List<Student> selectAllStudents(List<Student> studListDao) throws SQLException;
}
