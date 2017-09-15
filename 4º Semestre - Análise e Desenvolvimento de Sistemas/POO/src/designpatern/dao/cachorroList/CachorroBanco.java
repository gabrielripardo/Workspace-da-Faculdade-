package designpatern.dao.cachorroList;
import java.util.List;

public class CachorroBanco {
	public static void main(String[] args){
		CachorroDAO dB = new CachorroDAO();
		Cachorro cachorro = new Cachorro();
		
		cachorro.setNome("D");
		cachorro.setPeso(2.6f);
		cachorro.setAltura(0.40f);
		cachorro.setRaca("Sheetos");
		
		//dB.adicionar(cachorro);
		
		String inicialNm = "Mar";
		
		List<Cachorro> cachorros = dB.buscarPorNome(inicialNm);
		for(Cachorro cachor : cachorros){
			System.out.println(cachor.getNome());
			System.out.println(cachor.getRaca());
			System.out.println(cachor.getAltura());
			System.out.println(cachor.getPeso());
			System.out.println();
		}		
		/*
		Cachorro cachorr = dB.buscarNome("Maranhao");
		
		System.out.println(cachorr.getNome());
		System.out.println(cachorr.getAltura());
		System.out.println(cachorr.getRaca());
		System.out.println(cachorr.getPeso());
		System.out.println();

		
/*		List <Cachorro> cachorros = spykeBD.listarData();
		for(Cachorro cachor : cachorros){
			System.out.println(cachor.getNome());
			System.out.println(cachor.getAltura());
			System.out.println(cachor.getRaca());
			System.out.println(cachor.getPeso());
			System.out.println();
			
		}
		*/
		
	}
}
