package prova_questoes;

public class SobreescritaConta {
	double saldo;
	double numero;
	
	public void sacar(double valor){
		if (saldo>=valor){
			saldo = saldo - valor;
			System.out.println("Saque realizado com sucesso!");
		}
	}	
	public void depositar(double valor){
		saldo = saldo + valor;
		System.out.println("Depósito realizado com sucesso!");
	}			
}

