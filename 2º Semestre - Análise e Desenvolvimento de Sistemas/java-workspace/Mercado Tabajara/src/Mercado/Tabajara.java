/* Tabajara 2.0
 * Autor: Gabriel Ripardo
 * Data: 02/10/16
 * Funcao: Calcular o valor total de kilos para o tipo de carne escolhido.
 */
package Mercado;
import java.util.Scanner;
public class Tabajara {
	public static void main(String []args){
		float meat1 = 0;
		float meat2 = 0; 
		String tip ="";
		float valor = 0;
		float desc = 0;
		
		System.out.println(" 1. Filé duplo \n 2. Alcatra \n 3. Picanha");
		
		Scanner tipo = new Scanner (System.in);
		int carne;
		System.out.printf("Digite o tipo de carne: ");
		carne = tipo.nextInt();
		
			if (carne == 1){
				tip += "Filé duplo";
				meat1 += 4.90;
				meat2 += 5.80;
			}
			else if (carne == 2){
				tip += "Alcatra";
				meat1 += 5.90;
				meat2 += 6.80;
			}
			else if (carne == 3){
				tip += "Picanha";
				meat1 += 6.90;
				meat2 += 7.80;
			
			}
			else if (carne > 3){
				System.out.print("String não identificada!");
			}			
		
		Scanner kilos = new Scanner (System.in);
		int kg;

		System.out.println(tip);
		System.out.printf("Preços: R$ %s R$ %s \n", meat1, meat2);
		System.out.printf("Digite a quantidade de kilos: ");
		kg = kilos.nextInt();
		
			if  (kg <= 5){
				valor = kg * meat1;
			}
			else if (kg > 5){
				valor = kg * meat2;
			}
		
		Scanner card = new Scanner (System.in);
		int cardjara;
		System.out.printf("Cartão tabajara? /n Digite 1 para sim ou 2 para não");
		cardjara = card.nextInt();
		
			if (cardjara == 1){
				desc += 0.10;
			}
			else {
				desc += 1;
			}
		float total = valor * desc;
		
		System.out.printf("\nTotal a pagar: R$ %s", total);
	
		
			
		
		
		
		
		
		
		

		
	}
}

