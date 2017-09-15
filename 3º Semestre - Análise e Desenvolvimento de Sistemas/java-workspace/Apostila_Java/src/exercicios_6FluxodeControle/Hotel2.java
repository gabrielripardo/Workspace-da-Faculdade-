/**
 * @Nome: Direito_do_trabalhador.jar 
 * @Função: Modifique o programa anterior para que o sistema imprima uma mensagem de alerta quando o valor a ser pago 
 * ao funcionário seja inferior a R$ 50,00: "Atenção, dirija-se à direção do Hotel!"
 * @author: Gabriel Ripardo.
 * @Data_de_criação: 10/04/2017
 */

package exercicios_6FluxodeControle;
import java.util.Scanner;
public class Hotel2 {
	public static void main(String []args){
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite a quantidade de horas trabalhadas: ");
		int qtdHora = input.nextInt();
		float valPago = qtdHora * (float) 10.25;
		
		if (valPago >= 50){
			System.out.println("Salário: R$ " + valPago);
		}else{
			System.out.println("Atenção, dirija-se à direção do hotel!");
		}
	}
}
