import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBconexion {
    public static void main(String[] args) {
        // JDBC driver name and database URL
        String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        String DB_URL = "jdbc:mysql://localhost:3306/proyecto";

        // Database credentials
        String USER = "root";
        String PASS = "Aaron1234";

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            // Register JDBC driver
            Class.forName(JDBC_DRIVER);

            // Open a connection
            System.out.println("Conectando a la Base de Datos...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // Create a new record
            String insertQuery = "INSERT INTO Referencia (token_id_IMEI, nombre, memoria_ram, procesador,almacenamiento, color) VALUES ('1234567890', 'G21', '6GB', '256GB', 'Azul')";
            stmt = conn.prepareStatement(insertQuery);
            stmt.setString(1, "value1");
            stmt.setString(2, "value2");
            stmt.executeUpdate();
            System.out.println("Referencia creada correctamente.");

        
            String selectQuery = "SELECT * FROM Referencia";
            stmt = conn.prepareStatement(selectQuery);
            rs = stmt.executeQuery();
            while (rs.next()) {
                // Retrieve data from result set
                String column1Value = rs.getString("column1");
                String column2Value = rs.getString("column2");
                System.out.println("Column1: " + column1Value + ", Column2: " + column2Value);
            }

            // Update a record
            String updateQuery = "UPDATE Referencia SET token_id_IMEI = 1234567890 WHERE nombre = XR20";
            stmt = conn.prepareStatement(updateQuery);
            stmt.setString(1, "new_value");
            stmt.setString(2, "value2");
            stmt.executeUpdate();
            System.out.println("Referencia actualizada correctamente.");

            // Delete a record
            String deleteQuery = "DELETE FROM Referencia WHERE token_id_IMEI = 2345678901";
            stmt = conn.prepareStatement(deleteQuery);
            stmt.setString(1, "value1");
            stmt.executeUpdate();
            System.out.println("Referencia eliminada correctamente.");

            // Close the resources
            rs.close();
            stmt.close();
            conn.close();
            System.out.println("Conexion Finalizada.");
        } catch (SQLException se) {
        // Handle errors for JDBC
        se.printStackTrace();
        } catch (Exception e) {
        // Handle errors for Class.forName
        e.printStackTrace();
        } finally {
        // Finally block to close resources
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}

