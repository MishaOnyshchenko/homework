package com.studentsList.model.createStudents;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CreateStudents {

    public Connection connection = null;

    public CreateStudents(Connection connection) {
        this.connection = connection;
    }


    public void fillStudentsTable(int size) throws SQLException {

        PreparedStatement psId = connection.prepareStatement("SELECT * FROM students WHERE id = (SELECT MAX (id) FROM students)");
        ResultSet rs = psId.executeQuery();
        int index;
        if(rs.next()){
            index = rs.getInt(1) + 1;
        }
        else{
           index = 1;
        }

        String sql = "INSERT INTO students VALUES (?, ?, ?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        for (int i = index; i < size + index; i++){
            ps.setInt(1, i);
            ps.setString(2, "Louis" + i);
            ps.setString(3, "Armstrong" + i);
            ps.executeUpdate();
        }
//       System.out.println("index = " + index);
    }
}
