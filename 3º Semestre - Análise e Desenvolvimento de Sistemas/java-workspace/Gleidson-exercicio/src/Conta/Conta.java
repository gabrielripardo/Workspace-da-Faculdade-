package Conta;

public class Conta {
	private long num;
	private double saldo;
	private Cliente cl;
	
	public void sacar(double valor){
		if (valor <= saldo){
			saldo = saldo - valor;
		}else{
			System.out.print("Valor inválido!");
		}
	}
	public void depositar(double valor){
		saldo = saldo + valor;
	}
	
	public long getnum() {
		return num;
	}
	public void setnum(long num) {
		this.num = num;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public Cliente getCl() {
		return cl;
	}
	public void setCl(Cliente cl) {
		this.cl = cl;
	}
	
	
}
