/**
 * @funcao: Faça um programa que ordene o array de strings recebido na linha de comando. Compile e execute a classe 
 * Ordena. Na execução, não esqueça de passar alguns parâmetros na linha de comando.
 * @author: Gabriel Ripardo
 * @date: 16/04/2017
 */
package exercicios_7AgrupamentodeDados;
import java.util.Scanner;
public class ArrayStrings {
	String[] lista = new String[5];
	
	Scanner entrance = new Scanner(System.in);
	
	public String[] listaArray(){
		int qtd = 0;
		while(qtd < lista.length){
			System.out.print("String " + qtd + ": ");
			String words = entrance.nextLine();
			lista[qtd] = words;
			qtd++ ;
		}
		return lista;
	}

	//public String[] sort(){
	//	return 
	//}
	public void showList(){
		System.out.println("All the strings");
		for(int num = 0; num < lista.length; num++){
			System.out.println(lista[num]);
		}
	}
}





