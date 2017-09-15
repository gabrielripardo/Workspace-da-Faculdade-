/**
 * Descricao: Defina a classe Contador como uma subclasse de Thread, que imprime números de 0 a 10. Crie a classe 
 * TesteContador que deve definir o método main que cria e inicia a execução do thread Contador. Teste o 
 * resultado executando a classe TesteContador. 
 * 
 * @author Gabriel Ripardo
 * @date 22/05/17
 */
package exercicios_Threads;

public class Contador implements Runnable{
	
	public void run(){
		for(int i = 0; i <= 10; i++){
			System.out.println(i);
		}
	}
}
