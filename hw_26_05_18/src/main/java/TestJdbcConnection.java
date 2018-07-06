public class TestJdbcConnection {

    private static Connection connection = null;

    private static int cnt;

    public static void main(String[] args) throws SQLException {

        connection = createConnection();
        if(connection != null){
            System.out.println("You have connection with database!\n");
        }
        else{
            System.out.println("Failed to make connection");
        }

        selectAllStudents();

        selectByEmail();
    }

    private static Connection createConnection(){
        Connection connection = null;
        System.out.println("----------- PostgreSQL JDBC Connection testing -------------");
        try{
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/student_db",
                    "postgres", "qwerty");
        }
        catch(ClassNotFoundException exc){
            System.out.println("PostgreSQL JDBC Driver couldn't find! Include it your library path!");
            exc.printStackTrace();
        }
        catch(SQLException exc){
            exc.printStackTrace();
            System.out.println("Connection failed! Check output console.");
            exc.printStackTrace();
        }
        System.out.println("PostgreSQL JFBC driver registered!");
        return connection;
    }

    private static void selectAllStudents() throws SQLException{

        PreparedStatement ps = connection.prepareStatement("SELECT * FROM student");
        ResultSet rs = ps.executeQuery();

        while (rs.next()){
            cnt++;
            System.out.println( cnt + ". " + rs.getString(1) + " " + rs.getString(2));
        }
        System.out.println("\nTotal: " + cnt + " students in the table.\n");
    }

    private static void selectByEmail () throws SQLException {
        PreparedStatement ps2 = connection.prepareStatement("SELECT * FROM student WHERE email LIKE ?");
        ps2.setString(1, "%@gmail.com");
        ResultSet rs2 = ps2.executeQuery();

        System.out.println("Next students use gmail:");

        while (rs2.next()){
            System.out.println(rs2.getString(1) + " " + rs2.getString(2) + ", email: " + rs2.getString(4));
        }
    }
    private static void insertPrepareStatement () throws SQLException {
        String sql = "INSERT INTO student VALUES (?, ?, ?, ?)";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setString(1, "Irina");
        pstmt.setString(2, "Lavrova");
        pstmt.setString(3, "099");
        pstmt.setString(4, "irina@gmail.com");
        pstmt.executeUpdate();
    }
}
