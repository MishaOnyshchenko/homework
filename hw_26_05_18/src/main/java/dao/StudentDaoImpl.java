package dao;

import domenObject.Student;

import java.sql.*;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    private Connection connection = null;

    public StudentDaoImpl() {
        connection = createConection();
    }

    private Connection createConection(){
        Connection connection = null;
        try{
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/student_db",
                    "postgres", "postgres");
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        catch(SQLException se){
            se.printStackTrace();
        }
        if(connection != null){
            System.out.println("You have connection with database!\n");
        }
        else{
            System.out.println("Failed to make connection!");
        }
        return connection;
    }

    @Override
    public List<Student> selectAllStudents(List<Student> studListDao) throws SQLException {
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM student");
        ResultSet rs = ps.executeQuery();
        Student student = null;

        while(rs.next()){
            student = new Student(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
            System.out.println(rs.getInt(5) + ". " + student.getName() + " " + student.getSurname() + ", tel: " + student.getPhone() + ", email: " + student.getEmail());
            studListDao.add(student);
        }
        return studListDao;
    }

    @Override
    public Student selectById(int idNum) throws SQLException {
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM student WHERE id = " + idNum);
        //ps.setInt(1, idNum); not work
        ResultSet rs = ps.executeQuery();
        rs.next();
        Student student = new Student(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
        System.out.println(rs.getInt(5) + ". " + student.getName() + " " + student.getSurname() + ", tel: " + student.getPhone() + ", email: " + student.getEmail());

        return student;
    }

    @Override
    public Student selectBySurname(String surname) throws SQLException {
        Student student = null;
        PreparedStatement ps = connection.prepareStatement("SELECT * FROM student WHERE surname = ?");
        ps.setString(1, surname);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            student = new Student(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4));
            System.out.println(rs.getInt(5) + ". " + student.getName() + " " + student.getSurname() + ", tel: " + student.getPhone() + ", email: " + student.getEmail());
        }
        return student;
    }

    @Override
    public void saveStudent(String name, String surname, String phone, String email) throws SQLException {
        String sql = "INSERT INTO student VALUES (?, ?, ?, ?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, name);
        ps.setString(2, surname);
        ps.setString(3, phone);
        ps.setString(4, email);
        ps.executeUpdate();
        System.out.println("Student: " + name + " " + surname + " saved!");
    }

    @Override
    public void deleteStudentById (int idNum) throws SQLException {
        String sql = "DELETE FROM student WHERE id = " + idNum;
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.executeUpdate();
        System.out.println("Student " + idNum + " deleted!");
    }
}
