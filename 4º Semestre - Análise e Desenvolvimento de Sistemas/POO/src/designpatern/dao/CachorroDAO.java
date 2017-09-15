/**
 * Modularizar as classes, toda classe faz algo o específico, sem haver mistura.
 * Deixando o programa organizado.
 */

package designpatern.dao;
import java.sql.*;


public class CachorroDAO {
	private Connection conexao = null;
	
	public void abrirConexao() {
		if(this.conexao == null){
			this.conexao = new ConnectionFactory().getConnection();	
		}
	}
	public void adicionar(Cachorro cao){
		try{
			this.abrirConexao();
			
			String sql = "insert into cachorro(nome, raca, dt_nascimento, peso, altura) values (?, ?, ?, ?, ?)";
			PreparedStatement stmt = this.conexao.prepareStatement(sql);
			
			stmt.setString(1, cao.getNome());
			stmt.setString(2, cao.getRaca());
			stmt.setDate(3, new Date(cao.getDtNascimento().getTimeInMillis()));
			stmt.setFloat(4, cao.getPeso());
			stmt.setFloat(5, cao.getAltura());	
			
			stmt.execute();
			stmt.close();
		}
		catch(SQLException e){
			System.out.print("Erro no Sistema: "+e);
		}finally {
			this.fecharConexao();
		}
	}
	public void fecharConexao() {
		try{
			if(this.conexao != null){
				this.conexao.close();
				this.conexao = null;
			}
		}catch(SQLException e){
			System.out.print("Error ao fechar conexão: "+e);
		}
	}
}
