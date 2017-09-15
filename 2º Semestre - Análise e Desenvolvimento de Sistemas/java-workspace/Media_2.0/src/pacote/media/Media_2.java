package pacote.media;


import java.util.Scanner;

public class Media_2 {
	public static void main(String[] args){
	Scanner Escaner = new Scanner(System.in);
	int entrada;
	
	System.out.printf("Digite a nota: ");
	entrada = Escaner.nextInt();
	
	Scanner Escaner2 = new Scanner(System.in);
	int entrada2;

	System.out.printf("Digite a segunda nota: ");
	entrada2 = Escaner2.nextInt();
		float media = (float) (entrada + entrada2)/2;
		System.out.printf("Sua média foi de: %.1f", media);
	
	}
}
