/**
 * Função: Faça o programa acima calcular utilizando valores de ponto flutuante e depois imprima na tela duas 
 *  informações:
 *   Valor exato da área:
 *   Valor arredondado para inteiro:
 * Autor: Gabriel Ripardo
 * Data de criação: 08/04/2017
 * Comentário: Minha era ideia pegar o valor de entrada como String e depois converter para um valor real.
 */

package exercicios_5Expressoes;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Trapezio2 {
	
	public static void main(String []args){
		
		InputStream input = System.in;
		Scanner entrada = new Scanner(input);
		
		System.out.print("Digite a altura: ");
		double altura = entrada.nextDouble();
			
		System.out.print("Digite a base menor: ");
		double baseMaior = entrada.nextFloat();
	
		System.out.print("Digite a base maior: ");
		double baseMenor = entrada.nextFloat();
		
		double area = (altura * (baseMaior + baseMenor))/2;
		int areaArr = (int)(altura * (baseMaior + baseMenor))/2;
		
		System.out.println("Valor exato da área: " + area);
		System.out.print("Valor arrendondado para inteiro: " + areaArr);

	}
}
