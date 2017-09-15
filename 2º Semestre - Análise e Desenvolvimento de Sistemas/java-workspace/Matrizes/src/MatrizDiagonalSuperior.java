/**
 * Programa para imprimir uma matriz diagonal superior de inteiros
 * A = a(i,j)[3x3] onde a(i,j) = |8 0 0|
 *                               |8 8 0|
 *                               |8 8 8|
 * @author George Mendonça
 * 23/08/2016
 * */

public class MatrizDiagonalSuperior {
	
	public static void main(String args[]) {
		System.out.println("Matriz  diagonal superior de inteiros " +
		                   "A = a(ij)[3x3] onde a(ij) = 0 se i-j < 0, " +
		                   "senão a(ij) = 8.");
		int A[][] = new int[3][3];
		int tamanho = A.length;
		
		for(int i=0; i<tamanho; i++) {
			for (int j=0; j<tamanho; j++) {
				if(i-j < 0)
					A[i][j] = 0;
				else
					A[i][j] = 8;
				
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
