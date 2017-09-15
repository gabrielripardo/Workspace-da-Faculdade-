package aula2;

public class TesteFila {	
	public static void main(String[] args){
		
		System.out.println(">>>> Welcome to the FIFO  Dinamic <<<<");
		Fila list = new Fila();
		
		list.inserir(5);
		list.inserir(2);
		list.inserir(1);
		list.inserir(4);
		
		list.mostrar();
		
		list.remover();
		
		list.mostrar();
		
	}
}
