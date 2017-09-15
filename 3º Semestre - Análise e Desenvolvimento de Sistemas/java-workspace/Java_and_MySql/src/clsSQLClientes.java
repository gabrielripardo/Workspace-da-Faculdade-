
import java.sql.Connection;  
import java.sql.PreparedStatement; 
import java.sql.SQLException; 

class clsSQLClientes{
	
    //chama sua classe para fazer conexao com o banco
    Connection con = new clsConexao().getConnection();
     
    //metodo construtor   
     public clsSQLClientes(){}
     public void Inserir() {
        //cria objeto    
    	 clsClientes cliente = new clsClientes();    
         String sql =  "insert into cadastro(id)VALUES(?)";        
         try {     
        	 PreparedStatement stmt = con.prepareStatement(sql);
        	 stmt.setInt(1, cliente.getid());                
             stmt.execute(); //executa comando       
             stmt.close();        
         }
         catch (SQLException u) {        
        	  throw new RuntimeException(u);        
         }    
     }
}