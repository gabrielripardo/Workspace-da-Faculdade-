/**
 * @funcao Faça um programa que calcule a média dos elementos recebidos na linha de comando. Dica: para converter 
 * strings para double utilize o método parseDouble()
 * @author Gabriel Ripardo
 * @date 19/04/2017
 */

package exercicios_7AgrupamentodeDados;

import java.util.Scanner;

public class MediaDouble {
	Scanner in = new Scanner(System.in);
	String[] notas = new String[4];
	
	
	public void inserir(){
		for (int i = 0; i < notas.length; i++){
			System.out.printf("Valor %s: ", i);
			String valor = in.nextLine();
			notas[i] = valor;
		}
	}
	public void showList(){
		for(int index = 0; index < notas.length; index++){
			System.out.print(notas[index] + " ");
		}
	}
	public double mediaDouble(){
		double numsSoma = 0;
		
		for (int i = 0; i < notas.length; i++){		
			numsSoma = Double.parseDouble(notas[i]) + numsSoma;
		}
		double rsl = numsSoma / notas.length;
	return rsl;
	}
}
