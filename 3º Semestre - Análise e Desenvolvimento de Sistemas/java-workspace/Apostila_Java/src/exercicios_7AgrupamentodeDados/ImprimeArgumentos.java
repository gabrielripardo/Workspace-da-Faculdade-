/**
 * @funcao: Crie um programa que imprima na tela os argumentos passados na linha de comando para o método main. 
 * Compile e execute a classe ImprimeArgumentos. Na execução, não esqueça de passar alguns parâmetros na linha 
 * de comando.
 * @author: Gabriel Ripardo
 * @date: 14/04/2017
 */

package exercicios_7AgrupamentodeDados;
import java.util.Scanner;
public class ImprimeArgumentos {
	public static void main(String []args){
		Scanner entrance = new Scanner(System.in);
		int[] arrayNum = new int[5]; //Array de 10 números inteiros
		
		for(int i = 0; i < arrayNum.length; i++){
			
			System.out.print("Index " + i + " = ");
			int num = entrance.nextInt(); 
			arrayNum[i] = num; // Armazena o valor da variável de entrada em cada índice do array.
		}
		System.out.println("Argumentos passados: ");
		for(int i = 0; i < arrayNum.length; i++){
			int valor = i + 1;
			System.out.println("Valor " + valor + " = " + arrayNum[i]);
		}
	}
}
