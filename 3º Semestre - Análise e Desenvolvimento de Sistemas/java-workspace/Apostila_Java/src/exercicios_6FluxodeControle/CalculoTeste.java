package exercicios_6FluxodeControle;
import java.util.Scanner;

public class CalculoTeste {
	public static void main(String []args){
		Scanner entrance = new Scanner(System.in);
		System.out.print("Number 1: ");
		float entrada1 = entrance.nextFloat();
		System.out.print("Number 2: ");
		float entrada2 = entrance.nextFloat();
		System.out.print("Number 3: ");
		float entrada3 = entrance.nextFloat();
		
		Calculos numbers = new Calculos(entrada1, entrada2, entrada3);
			
		System.out.println("Média: " + numbers.calcularMedia());
		System.out.println("Maior número: " + numbers.calcularMaior());
		System.out.println("Menor número " + numbers.calcularMenor());
	}
}
