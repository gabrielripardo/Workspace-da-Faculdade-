/**
 * Implementação de Estruturas de Ordenação - Bobble Sort Test
 * @author George Mendonça
 * Data: 25/09/2016
 * Atualização: 08/11/2016
 * */
package br.com.ed.sorting;

public class AppTestBubbleSort {

	public static void main(String[] args) {
		Sort bs = new Sort(7);
		bs.inserir(-5);
		bs.inserir(200);
		bs.inserir(8);
		bs.inserir(5);
		bs.inserir(-50);
		bs.inserir(-505);
		bs.inserir(-1);
		bs.exibir();
		bs.bubbleSort();
		bs.exibir();		
	}
}
/*
Saída:
-5 200 8 5 -50 -505 -1 
-505 -50 -5 -1 5 8 200
*/
