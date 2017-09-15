package media_nome;
import java.util.Scanner;

public class Media_Nome {
	public static void main(String [] args){
		Scanner nome = new Scanner (System.in);
		String nm;
		System.out.print("Digite o nome: " );
		nm = nome.next();
		
		Scanner n1 = new Scanner (System.in);
		Float num1;
		System.out.printf("Nota 1: ");
		num1 = n1.nextFloat();
		Scanner n2 = new Scanner (System.in);
		Float num2;
		System.out.printf("Nota 2: ");
		num2 = n2.nextFloat();
			Float media = (Float) (num1 + num2)/2;
		
			System.out.printf("Nome: %s \n", nm);
			System.out.printf("Média: %s", media);			
	}	
}
