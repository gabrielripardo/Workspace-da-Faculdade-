package prova_questoes;


public class ContaCorrente extends SobreescritaConta{
	double limite;
	
	@Override
	public void sacar(double valor){
		if (valor <= saldo + limite){
			saldo = saldo - valor;
			System.out.println("Saque realizado com sucesso!");
		}else{
			System.out.println("Saldo insuficiente!");
		}
	}
}

