package dao;

import domenObject.Student;

public class MainStudentDao {

    public static void main(String[] args) throws SQLException {

        List<Student> studListDao = new ArrayList<>();

        StudentDao sd = new StudentDaoImpl();

        sd.selectAllStudents(studListDao);
        sd.selectById(12);
        sd.selectBySurname("karlova");

        sd.saveStudent("Hulk", "Hogan", "+174015628", "hulk@hogan.net");
        sd.selectBySurname("Hogan");
        sd.deleteStudentById(48);
    }
}
