package JavaBeans;
import	java.sql.*;
import java.util.Calendar;

class BancodeDados{
	public static void main(String[] args) throws SQLException{
		Connection conexao = null;
		Cachorro minie = new Cachorro();
		minie.setNome("Minie");
		minie.setAltura(40);
		minie.setDtNascimento(Calendar.getInstance());
		minie.setPeso(20);
		minie.setRaca("cok");
		
		
		try {
			conexao = DriverManager.getConnection("jdbc:sqlite:cachorros.db");
			
			String sql = "INSERT INTO CACHORRO (NOME, RACA, DT_NASCIMENTO, PESO, ALTURA) VALUES(?, ?, ?, ?, ?)";
			
			
			PreparedStatement stmt = conexao.prepareStatement(sql);
			
			stmt.setString(1, minie.getNome());
			stmt.setString(2, minie.getRaca());
			stmt.setDate(3, new Date(minie.getDtNascimento().getTimeInMillis()));
			stmt.setFloat(4, minie.getPeso());
			stmt.setFloat(5, minie.getAltura());
			
			stmt.execute();
			
			System.out.println("Conectado!");
			conexao.close();
		}catch(SQLException e){
			System.out.print("Ocorreu algum error! "+e);
		}finally {
			conexao.close();
		}
	}
}
