import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCUpdateDemo {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/mydb";
        String user = "root";
        String password = "m7S@Ms2!";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);

            // Update query
            String updateQuery = "UPDATE students SET marks = ? WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(updateQuery);

            // Setting parameters
            pstmt.setDouble(1, 95); // New marks
            pstmt.setInt(2, 3);  // ID of the student to update

            // Executing update
            int rowsUpdated = pstmt.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Record updated successfully.");
            } else {
                System.out.println("No record found with the given ID.");
            }

            conn.close();
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}
