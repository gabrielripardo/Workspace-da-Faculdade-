package xti.University;
import java.util.Scanner;

public class Casos {
	public static void main(String[] args){
		Scanner entra = new Scanner(System.in);
		
		int var = entra.nextInt();
		String saida = "Escreveu o ";
			
		switch(var){
		case 2:
			saida = saida + "2";
			break;
		case 1:
			saida = saida + "1";
			break;
		case 3:
			saida = saida + "3";
			break;
		default:
			saida = saida + "0";			
		}
		
		System.out.print(saida);
	}
}
