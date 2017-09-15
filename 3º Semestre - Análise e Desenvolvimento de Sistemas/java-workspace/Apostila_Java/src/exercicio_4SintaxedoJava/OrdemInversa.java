package exercicio_4SintaxedoJava;
/** 
 *  Nome: OrdemInversa.jar
 *  Função: Crie um programa que receba três argumentos da linha de comando e imprima-os na mesma linha, em 
 * ordem inversa
 * 
 * Autor: Gabriel Ripardo 
 * Data de Criação: 08/04/2017
 * Comentário: Programa com lógica simples.
 */

import java.util.Scanner;

public class OrdemInversa {
	static Scanner entrada = new Scanner(System.in);
	public static void main(String []args){
		
		System.out.print("Digite o número 1/3: ");
		String input1 = entrada.nextLine();
		
		System.out.print("Digite o número 2/3: ");
		String input2 = entrada.nextLine();
		
		System.out.print("Digite o número 2/3: ");
		String input3 = entrada.nextLine();
		
		
		// Operações
		
			String swap = input1;
			input1 = input3;
			input3 = swap;
		
		
		System.out.printf("Números invertidos: %s, %s, %s", input1, input2, input3);
		
	}
	
}
