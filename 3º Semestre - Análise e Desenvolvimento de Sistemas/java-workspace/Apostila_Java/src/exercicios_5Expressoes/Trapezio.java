/**
 * Nome: Area_do_trapezio.jar
 * Função: Implemente um programa para calcular a área de um trapézio, onde: 
 *  h = altura
 *	b = base menor 
 *	B = base maior
 *	Área = (h . (b + B)) / 2
 * Autor: Gabriel Ripardo
 * Data de criação: 08/04/2017
 */

package exercicios_5Expressoes;
import java.util.Scanner;
public class Trapezio {
	static Scanner entrada = new Scanner(System.in);
		
	public static void main(String []args){
		
		System.out.print("Digite a altura: ");
		int altura = entrada.nextInt();
		
		System.out.print("Digite a base menor: ");
		int baseMaior = entrada.nextInt();
	
		System.out.print("Digite a base maior: ");
		int baseMenor = entrada.nextInt();
		
		double area = (altura * (baseMaior + baseMenor))/2;
		
		System.out.print("Área do trapézio é igual a " + area);
		
	}
}
