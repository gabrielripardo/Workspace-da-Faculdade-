/**
 * Função: Tratar os erro de InputMismatchException 
 * @date 15/05/2017
 * @author Gabriel Ripardo
 */

package math;
import java.util.*;

public class Divisao {
	public Divisao(){
	
		try{
			System.out.print(dividir());
		}catch(InputMismatchException e1){
			System.out.println("Você digitou uma String\nNão há como calcular uma String! \n Tente novamente:");
			System.out.print(dividir());
		}
	}
	public float dividir(){
		Scanner s = new Scanner(System.in);
		int dividendo = s.nextInt();
		int divisor = s.nextInt();
		float divisao = (float) dividendo / divisor;
		return divisao;
	}
	
	public static void main(String[] args){

		new Divisao();
	}
}
