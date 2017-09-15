package interfaces;

public class TV implements ControleRemoto, Smart {

	@Override
	public void ligaTV() {
		SERIAL = "23423";
		System.out.println("TV ligando... ");
	}

	@Override
	public void desligaTV() {
		System.out.println("TV desligando... ");
	}

	@Override
	public void mudaCanalTV(int canalNovo) {
		System.out.println ("Canal: " + canalNovo);
	}

	@Override
	public void navegar() {
		System.out.print("Abrindo navegador!");
	}

	@Override
	public void installapp() {
		System.out.print("Instalando app x");
	}

	@Override
	public void iniciarnetflix() {
		System.out.println("Escolha um filme");
	}

}
