/* Velocity of Download
 * Autor: Gabriel Ripardo
 * Data: 26/09/16
 * Função: Mostrar os minutos para completar um download.
 */

import java.util.Scanner;

public class Velocidade {
	public static void main(String []args){
		Scanner file = new Scanner (System.in);
		float size;
		System.out.println("Digite o Tamanho em MB: ");
		size = file.nextFloat();
		
		Scanner velocity = new Scanner (System.in);
		float vm;
		System.out.println("Digite a velocidade em Mbps: ");
		vm = velocity.nextFloat();
		
			float bits = (float) (((size * 1024) * 1024)*8); 
			float mbps = (float) ((bits / vm) / 60);
				
				System.out.printf("Tamanho em bits: %s \n", bits);
				System.out.printf("Download termina em: %s minutos", mbps);
	}

}
