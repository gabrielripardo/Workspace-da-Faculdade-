package Pessoas;

import java.util.*;

public class Cadastro {
	Scanner entra = new Scanner(System.in);
	String nome;
	int idade;
	
	public Cadastro(){
		
		entrada();
		
		clsClientes data = new clsClientes();
		data.setNome(this.nome);
		data.setIdade(this.idade);
		
		clsSQLClientes tabela = new clsSQLClientes();
        tabela.Inserir();    
	}
	
	public void entrada(){
		System.out.print("Digite o nome: ");
		nome = entra.nextLine();
		
		System.out.print("Digite a idade: ");
		idade = entra.nextInt();
	}
	
	public static void main(String[] args){
		new Cadastro();
	}
}
