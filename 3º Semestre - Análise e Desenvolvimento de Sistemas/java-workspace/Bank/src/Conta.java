public class Conta {
	private float saldo;

	public void depos(float valor){
		this.saldo = valor + saldo;
	}
	public void sacar (float valor){
		System.out.println("Valor do saque: " + valor);
		
		if (valor <= saldo){
		this.saldo = saldo - valor;
		}else {
			System.out.println("Saldo insuficiente!");
		}
	}
	public void verSaldo(){
		System.out.println("Saldo atual = " + saldo);
	}
}
