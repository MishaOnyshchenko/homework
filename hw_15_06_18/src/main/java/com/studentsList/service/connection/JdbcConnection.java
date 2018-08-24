package com.studentsList.service.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {

    private static Connection connection = null;

    public static Connection createConnection(){

        System.out.println("----------- PostgreSQL JDBC Connection testing -------------");
        try{
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/students","postgres","postgres");
        }
        catch(ClassNotFoundException exc){
            System.out.println("PostgreSQL JDBC Driver couldn't find! Include it your library path!");
            exc.printStackTrace();
        }
        catch(SQLException sexc){
            System.out.println("Connection failed! Check output console.");
            sexc.printStackTrace();
        }
        System.out.println("PostgreSQL JDBC driver registered!");
        return connection;
    }
}
