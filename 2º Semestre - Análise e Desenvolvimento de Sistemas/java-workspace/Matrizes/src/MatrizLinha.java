/**
 * Programa para imprimir uma matriz linha de inteiros A = a(i,j)[1x3] 
 * onde a(i,j) = 1.. 3
 * @author George Mendonça
 * 23/08/2016
 * */

public class MatrizLinha {
	
	public static void main(String args[]) {
		System.out.println("Criar uma matriz linha de inteiros A = a(ij)[1x3] onde a(ij) = 1.. 3:");
		int A[][] = new int[1][3];
		int tamanho = A.length;

		for(int i=0; i<1; i++) {
			for (int j=0; j<3; j++) {
				A[i][j] = j+1;
				// Formata a impressão da matriz no console
				if(j == 0)
					System.out.print("| " + A[i][j] + " ");
				else if(j == tamanho + 1)
					System.out.println(" "  + A[i][j] + " |");
				else
					System.out.print(" "  + A[i][j] + " ");
			}
		}
	}
}
