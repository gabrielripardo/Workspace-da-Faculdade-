package exercicio_4SintaxedoJava;

/** 
 * 
 * Função: Altere o programa AloMundo.Java para que ele imprima na tela todos os tipos primitivos de dados 
 * suportados pela linguagem Java
 * 
 * Author: Gabriel Ripardo
 * Data de Criação: 08/04/2017
 * 
 */ 
 

public class AloMundo {
	// Números Inteiros
	static byte ni1 = 127;
	static short ni2 = 6799;
	static int ni3 = 1299999999;
	static long ni4 = 1231234533;
	
	
	// Números Flutuantes
	static float nf1 = 56.4f;
	static double nf2 = 122.999;
	
	 // Caracteres
	static String c1 = "Exercício" + " é o caminho";
	static char c2 = 'é';
	
	// Lógico
	static boolean ligado = false;
	
	// Método Principal
	public static void main(String[] args){
	
		System.out.println(ni1 + "\n" + ni2 + "\n" + ni3 + "\n" + nf1 + "\n"+ nf2 + "\n" + c1 + "\n" + c2 + "\n" + ligado);
	}
}
