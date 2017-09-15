/* Futeira.java
 * Autor: Gabriel Ripardo
 * Data: 27/09/16
 * Função: Fornecer os preços para cada tipo de fruta.
 */

package fruteira_pacote;
import java.util.Scanner;
public class Fruteira{
	public static void main(String []args){
		Scanner strawberry = new Scanner (System.in);
		int morango;
		System.out.println("Morango em Kg: ");
		morango = strawberry.nextInt();
	
		Scanner apple = new Scanner (System.in);
		int maca;
		System.out.println("Maça em Kg: ");
		maca = apple.nextInt();
		double var = 0;
		double var2 = 0;
			if (morango <= 5){
	    		var += 2.5;
	    	}else if (morango > 5){
	    		var += 2.2;
	    	}else{
	    		System.out.println("No String!");
	    	}
	    	
	    	double preco1 = (morango * var);
	    	
			System.out.printf("Preço do Morango: %s \n", preco1);
			
			
			if (maca <= 5){
	    		var2 += 1.80;
	    	}else if (maca > 5){
	    		var2 += 1.50;
	    	}else{
	    		System.out.println("No String!");
	    	}
			double preco2 = (maca * var2);
			
			System.out.printf("Preço da Maçã: %s \n", preco2);
	    		
	    		
	    		
	}
}
