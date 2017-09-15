package modificadores;

public class Carro extends Veiculo {
	private String chassi;
	private String placa;

	public Carro(String chassi, String placa, String proprietario, String marca, String cor){
		this.chassi = chassi;
		this.placa = placa;
		setCor(cor);
		setMarca(marca);
		setProprietario(proprietario);
	}
	public void ligar(){
		NUMBER = 43;
		System.out.print("Ligando o motor..");
	}
	public void desligar(){
		System.out.print("Desligando o motor");
	}
	public String getChassi() {
		return chassi;
	}
	public void setChassi(String chassi) {
		this.chassi = chassi;
	}
	public String getPlaca(){
		return placa;
	}
	public void setPlaca(String placa){
		this.placa = placa;
	}
}
