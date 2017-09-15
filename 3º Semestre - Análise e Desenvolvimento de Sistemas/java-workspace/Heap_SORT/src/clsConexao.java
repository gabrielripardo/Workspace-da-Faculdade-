

import java.sql.*;
public class clsConexao {
    public Connection getConnection() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/teste", "root", "123");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}