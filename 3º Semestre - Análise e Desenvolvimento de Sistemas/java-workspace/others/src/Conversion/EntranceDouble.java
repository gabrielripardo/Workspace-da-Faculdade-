/**
 * @descricao O programa irá pedir a entrada de dois números flutuantes, depois irá soma-los. O objetivo é entrar com valores flutuantes usando a classe
 * Scanner.
 * @author Gabriel Ripardo
 * @date 22/04/17
 */
package Conversion;
import java.util.Scanner;
public class EntranceDouble {
	public static void main(String[] args){
		Scanner entrance = new Scanner(System.in);
		String nS1 = entrance.next();
		String nS2 = entrance.next();
		
		float n1 = Float.parseFloat(nS1); // Conversão de valores do tipo String para float.
		float n2 = Float.parseFloat(nS2); // Conversão de valores do tipo String para float.
		
		double SomaF = n1 + n2;
		System.out.println(SomaF);
	}
}
