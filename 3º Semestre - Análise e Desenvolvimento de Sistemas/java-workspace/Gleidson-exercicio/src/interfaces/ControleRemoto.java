package interfaces;

public interface ControleRemoto {
	String SERIAL = null;
	
	public void ligaTV();
	public void desligaTV();
	public void mudaCanalTV(int canalNovo);
}
