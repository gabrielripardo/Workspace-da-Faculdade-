package modificadores.teste;

import modificadores.Veiculo;
import modificadores.aplicacoes.Carro;

public class Teste {
	public static void main(String[] args){
		Carro pretao = new Carro("2345235", "JRE-4353", "Gabriel", "Toyota", "Preto");
		pretao.ligar();
		pretao.desligar();
		
		Veiculo v2 = new Veiculo();
		v2.getCor();
		//v2.cor = "red"; Os atributos da classe Veiculo estão em modo protected, só podem ser acessado se a classe Teste for do mesmo pacote
	}
}
