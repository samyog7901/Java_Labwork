import java.sql.*;

public class JDBCInsertDemo {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb", "root", "m7S@Ms2!");
            String query = "INSERT INTO students(id, name, age, marks) VALUES(?, ?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(query);

            pstmt.setInt(1, 3);
            pstmt.setString(2, "Kanha");
            pstmt.setInt(3, 16);
            pstmt.setDouble(4, 90);
            pstmt.executeUpdate();

            System.out.println("Data inserted successfully.");
            conn.close();
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
