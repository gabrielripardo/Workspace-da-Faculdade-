package designpatern.padraoFactory;
import java.sql.*;
import java.util.Calendar;

//import java.util.Date;
import org.sqlite.SQLiteException;

public class DBInsert {
	public static void main(String[] args) throws SQLException{
		//Connection conexao = DriverManager.getConnection("jdbc:sqlite:cachorros.db");
		Connection conexao = null;
		try{
			conexao = new ConnectionFactory().getConnection();
			
			String sql = "INSERT INTO CACHORRO (NOME, RACA, DT_NASCIMENTO, PESO, ALTURA) VALUES(?, ?, ?, ?, ?)";
			
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			stmt.setString(1, "Allan");
			stmt.setString(2, "Pudow");
			stmt.setDate(3, new Date(Calendar.getInstance().getTimeInMillis()));
			stmt.setFloat(4, (float) 8.5);
			stmt.setFloat(5, (float) 0.70);
	
			stmt.execute();
			
			System.out.println("Conectado!");
		}catch(SQLiteException e) {
			System.out.println("Ocorreu algum problema!" + e);
		}finally {
			conexao.close();
		}
	}
}
