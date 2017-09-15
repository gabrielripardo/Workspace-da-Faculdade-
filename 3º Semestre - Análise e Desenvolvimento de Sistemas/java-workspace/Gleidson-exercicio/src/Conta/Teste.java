package Conta;

public class Teste {
	public static void main(String args []){
		Cliente fulano  = new Cliente("054.564.563.90", "Fulano", "Brasília", "DF");
		
		Corrente myCor = new Corrente();
		
		myCor.setCl(fulano);
		myCor.depositar(1000);
		myCor.sacar(5000);
		
		System.out.print("saldo: " + myCor.getSaldo());
	}
}
