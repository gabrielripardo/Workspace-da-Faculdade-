/** @Nome ParouImpar.jar
 *  @Função: Faça um programa para ler um número do teclado e imprimir na tela se ele é par ou ímpar. 
 * 	@author: Gabriel Ripardo
 *  @Data_de_Criação: 09/04/2017 
 */
package exercicios_6FluxodeControle;
import java.util.Scanner;
import java.io.InputStream;
public class ParImpar {
	public static void main(String []args){
		InputStream entrance = System.in;
		Scanner entrada = new Scanner(entrance);
	
		System.out.print("Digite um número: ");
		int val = entrada.nextInt();
		boolean parImpar = (val % 2) == 0;
		
		if (parImpar){
			System.out.printf("O número " + val +  " é par");
		}else{
			System.out.printf("O número "  + val + " é ímpar");
		}
	}
}
