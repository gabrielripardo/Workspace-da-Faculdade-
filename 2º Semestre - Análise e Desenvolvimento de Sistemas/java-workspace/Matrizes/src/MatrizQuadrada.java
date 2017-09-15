/**
 * Programa para imprimir uma matriz quadrada de inteiros A = a(i,j)[4x4]
 * onde a(i,j) = j^2
 * @author George Mendonça
 * 23/08/2016
 * */

public class MatrizQuadrada {
	
	public static void main(String args[]) {
		System.out.println("Matriz quadrada de inteiros A = a(ij)[4x4] onde a(ij) = j^2:");
		int A[][] = new int[4][4];
		int tamanho = A.length;
		
		for(int i=0; i<tamanho; i++) {
			for (int j=0; j<tamanho; j++) {
				A[i][j] = j*j;
				// Formata a impressão da matriz no console
				if(j == 0)
					System.out.print("| " + A[i][j] + " ");
				else if(j == tamanho - 1)
					System.out.println(" "  + A[i][j] + " |");
				else
					System.out.print(" "  + A[i][j] + " ");
			}
		}
	}
}
