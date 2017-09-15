package prova_questoes;

public class Sobrecarga {
	private String chassi;
	private String placa;
	private String modelo;
	private int ano;
	
	public void ligar(double sequenciaNumerica){
		if (sequenciaNumerica==231222)
			System.out.println("Carro ligado com sequencia númerica!");
	}
	public void ligar(boolean chave){
		if (chave==true)
			System.out.println("Carro ligado com a chave!");
	}
	public void desligar(){
		System.out.println("Carro desligado!");
	}
}
