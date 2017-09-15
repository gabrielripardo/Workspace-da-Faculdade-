package Pessoas;

public class clsClientes {

	public static String nome;
	public static int idade;
    
	public void setNome(String nome){
        clsClientes.nome = nome; // Não pode ser this.nome por que é um atributo do tipo static
    }
    public String getNome(){
        return clsClientes.nome;
    }
    public void setIdade(int idade){
    	clsClientes.idade = idade; //irá inserir o valor no atributo
    }
    public int getIdade(){
    	return clsClientes.idade;
    }
}