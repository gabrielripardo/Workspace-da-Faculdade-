package Sort;

public class BobbleSortApp {
	public static void main(String []args){
		Sort my = new Sort(4);
		my.inserir(8);
		my.inserir(2);
		my.inserir(4);
		my.inserir(3);
		my.exibir();
		my.bubbleSort();
		my.exibir();
	}
}
