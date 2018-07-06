package com.studentsList.model.createStudents;

public class CreateStudents {

    public Connection connection = null;

    public CreateStudents(Connection connection) {
        this.connection = connection;
    }

    public void fillStudentsTable(int size) throws SQLException {

        PreparedStatement psId = connection.prepareStatement("SELECT * FROM gender WHERE id = (SELECT MAX (id) FROM gender)");
        ResultSet rs = psId.executeQuery();
        int index;
        if(rs.next()){
            index = rs.getInt(1) + 1;
        }
        else{
           index = 1;
        }

        String sql = "INSERT INTO gender VALUES (?, ?, ?, ?, ?)";
        PreparedStatement ps = connection.prepareStatement(sql);
        for (int i = index; i < size + index; i++){
            ps.setInt(1, i);
            ps.setString(2, "Come " + i);
            ps.setString(3, "On " + i);

            if(i % 2 == 0){
                ps.setString(4,"m");
            }
            else{
                ps.setString(4,"w");
            }
            ps.setString(5, "301" + i);

            ps.executeUpdate();
        }
//        System.out.println("index = " + index);
    }
}
