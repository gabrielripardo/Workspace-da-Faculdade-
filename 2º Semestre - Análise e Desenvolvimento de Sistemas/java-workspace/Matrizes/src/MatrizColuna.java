/**
 * Programa para imprimir uma matriz coluna de inteiros A = a(i,j)[3x1] 
 * onde a(i,j) = 1.. 3
 * @author George Mendonça
 * 23/08/2016
 * */
public class MatrizColuna {
	
	public static void main(String args[]) {
		System.out.println("Criar uma matriz coluna de inteiros A = a(ij)[3x1] onde a(ij) = 1.. 3:");
		int A[][] = new int[3][1];
		int tamanho = A.length;	// tamanho = 3

		// Imprimindo todos os elementos da matriz
		for(int i=0; i<tamanho; i++) {
			for (int j=0; j<1; j++) {
				A[i][j] = i + j;
				// Formata a impressão da matriz no console
				System.out.println("| " + A[i][j] + " |");
			}
		}
	}
}
