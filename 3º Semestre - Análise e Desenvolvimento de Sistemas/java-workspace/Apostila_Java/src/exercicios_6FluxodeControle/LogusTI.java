/**
 * @Nome: Aluno_Situacao.jar 
 * @Função: Sabendo que na LogusTI a média mínima é 7,0 e a tolerância de faltas é 15 % da carga horária do curso, faça 
 * uma classe com o método main que peça as informações necessárias e informe a situação do usuário.
 * @author: Gabriel Ripardo
 * @Data_de_criação: 10/04/2017
 */

package exercicios_6FluxodeControle;
import java.util.Scanner;

public class LogusTI {
	public static void main(String []args){
		// Media = 7.0  // FaltTol = 15 / 100 // CargaHor = 100 horas // Dias = 20 // curso = 5 hrs/dia
		// Situacao: myMedia = 8.5 // myFaltas = 10 // myHoras = CargaHor(100) - myFaltas(10) * curso(5) // FaltTol = 15 / 100 * CargHor 
		// se a myHoras >= FaltTol e myMedia >= 7 tá aprovado, senão tá reprovado!
		Scanner entrada = new Scanner(System.in);
		
		//Dados do aluno
		System.out.print("Carga horária total do curso: "); // Carga horária total: 1000 
		int cargHor = entrada.nextInt();
		
		System.out.printf("Carga horária diária do curso: "); // Carga horária diária: 5
		float horasDia = entrada.nextFloat();
		
		System.out.printf("Total de faltas: "); // Faltas: 50   Dias: 200  // 150        
		int faltas = entrada.nextInt();
		
		System.out.printf("Média das notas: ");
		float media = (float) entrada.nextFloat();
		
		
		//LogusTI - Requiremento para aprovação
		float minMedia = 7.0f;
		float faltTol = (float)0.15 * cargHor;     // 15 / 100 * 1000 = 150 horas 
		
		//Situação do aluno
		float qtdDias = cargHor / horasDia; // 1000 / 5 = 200 dias
		float maxDias = qtdDias - faltas;
		double myHoras = maxDias * horasDia; // 200 - 50 * 5 = 750 horas
		float maxFalt = cargHor - faltTol;  // 1000 - 150 = 850
		
		
		if ((myHoras >= maxFalt) && media >= minMedia){
			System.out.println("Horas cursadas: " + myHoras);
			System.out.print("Aluno aprovado!");
		}else{
			System.out.println("Horas cursadas: " + myHoras);
			System.out.printf("Obs.: Tolerância de faltas é até %s dias, ou seja, %s horas. \nVocê ultrapassou o limite! \n", (int)maxDias, (int)maxFalt);
			System.out.println("Aluno reprovado!");
		}
	}
}
