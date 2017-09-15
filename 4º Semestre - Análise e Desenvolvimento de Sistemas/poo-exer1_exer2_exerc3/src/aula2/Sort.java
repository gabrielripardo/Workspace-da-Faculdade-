/**
 * Números Ordenados
 * @author Gabriel Ripardo de Sena.
 * @date 21.08.2017
 * Funcão: Mostra o vetor ordenado do menor para o maior.
 */
package aula2;

public class Sort { // Estrutura de Dados: Bubble Sort

	public int[] ordenar(int[] ordenado){ // Método que retorna o vetor ordenado
		int ii = 0;
		while(ii < ordenado.length - 1){ // Traça a quatidade de comparações
			for(int i = 0; i < ordenado.length - 1; i++){ 
				int right = i + 1;
				if(ordenado[right] < ordenado[i]){ // Compara o elemento da direita com o da esquerda
					int aux = ordenado[i];	
					ordenado[i] = ordenado[right]; // Toca o elemento da esquerda pelo da direita
					ordenado[right] = aux; // Troca o elemento da direita pelo da esquerda
				}
			}
			ii++;
		}
		return ordenado; // Retorna a lista ordenada
	}
}
