/**
 * Modularizar as classes, toda classe faz algo o específico, sem haver mistura.
 * Deixando o programa organizado.
 */

package designpatern.dao.cachorroList;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


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
			
			String sql = "insert into cachorro(nome, raca, peso, altura) values (?, ?, ?, ?)";
			PreparedStatement stmt = this.conexao.prepareStatement(sql);
			
			stmt.setString(1, cao.getNome());
			stmt.setString(2, cao.getRaca());
			stmt.setFloat(3, cao.getPeso());
			stmt.setFloat(4, cao.getAltura());	
			
			stmt.execute();
			stmt.close();
		}
		catch(SQLException e){
			System.out.print("Erro no Sistema: "+e);
		}finally {
			this.fecharConexao();
		}
	}
	public List<Cachorro> listarData(){
		List<Cachorro> dog = new ArrayList<Cachorro>();
		
		try {
			abrirConexao();
			String sqlSelect = "select * from cachorro";
			PreparedStatement stmt = this.conexao.prepareStatement(sqlSelect);
			ResultSet rs = stmt.executeQuery();
			
			while(rs.next()) {
				Cachorro cao = new Cachorro(); // Criar novo objeto cachorro para guardar os dados que ele irá capturar do select
				
				cao.setNome(rs.getString("NOME")); // Inseri o valor de Nome do DB em um objeto Cachorro
				cao.setRaca(rs.getString("RACA"));		
				cao.setPeso(rs.getFloat("PESO"));
				cao.setAltura(rs.getFloat("ALTURA"));
				
				dog.add(cao);
			}
			rs.close();
			stmt.close();
		}catch(SQLException e) {
			System.out.print("Ocorreu um error: "+e);
		}
		finally {
			this.fecharConexao();
		}
		return dog;
	}
	public void deletar(String cachrNm) {
		try {
			this.abrirConexao();
			String sqlDel = "delete from cachorro where nome=?";
			PreparedStatement stmt = this.conexao.prepareStatement(sqlDel);
			stmt.setString(1, cachrNm);	
			stmt.execute();
			stmt.close();
		}catch(SQLException e){
			System.out.print("Erro ao deletar: "+e);
		}finally {
			this.fecharConexao();
		}
	}
	public List<Cachorro> buscarNome(String inicial) {
		// Mesma estrutura do método listar e com estrutura condicional para mostrar só os nomes com iniciais iguais ao parâmetro.
		List<Cachorro> dogs = this.listarData();
		List<Cachorro> c = new ArrayList();
		
		for(Cachorro cach: dogs) {
			String nmBd = String.valueOf(cach.getNome());
			String paramChar = null;
			String nmBdChar = null;
			int nComp = inicial.length();
			
			// Max nCompções
			if(nmBd.length()<inicial.length()) {
				nComp = nmBd.length();
			}
			int cont = 0;
			if(cach.getNome() != null && nmBd.length() >= inicial.length()) {
				for(int i=0; i < nComp; i++) {
					paramChar = String.valueOf(inicial.charAt(i)); 
					nmBdChar = String.valueOf(nmBd.charAt(i));
					//System.out.println("nCompções "+nmBdChar.toLowerCase()+" - "+paramChar.toLowerCase());
					if(paramChar.toLowerCase().equals(nmBdChar.toLowerCase())) {
						cont++;
					}
				}
				if(cont == nComp) {
					Cachorro cao = new Cachorro();
					//System.out.print("#"+cont+" Nome: #"+nmBd);
					cao.setNome(cach.getNome());
					cao.setRaca(cach.getRaca());
					cao.setPeso(cach.getPeso());
					cao.setAltura(cach.getAltura());
					
					c.add(cao);
				}
			}
		}
		return c;
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
