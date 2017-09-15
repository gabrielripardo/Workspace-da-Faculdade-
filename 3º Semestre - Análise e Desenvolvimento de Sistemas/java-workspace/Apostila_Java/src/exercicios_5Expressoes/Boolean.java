/**
 * Name: Boolean.jar
 * Função: d) Indique qual o valor verdade das seguintes expressões:
 * a. (1 > 2) // exemplo: false
 * b. (8 == 8) // exemplo: true
 * c. ((12 – 5) > 6)
 * d. (0 < 3) && (8 < 9)
 * e. ((i++) > i)
 * f. ((10 * 90 / 50 – 2) == 16)
 * Autor: Gabriel Ripardo
 * Data de criação: 08/04/2017
 */
package exercicios_5Expressoes;


public class Boolean {
	static boolean exp1, exp2, exp3, exp4, exp5, exp6;
	static int i = 10;
	public static void main(String []args){
		exp1 = 1 > 2;
		exp2 = 8 == 8;
		exp3 = (12 - 5) > 6;
		exp4 = (0 < 3) && (8 < 9);
		exp5 = (i++) > i;
		exp6 = (10 * 90 / 50 -2) == 6;
		
	System.out.printf(exp1 + " \n" + exp2 + " \n" + exp3 + " \n" + exp4 + " \n" + exp5 + " \n" + exp6);
	}
}
