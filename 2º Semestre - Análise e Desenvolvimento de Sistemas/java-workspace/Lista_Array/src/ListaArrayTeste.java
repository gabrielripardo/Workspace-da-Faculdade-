/**
 * Testando a classe ListaArray
 * @author George Mendonça
 * Data: 24/09/2016
 * Atualização: dd/mm/aaaa
 * */
import java.util.Arrays;

public class ListaArrayTeste {
	
	public static void main(String[] args) {
		// Criando o objeto Lista
		ListaArray lista = new ListaArray();
		
		// Adicionando elementos à Lista
		lista.add(new Double(100));
		lista.add(new Integer(22));
		lista.add(new Integer(-35));
		lista.add(false);
		lista.add(new Integer(2));
		lista.add(new Integer(700));
		lista.add(new Integer(17));
		lista.add(new String("George Mendonça"));
		
		// Imprimindo a Lista
		System.out.println("Imprimindo os elementos da lista: ");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i) + " ");
		}
		System.out.print("\n"); // Quebra de linha
		
		// Adicionando o sexto elemento na Lista
		lista.add(new Integer(29));
		
		// Imprimindo o 6° elemento e o tamanho da Lista
		System.out.println("Elemento na posição 5: " + lista.get(5));
		System.out.println("Tamanho total da Lista: " + lista.size());
		
		// Removendo o último elemento da Lista
		System.out.println("Removendo elemento na posição 2: " + lista.remove(2));
		
		// 
		for (int i = 0; i < 5; i++) {
			lista.add(i);
		}
		
		// Imprimindo os elementos restantes da lista
		System.out.println("\nImprimindo todos os elementos adicionados e mantidos na Lista: ");
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i) + " ");
		}
	}
}
/*
RESULTADO ESPERADO:
	Imprimindo os elementos da lista: 
	100.0 22 -35 false 2 700 17 George Mendonça 
	Elemento na posição 5: 700
	Tamanho total da Lista: 9
	Removendo elemento na posição 2: -35

	Imprimindo todos os elementos adicionados e mantidos na Lista: 
	100.0 
	22 
	false 
	2 
	700 
	17 
	George Mendonça 
	29 
	0 
	1 
	2 
	3 
	4
*/
