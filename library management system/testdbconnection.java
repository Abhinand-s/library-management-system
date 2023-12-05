import java.sql.Connection;
import java.sql.SQLException;

public class testdbconnection {

    public static void main(String[] args) {
        Connection connection = DB.getConnection();
        try {
            if (connection != null) {
                System.out.println("Connected to the database");
                // Perform additional database-related operations if needed
            } else {
                System.out.println("Failed to connect to the database");
            }
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}