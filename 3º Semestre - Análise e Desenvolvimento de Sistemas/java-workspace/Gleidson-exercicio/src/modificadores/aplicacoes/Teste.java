package modificadores.aplicacoes;

public class Teste {
	public static void main(String[] args){
		Carro pretao = new Carro("2345235", "JRE-4353", "Gabriel", "Toyota", "Preto");
		pretao.ligar();
		pretao.desligar();
		System.out.print(pretao.getPlaca());
		
		Carro amarelao = new Carro("1234567", "JRE-4353", "Gabriel", "Toyota", "amarelo");
		System.out.println(amarelao.getCor());
		System.out.println(amarelao.getProprietario());
		System.out.println(Carro.getChassi());	
		System.out.print(amarelao.getPlaca());
	}
}
