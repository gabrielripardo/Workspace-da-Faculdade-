package designpatern.dao.cachorroList;
/*
 * Se tiver que mudar alguma informação à cerca do banco de dados, só precisa mudar em um só lugar
 * @date 04/09/2017
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
	public Connection getConnection(){
		try {
			String sqlite = "jdbc:sqlite:cachorros.db"; // Faz Conexão com banco
			return DriverManager.getConnection(sqlite);
		}catch(SQLException e){
			throw new RuntimeException("Error ao conectar com db: "+e);
		}
	}
}
