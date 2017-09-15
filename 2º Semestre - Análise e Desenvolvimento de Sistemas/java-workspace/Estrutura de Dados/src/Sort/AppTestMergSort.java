package br.com.ed.sorting;
/**
 * Implementação de Estruturas de Ordenação - Merge Sort Test
 * @author George Mendonça
 * Data: 08/11/2016
 * Atualização: 
 * */
public class AppTestMergSort {

	public static void main(String[] args) {
		Sort ms = new Sort(7);
		ms.inserir(-5);
		ms.inserir(200);
		ms.inserir(8);
		ms.inserir(5);
		ms.inserir(-50);
		ms.inserir(-505);
		ms.inserir(-1);
		ms.exibir();
		long[] ar = ms.mergeSort(ms.getAr());
		ms.setAr(ar);
		ms.exibir();	
	}
}
/*
Resultado:
	-5 200 8 5 -50 -505 -1 
	-505 -50 -5 -1 5 8 200
*/