/**
 * Nome: Valor_da_equacao.jar 
 * Função: Calcular o valor das seguintes equações:
 * a. 3 – 2 – 1 + 2 + 1 + 3
 * b. 2 * 3 – 4 * 5
 * c. 2 + 6 – 3 / 7 * 9
 * d. 3 % 4 – 8
 * 
 * Autor: Gabriel Ripardo
 * Data de Criação: 08/04/2017
 */
package exercicios_5Expressoes;

public class Equacoes {
	public static void main(String []args){
		byte somsub = 3 - 2 - 1 + 2 + 1 + 3; // 3 - 2 = 1 - 1 = 0 + 2 + 1 + 3 = 6 
		byte mulsub = 2 * 3 - 4 * 5; // 6 - 20 = -14
		float all = (float) ((2 + 6) - ((3 / 7) * 9)); // 2 + 6 = 8 - 3 = 5 / 63 
		byte ressub = 3 % 4 - 8; // 
		
		System.out.printf("%s / %s / %s / %s",somsub, mulsub, all, ressub ); 
	}
}
