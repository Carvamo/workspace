import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBconexion {
    public static void main(String[] args) {
        String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
        String DB_URL = "jdbc:mysql://localhost:3306/proyecto";
        String USER = "root";
        String PASS = "Aaron1234";

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName(JDBC_DRIVER);

            System.out.println("Conectando a la Base de Datos...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            String insertQuery = "INSERT INTO Referencia (token_id_IMEI, nombre, memoria_ram, procesador, almacenamiento, color) VALUES ('1234567890', 'G21', '6GB', 'Snapdragon 625', '256GB', 'Azul')";
            stmt = conn.prepareStatement(insertQuery);
            stmt.executeUpdate();
            System.out.println("Referencia creada correctamente.");

            stmt.close();

            String selectQuery = "SELECT * FROM Referencia";
            stmt = conn.prepareStatement(selectQuery);
            rs = stmt.executeQuery();

            stmt.close();

            String updateQuery = "UPDATE Referencia SET token_id_IMEI = 1234567890 WHERE nombre = XR20";
            stmt = conn.prepareStatement(updateQuery);
            stmt.setString(1, "new_value");
            stmt.setString(2, "value2");
            stmt.executeUpdate();
            System.out.println("Referencia actualizada correctamente.");

            stmt.close();

            String deleteQuery = "DELETE FROM Referencia WHERE toekn = ?";
            stmt = conn.prepareStatement(deleteQuery);
            stmt.setString(1, "value1");
            stmt.executeUpdate();
            System.out.println("Referencia eliminada correctamente.");

            rs.close();
            stmt.close();
            conn.close();
            System.out.println("Conexion Finalizada.");
        } catch (SQLException se) {
        se.printStackTrace();
        } catch (Exception e) {
        e.printStackTrace();
        } finally {
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

