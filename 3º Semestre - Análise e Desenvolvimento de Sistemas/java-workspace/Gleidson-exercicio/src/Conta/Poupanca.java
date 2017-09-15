
package Conta;

public class Poupanca extends Conta {
	private float txJuros;
	
	public float getTxJuros() {
		return txJuros;
	}

	public void setTxJuros(float txJuros) {
		this.txJuros = txJuros;
	}

	public double calcularRendimento(){
		double calc = getSaldo() + ((txJuros / 100) * getSaldo());
		return calc;
	}
}
