package math;
import java.util.*;
public class DivisaoWhileTry {
	public static void main(String[] args){
		Scanner entra = new Scanner(System.in);
		boolean repetir = true;
		
		do{
			try{
				int dividendo = entra.nextInt();
				int divisor = entra.nextInt();
				double divisao = dividendo / divisor;
				System.out.print(divisao);
				
				repetir = false;
			}catch(InputMismatchException n){ // Captura o error
				System.err.print("Digite novamente!"); // Tratamento do error // Atributo err da Classe System deixará o texto vermelho
				entra.nextLine();   // Isso vai impedir que o programa faça overflow
			}
			finally{ // Sempre será executado, independente se houver error// Usado para limpar variáveis, fechar conexão, etc.
				System.out.print("\nFim! Obrigado por usar");
			}
		}while(repetir);
	}
}
