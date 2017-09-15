package Biblioteca;
import java.util.Scanner;
public class test extends Obra{
	public static void main(String []args){
	
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Cadastro -- Biblioteca JK");
		
		System.out.print("1.Usuário");
		int option = entrada.nextInt();
		
		System.out.print("2.Livro");
		option = entrada.nextInt();
		
		String [] curso = new String[1000];
		
		switch(option){
			case 1: // Cadastramento de usuários
				System.out.print("Opções para usuários");
				System.out.print("1. Aluno");
				System.out.print("2. Departamento");
				System.out.print("3. Professor");
				
				switch(option){
					case 1:
						System.out.print("Informe o curso: ");
							String date = entrada.nextLine();
	
					case 2:
						System.out.print("Informe o departamento: ");
						String departamento[] = new String[1000];
					case 3:
						System.out.print("Informe o departamento: ");
						departamento = new String[1000];
			}
			case 2: System.out.print("");// Cadastramento de livros		
		}
		
		//Obra livro = new Obra();
		//livro.setCient("O poder do conhecimento");
		//livro.setCient("Ansiedade");
		
		for(int i = 0; i < 5; i++){
			//livro.setCient([]);
		}
	}
}
