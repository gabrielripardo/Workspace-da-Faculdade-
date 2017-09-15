/**
 * @Nome: Media.jar 
 * @Função: Implemente uma classe java “Calculos” com um método”calcularMedia” que receba três números e calcule a 
 * média e imprima na tela essa média. O método “calcularMaior”, deverá receber também três números e retornar o 
 * maior número e o método “calcularMenor”, deverá receber três números e retornar o melhor número. Implemente a 
 * classe com o método main e instancie a classe Calculos executando todos os seus métodos.  
 * 
 * @author: Gabriel Ripardo
 * @Data_de_Criação: 11/04/17
 */

package exercicios_6FluxodeControle;

public class Calculos {
	float num1;
	float num2;
	float num3;
	
	public Calculos(float num1, float num2, float num3){
		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
	}
	
	public float calcularMedia(){
		float media = (num1 + num2 + num3) / 3;
		return media;
	}
	public float calcularMaior(){
		float maior;
		if ((num1 > num2) && (num1 > num3)){
			maior = num1;
		
		}else if ((num2 > num3)){
			maior = num2;
			
		}else{
			maior = num3;
		}
	return maior;
	}
	public float calcularMenor(){
	float menor;	

		if ((num1 < num2) && (num1 < num3)){
			menor = num1;
			
		}else if ((num2 < num3)){
			menor = num2;
			
		}else{
			menor = num3;
		}
	return menor;
	}
}
