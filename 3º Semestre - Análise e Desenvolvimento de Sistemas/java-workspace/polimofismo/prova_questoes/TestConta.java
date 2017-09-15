package prova_questoes;

public class TestConta {

	public static void main(String[] args){
		ContaCorrente c1 = new ContaCorrente();
		c1.depositar(500);
		c1.limite = 100;
		c1.sacar(600);
		System.out.println("Saldo = R$ " + c1.saldo);
	}
}
