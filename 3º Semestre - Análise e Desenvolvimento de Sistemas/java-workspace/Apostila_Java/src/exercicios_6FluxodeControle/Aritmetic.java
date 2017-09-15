	/** Nome: Aritmetic.jar
 * 	Função: Escreva um programa que imprima na tela a soma dos números ímpares entre 0 e 20 e a multiplicação dos 
 *  números pares entre 0 e 20.
 *	@autor: Gabriel Ripardo.
 *  Data de criação: 09/04/2017
 */

package exercicios_6FluxodeControle;

public class Aritmetic {
	public static void main(String [] args){
		double parVar = 1;
		int impVar = 0;
			for(int i = 1; i <= 20; i++){
				boolean imp_par = (i % 2) == 0;
	
				if (imp_par){ // valores pares = 2 - 4 - 6 - 8 - 10 - 12 - 14 - 16 - 18 - 20
				//	i = numPar
					parVar *= i;
					System.out.println("Valores pares: " + i);
					//	int left = i;  var(2) = 2 * 1/ var(2) = 2 * 4/ var(8) = 8 * 6 /var(48) = 48 * 8/ var(336) = 336 * 10 
				//	int right = i * left;
					// var = var * i // var(1) = 1 * 2 / var(2) = 2 * 4 / var(8) = 8 * 6  
					
				}else{ // valores ímpares = 1 - 3 - 5 - 7 - 9 - 11 - 13 - 15 - 17 - 19  
					// impPar = impPar + i / impPar(0) = 0 + 1 / impPar(1) = 1 + 3 / impPar(4) = 4 + 6
					impVar += i;
					System.out.println("Valores ímpares: " + i);
					
				}
			}
		System.out.println("Número par de 1 a 20 multiplicados: " + parVar);
		System.out.println("Número ímpar de 1 a 20 somados: " + impVar);
	}
}
