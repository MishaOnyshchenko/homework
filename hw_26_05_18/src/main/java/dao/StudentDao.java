package dao;

import domenObject.Student;

import java.sql.SQLException;
import java.util.List;

public interface StudentDao {

    List<Student> selectAllStudents(List<Student> studListDao) throws SQLException;
    Student selectById(int idNum) throws SQLException;
    Student selectBySurname(String surname) throws SQLException;
    void saveStudent(String name, String surname, String phone, String email) throws SQLException;
    void deleteStudentById (int idNum) throws SQLException;

}
