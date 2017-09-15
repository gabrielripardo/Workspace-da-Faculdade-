/** Crivo de Esrastotenes
 * @author Gabriel Ripardo de Sena
 * @date 20-08-2017
 * Funcao: Utilizando o crivo de Eratóstenes gerar uma sequência de números primos 
 * em ordem crescente até o número informado como parâmetro. 
 */
package aula2;
public class CrivoEratostenes {
	CrivoEratostenes(int numero){
		int[] lista = new int[numero];
		
		int var = 1;
		while(var <= lista.length){ // Inseri os números de 1 até o n no vetor
			lista[var - 1] = var;
			var++;
		}
		
		int limite = (int) Math.sqrt(numero); // Descobre a raíz quadrada do número e converte pra inteiro. 
		int cont = 1;
		while(cont < limite){ // Percorre pelos divisores da lista
			int divisor = lista[cont];
			
			for(int ii = 0; ii < lista.length; ii++){ 	// Percorre pelos denominadores da lista
				int denominador = lista[ii];
					
				if(denominador > 1 && divisor > 1 && denominador != divisor){ // Denominador e divisor devem ser positivos e diferentes entre si.
					if(denominador % divisor == 0){ // Faz a verificação para ver se o número é divísivel pelo denominador.
						lista[ii] = -denominador; // Classifica os números que não são primos em números negativos
					}
				}
			}
			cont++;
		}
		
		for(int i = 0; i < lista.length; i++){// Percorre a lista
			if(lista[i] > 1){ //verifica se o valor é maior que 1
				System.out.printf(" - %s",lista[i]);// Faz o print apenas dos números maiores que 1
			}
		}
	}
}
