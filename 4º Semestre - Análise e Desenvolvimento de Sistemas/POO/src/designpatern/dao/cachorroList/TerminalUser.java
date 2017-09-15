package designpatern.dao.cachorroList;
import java.util.List;
import java.util.Scanner;
public class TerminalUser extends CachorroDAO {
	Cachorro cao;
	Scanner entry;
	boolean isEmpty;
	
	TerminalUser(){
		entry = new Scanner(System.in);
		cao = new Cachorro();
		isEmpty = true;
		//bd = new CachorroDAO();
		//inserirCachorro();
		//this.deletar();
		//this.listarData();
		//this.buscarPorNome();
	}
	void inserirContato(){
		System.out.print("Nome: ");
		String nmDog = entry.nextLine();
		System.out.println("Digitado = "+nmDog);
		
		System.out.print("Raça ");
		String rcDog = entry.nextLine();
		System.out.println("Digitado = "+rcDog);
		
		cao.setNome(nmDog);
		cao.setRaca(rcDog);
		
		super.adicionar(cao);
	}
	void buscarTodos(){
		List <Cachorro> cachorrosList = super.listarData();
		for(Cachorro dog:cachorrosList) {
			System.out.print("Nome: "+dog.getNome()+" -> ");
			System.out.print("Raça: "+dog.getRaca()+" -> ");
			System.out.print("Peso: "+dog.getPeso()+" -> ");
			System.out.print("Altura: "+dog.getAltura()+"\n");
		}
	}
	String buscarPorNome(){
		System.out.print("Digite o nome: ");
		String nmCar = entry.next();
		
		List <Cachorro> dogList = super.buscarNome(nmCar);

		for(Cachorro dog:dogList) {
			if(dog.getNome() != null) {
				System.out.print("Nome: "+dog.getNome()+" -> ");
				System.out.print("Raça: "+dog.getRaca()+" -> ");
				System.out.print("Peso: "+dog.getPeso()+" -> ");
				System.out.print("Altura: "+dog.getAltura()+"\n");
				System.out.println();
				
				isEmpty = false;
			}
		}
		if(isEmpty) {
			System.out.print("Este nome não existe!");
		}
		return nmCar;
	}
	void deletarContato(){
		String word = this.buscarPorNome();
		if(isEmpty == false) {
			super.deletar(word);
		}
	}
	public static void main(String[] args) {
		TerminalUser objeto = new TerminalUser();
		//objeto.buscarTodos();
		objeto.buscarPorNome();
		//objeto.deletar();
		//objeto.inserirCachorro();
	}
}
