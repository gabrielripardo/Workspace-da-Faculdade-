
/**
 * Write a description of class Cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cliente
{
   private String cpf;
   private String nome;
   private String rg;
   
   // Método construtor da classe cliente
   public Cliente(String cpf, String nome, String rg){
       this.cpf = cpf;
       this.nome = nome;
       this.rg = rg;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    
    public String getNome(){
        return nome;
    }
    
    
    public String getRg(){
        return rg;
    }
    
}
