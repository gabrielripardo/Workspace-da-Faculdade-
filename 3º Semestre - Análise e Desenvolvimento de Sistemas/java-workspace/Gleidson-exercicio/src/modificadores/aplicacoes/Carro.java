/**
	Uso do Static nos atributos e nos métodos.
	// Onde irei utilizar o final??
	@date 25/05/2017
*/  
package modificadores.aplicacoes;

public class Carro extends Veiculo {
	private static String chassi; // O atributo pertence somente a classe, não pertence a objetos.
	final String placa = null;
	

	public Carro(String chassi, String placa, String proprietario, String marca, String cor){
		Carro.chassi = chassi; // No static não se usa this para referenciar um atributo.
		this.placa = placa;
		setCor(cor);
		setMarca(marca);
		setProprietario(proprietario);
	}
	public void ligar(){
		System.out.println("Ligando o motor..");
	}
	public void desligar(){
		System.out.println("Desligando o motor");
	}
	public static String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		Carro.chassi = chassi;
	}
	public String getPlaca(){
		return placa;
	}
	public void setPlaca(String placa){
		this.placa = placa;
	}
}
