/**
 * @funcao Faça um programa que leia cinco nomes do teclado, e depois imprima esses nomes na ordem inversa em 
 * que foram digitados pelo usuário.
 * @author Gabriel Ripardo
 * @date 19/04/17
 */
package exercicios_7AgrupamentodeDados;
import java.util.Scanner;
public class Inverso {
	Scanner input = new Scanner(System.in);
	
	String names[] = new String[5];
	String namesInv[] = new String[5];
	
	public void Numbers(){
		for(int val = 0; val < names.length; val++){
			System.out.printf("Valor %s:", val);
			String nums = input.nextLine();
			names[val] = nums;
		}
	}
	public String[] impress(){
		int index = names.length - 1;
		int i = 0;
		while(index >= 0){
			namesInv[i] = names[index];
		index--;
		i++;
		}
	return namesInv;
	}
}
