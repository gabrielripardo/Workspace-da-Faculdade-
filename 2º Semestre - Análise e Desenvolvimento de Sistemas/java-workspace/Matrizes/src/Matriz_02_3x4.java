/**
 * Programa para imprimir uma matriz de inteiros do tipo A = a(i,j)[3x4] 
 * onde a(i,j) = i + j, definindo os elementos em uma única instrução.
 * @author George Mendonça
 * 23/08/2016
 * */

public class Matriz_02_3x4 {
	
	public static void main(String args[]) {
		System.out.println("A = a(ij)[3x4] onde a(ij) = i + j - Declarando "+
		                   "todos os elementos em uma única instrução:");
		int A[][] = {{0, 1, 2, 3}, {1, 2, 3, 4}, {2, 3, 4, 5}};
		int tamanho = A.length;	// tamanho = 3
		
		// Imprimindo os elementos da matriz
		for(int i=0; i<tamanho; i++) {
			for (int j=0; j<(tamanho+1); j++) {
				// Formata a impressão da matriz no console
				if(j == 0)
					System.out.print("| " + A[i][j] + " ");
				else if(j == tamanho)
					System.out.println(" "  + A[i][j] + " |");
				else
					System.out.print(" "  + A[i][j] + " ");
			}
		}
	}
}
