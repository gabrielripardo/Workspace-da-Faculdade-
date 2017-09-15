


import java.sql.*;
public class clsConexao {
    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/sortArray", "root", "mylife1024");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}