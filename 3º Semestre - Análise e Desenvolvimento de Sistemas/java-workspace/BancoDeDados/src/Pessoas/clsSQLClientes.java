package Pessoas;

import java.sql.Connection;  
import java.sql.PreparedStatement; 
import java.sql.SQLException; 

class clsSQLClientes{
	
    //chama sua classe para fazer conexao com o banco
    Connection con = new clsConexao().getConeccao();
     
    public void Inserir() {
		
	    //cria objeto    
		clsClientes cliente = new clsClientes();   
		 
		// Syntaxe do MySql armazenada na variável "sql".
		String sql =  "insert into dataPessoas (nomeDB, idadeDB) VALUES(??)";        
		
		System.out.print(cliente.getNome() + cliente.getIdade());
		
		// Tentar inserir preparar tudo, inserir os valores e fechar conexão
		try {     
			 PreparedStatement stmt = con.prepareStatement(sql); // Cria um objeto do tipo PreparedStatement 
			 con.prepareStatement(sql);
			 stmt.setString(1, "Um valor"); 
			 stmt.setInt(2, 20);  // inseri os valores da outra classe
			 stmt.execute(); //executa comando    
			 stmt.close();        
		}catch (SQLException u) {        
			throw new RuntimeException(u);  // Utiliza o throw caso dê errado  
			
		}    
    }
}