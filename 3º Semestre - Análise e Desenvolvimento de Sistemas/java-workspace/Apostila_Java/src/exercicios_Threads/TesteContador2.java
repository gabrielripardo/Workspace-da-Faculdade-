package exercicios_Threads;

public class TesteContador2 {
	public static void main(String[] args){
		Contador2 cont, cont2; 
		
		cont = new Contador2();
		cont2 = new Contador2();
		
		cont.start();
	//	cont2.sleep(1000000);
	}
}
