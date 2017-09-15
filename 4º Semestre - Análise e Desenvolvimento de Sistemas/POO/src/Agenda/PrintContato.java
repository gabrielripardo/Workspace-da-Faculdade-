package Agenda;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class PrintContato extends DbContato{
	public Contato conta;
	public Scanner entry;
	public boolean isEmpty; // Atibuto usado por dois métodos para verificar se há conteúdo na tabela
	
	public PrintContato(){
		entry = new Scanner(System.in);
		conta = new Contato();
		isEmpty = true;
	}
	int verificarBanco() { // Verifica se tem conteúdo no Banco
		int ids = 0;
		List <Contato> listCts = super.listarData();
		for(Contato ct:listCts) {
			if(ct.getId() > 0) {
				ids++;
			}
		}		
		return ids;
	}
	boolean inserirContato(){ // Insere um novo contato
		entry.nextLine();
		System.out.print("Nome: ");
		String nmCt = entry.nextLine();
		System.out.print("Telefone: ");
		String telCt = entry.nextLine();
		System.out.print("Email: ");
		String mailCt = entry.next();
		
		conta.setNome(nmCt);
		conta.setTelefone(telCt);
		conta.setEmail(mailCt);
		
		int idsOld = this.verificarBanco(); // Verifica a quantidade de contatos atual
		
		super.adicionarContato(conta); // Adiciona o objeto contato no bd
		
		int idsNew = this.verificarBanco(); // Verifica se o novo contato foi adicionado
		if(idsNew > idsOld) {
			return true;
		}else {
			return false;
		}
	}
	boolean buscarTodos(){
		int id = 1;
		List <Contato> listCts = super.listarData();
		boolean hasCt = false;
		for(Contato ct:listCts) {
			
			if(ct.getId() >= 0) {
				System.out.print(id+++" - Nome: "+ct.getNome()+" || ");
				System.out.print("Telefone: "+ct.getTelefone()+" || ");
				System.out.println("E-mail: "+ct.getEmail());
				hasCt = true;
			}
		}
		return hasCt;
	}
	List<Contato> buscarPorNome(){
		isEmpty = true;
		List <Contato> listCtsNm = null; 
		if(this.verificarBanco() > 0) {
			System.out.print("Digite o nome: ");
			String nomCt = entry.next();
			
			int id = 1;
			listCtsNm = super.buscarNome(nomCt);
			for(Contato ct:listCtsNm) {
				if(ct.getId() > 0) {
					System.out.print(id+" - Nome: "+ct.getNome()+" || ");
					System.out.print("Telefone: "+ct.getTelefone()+" || ");
					System.out.println("E-mail: "+ct.getEmail());
					
					isEmpty = false;
					id++;
				}
			}
			if(isEmpty) {
				System.out.println("Este nome não existe!");
			}
		}else {
			System.out.println("Não há contatos!");
		}
		return listCtsNm;
	}
	boolean deletar(){
		int idsOld = this.verificarBanco();
		List<Contato> choose = buscarPorNome();
		if(isEmpty == false) {		
			System.out.println("\n>> Escolha um id referente ao contato <<");
				try {	
					System.out.print("Digite o id: ");
					int nmChoose = entry.nextInt();
					int id = choose.get(nmChoose - 1).getId();
					super.deletarContato(id);
				}catch(InputMismatchException ime) {// Warning: Precisa ser tratado.
					System.out.println("Sintaxe desconhecida!\n Aviso: Inicie o programa novamente.");

				}catch(IndexOutOfBoundsException iofbe) {
					System.out.println("O Id não está correto ");	
				}	
		}
		int idsNew = this.verificarBanco();
		if(idsNew < idsOld) {
			return true;
		}else {
			return false;
		}
	}
	void limparTela() {
		for(int c=0; c<100; c++) {
			System.out.println("");
		}
	}
}
