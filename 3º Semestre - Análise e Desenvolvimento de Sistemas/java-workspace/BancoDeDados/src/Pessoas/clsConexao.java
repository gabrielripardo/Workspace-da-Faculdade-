package Pessoas;

import java.sql.*;

import javax.swing.JOptionPane;

public class clsConexao {
    public Connection getConeccao(){
        Connection con = null;

        try {
            Class.forName("com.mysql.jdbc.Driver"); 
            String url = "jdbc:mysql://localhost/pessoas";
            String user = "root";
            String senha = "mylife1024";

            con = DriverManager.getConnection(url, user, senha);
            
            JOptionPane.showMessageDialog(null, "Os números foram armazenados no BD");
            
        } catch (ClassNotFoundException e){
            JOptionPane.showMessageDialog(null, "Erro ao carregar o drive");
            e.printStackTrace();
        } catch (SQLException e){
        	JOptionPane.showMessageDialog(null, "Error ao conectar!");
            e.printStackTrace();
        }
        return con;	
    }
}
