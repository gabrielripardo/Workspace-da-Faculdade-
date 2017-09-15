/**
 * @funcao Construa uma classe java que leia a tabela anterior e informe ao usuário o tempo necessário para percorrer duas cidades 
 * por ele fornecidas, até o momento em que ele fornecer duas cidades iguais (origem e destino).  
 * @author Gabriel Ripardo
 * @date 19/04/17
 */

package exercicios_7AgrupamentodeDados;
import java.util.Scanner;
public class CidadesMatrizes {
	
	static Scanner city = new Scanner(System.in);
	
	public static void main(String[] args){
	
		int[][] matriz = new int[7][7]; // 7 colunas e 7 linhas
		
		 matriz[0][0] = 0;
		 matriz[0][1] = 2;
		 matriz[0][2] = 11;
		 matriz[0][3] = 6;
		 matriz[0][4] = 15;
		 matriz[0][5] = 11;
		 matriz[0][6] = 1;
		 
		 // Distâncias da linha 1 ou cidade B
		 matriz[1][0] = 2;
		 matriz[1][1] = 0;
		 matriz[1][2] = 7;
		 matriz[1][3] = 12;
		 matriz[1][4] = 4;
		 matriz[1][5] = 2;
		 matriz[1][6] = 15;
		 
		 // Distâncias da linha 2 ou cidade C
		 matriz[2][0] = 11;
		 matriz[2][1] = 7;
		 matriz[2][2] = 0;
		 matriz[2][3] = 11;
		 matriz[2][4] = 8;
		 matriz[2][5] = 3;
		 matriz[2][6] = 13;
		 
		 matriz[3][0] = 6;
		 matriz[3][1] = 12;
		 matriz[3][2] = 11;
		 matriz[3][3] = 0;
		 matriz[3][4] = 10;
		 matriz[3][5] = 2;
		 matriz[3][6] = 1;
		 
		 
		 matriz[4][0] = 15;
		 matriz[4][1] = 4;
		 matriz[4][2] = 8;
		 matriz[4][3] = 10;
		 matriz[4][4] = 0;
		 matriz[4][5] = 5;
		 matriz[4][6] = 13;
		 
		 
		 matriz[5][0] = 11;
		 matriz[5][1] = 2;
		 matriz[5][2] = 3;
		 matriz[5][3] = 2;
		 matriz[5][4] = 5;
		 matriz[5][5] = 0;
		 matriz[5][6] = 14;
		 
		 matriz[6][0] = 1;
		 matriz[6][1] = 15;
		 matriz[6][2] = 13;
		 matriz[6][3] = 1;
		 matriz[6][4] = 13;
		 matriz[6][5] = 14;
		 matriz[6][6] = 0;
		 
		 // Entrada de dados da cidade de origem e destino
		 	
		 	System.out.println("Cidades: A, B, C, D, E, F, G");
		 	
		 	System.out.print("Cidade origem: ");
		 	String origem = city.next();
		 	
		 	System.out.print("Cidade destino: ");
		 	String destino = city.next();
		 	
		 	int line = 0;
		 	if(origem.toUpperCase().equals("A"))
		 		line = 0;
		 	else if(origem.toUpperCase().equals("B"))
		 		line = 1;
		 	else if(origem.toUpperCase().equals("C"))
		 		line = 2;
		 	else if(origem.toUpperCase().equals("D"))
		 		line = 3;
		 	else if(origem.toUpperCase().equals("E"))
		 		line = 4;
		 	else if(origem.toUpperCase().equals("F"))
		 		line = 5;
		 	else if(origem.toUpperCase().equals("G"))
		 		line = 6;
		 	
		 
		 	int col = 0;
		 	if(destino.toUpperCase().equals("A"))
		 		col = 0;
		 	else if(destino.toUpperCase().equals("B"))
		 		col = 1;
		 	else if(destino.toUpperCase().equals("C"))
		 		col = 2;
		 	else if(destino.toUpperCase().equals("D"))
		 		col = 3;
		 	else if(destino.toUpperCase().equals("E"))
		 		col = 4;
		 	else if(destino.toUpperCase().equals("F"))
		 		col = 5;
		 	else if(destino.toUpperCase().equals("G"))
		 		col = 6;
		 
		 	// Distância entre a cidade de origem e destino
		 	int dist = matriz[line][col]; 
		 	
		 	System.out.println("col = " + col);
		 	System.out.println("line = " + line);
		 	System.out.printf("Distância entre a cidade %s e %s é %s", origem, destino, (int)dist);
		 	
	}
}












