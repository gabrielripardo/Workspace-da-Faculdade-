package designpatern.dao;
import java.util.Calendar;

public class CachorroBanco {
	public static void main(String[] args){
		CachorroDAO spykeBD = new CachorroDAO();
		Cachorro spyke = new Cachorro();
		
		spyke.setNome("Spyke Brow");
		spyke.setPeso(3.6f);
		spyke.setAltura(0.40f);
		spyke.setDtNascimento(Calendar.getInstance());
		spyke.setRaca("Pitium");

		spykeBD.adicionar(spyke);
	}
}
