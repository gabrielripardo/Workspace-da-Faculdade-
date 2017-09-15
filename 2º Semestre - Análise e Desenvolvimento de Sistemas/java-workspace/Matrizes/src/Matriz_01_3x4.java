/**
 * Programa para imprimir uma matriz de inteiros do tipo A = a(i,j)[3x4] 
 * onde a(i,j) = i + j, definindo elemento por elemento.
 * @author George Mendonça
 * 23/08/2016
 * */
public class Matriz_01_3x4 {
	
	public static void main(String args[]) {
		System.out.println("A = a(ij)[3x4] onde a(ij) = i + j - Declarando "+
		                   "elemento por elemento:");
		int A[][]; // Matriz multidimencional
		A = new int[3][4]; // Instanciando o objeto com tamanho 3x4
		int tamanho = A.length;	// tamanho = 3	
		// Definindo os elementos da matriz posição por posição
		A[0][0] = 0;
		A[0][1] = 1;
		A[0][2] = 2;
		A[0][3] = 3;
		A[1][0] = 1;
		A[1][1] = 2;
		A[1][2] = 3;
		A[1][3] = 4;
		A[2][0] = 2;
		A[2][1] = 3;
		A[2][2] = 4;
		A[2][3] = 5;
		
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
