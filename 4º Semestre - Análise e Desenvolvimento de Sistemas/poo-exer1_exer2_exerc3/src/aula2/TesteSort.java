package aula2;

public class TesteSort {
	public static void main(String[] args){
		Sort ordem = new Sort();
		int[] numbers = {6, 4, 1, 2, 9, 7};
		ordem.ordenar(numbers);
		
		System.out.println("::::::::::: Bubble Sort :::::::::::");
		for(int num:ordem.ordenar(numbers)){
			System.out.printf(" %s -",num);
		}
	}
}
