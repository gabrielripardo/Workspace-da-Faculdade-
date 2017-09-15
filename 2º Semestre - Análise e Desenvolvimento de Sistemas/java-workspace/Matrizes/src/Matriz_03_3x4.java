/**
 * Programa para imprimir uma matriz de inteiros do tipo A = a(i,j)[3x4] 
 * onde a(i,j) = i + j, gerando os elementos com i e j.
 * @author George Mendonça
 * 23/08/2016
 * */

public class Matriz_03_3x4 {
	
	public static void main(String args[]) {
		System.out.println("A = a(ij)[3x4] onde a(ij) = i + j - Declarando "+
		                   "todos os elementos automaticamente com as variávais i e j:");
		int A[][] = new int[3][4];
		int tamanho = A.length;	// tamanho = 3
		
        // Imprimindo os elementos da matriz
		for(int i=0; i<tamanho; i++) {
			for (int j=0; j<(tamanho+1); j++) {
				A[i][j] = i + j;
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
