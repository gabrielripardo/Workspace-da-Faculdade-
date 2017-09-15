package exercicios_Threads;

public class TesteContador {
	public static void main(String[] args){
		Contador cont, cont2; 
		cont = new Contador();
		cont2 = new Contador();
		Thread thr = new Thread(cont);
		thr.start();
		thr.start();
	}
}
