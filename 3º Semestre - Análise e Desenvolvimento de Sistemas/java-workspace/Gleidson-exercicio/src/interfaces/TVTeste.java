package interfaces;

public class TVTeste {
	static TV lg = null; 
	public static void main(String[] args){
		lg = new TV();
		lg.ligaTV();
		lg.mudaCanalTV(25);
		lg.desligaTV();
	
		TV sony = new TV();
		sony.navegar();
		sony.iniciarnetflix();
		
		ControleRemoto samsung = new TV(); 
		samsung.ligaTV();
		samsung.iniciarnetflix(); // Controle remoto não tem esse método
	}
}
