package ContaGui;
	
public class Corrente extends Conta {
	private double limite;
	
	
	public void sacar(double valor){
		if(valor <= getSaldo() + limite){
			setSaldo(getSaldo() - valor);
		}else{
			System.out.print("Valor inválido!");
		}
	}
	public double getLimite(){
		return this.limite;
	}
	public void setLimite(double valor){
		this.limite = valor;
	}
	
}
