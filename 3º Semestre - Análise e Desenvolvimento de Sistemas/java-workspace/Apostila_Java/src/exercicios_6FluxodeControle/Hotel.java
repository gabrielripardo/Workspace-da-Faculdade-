/**
 * @Nome: Hotel_Salario.jar
 * @Função: O valor pago por um Hotel da Praia de Iracema para seus porteiros é de R$ 10,25 por hora de trabalho. Faça um 
 * programa que pergunte ao usuário quantas horas ele trabalhou e imprima na tela o valor do salário a ser recebido 
 * por ele.
 * @author: Gabriel Ripardo 
 * @Data_de_criação: 10/04/2017 
 *
 */

package exercicios_6FluxodeControle;
import java.util.Scanner;

public class Hotel {
	public static void main(String []args){
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a quantidade de horas trabalhadas: ");
		int qtdHoras = entrada.nextInt();
		float valHora = 10.25f;
		float valPago = qtdHoras * valHora;
		System.out.println("Salário: R$ " + valPago);
	}
}
