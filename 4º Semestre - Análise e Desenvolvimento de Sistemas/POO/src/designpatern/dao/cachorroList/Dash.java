package designpatern.dao.cachorroList;

import java.util.ArrayList;
import java.util.List;

public class Dash {
	public static List<String> mostrarLetters(){
		List<String> vogals = new ArrayList();
		vogals.add("a");
		vogals.add("b");
		vogals.add("c");
		vogals.add("d");
		
		return vogals;
	}
	public static void main(String[] args){
		ArrayList<String> s = new ArrayList();
		s.add("e");
		s.add("c");
		s.add("a");
		
		String nomeParam = "Mari";
		String[] nomes = {"Aristostenes","Maria", "Marcelo", "Adriano", "João", "Pedro", "Marina", "Mario"};
		
		for(int i=0; i<nomes.length; i++) {
			String nomeBd = nomes[i];
			String iniBd = null;
			String iniParam = null;
			
			int qtdChar = 0;
			for(int n=0; n<nomeParam.length(); n++) {
				iniBd = String.valueOf(nomeBd.charAt(n)).toLowerCase();
				iniParam = String.valueOf(nomeParam.charAt(n)).toLowerCase();
				if(iniBd.equals(iniParam)){
					qtdChar++;
				}
			}
			if(qtdChar == nomeParam.length()) {
				System.out.println("Nome: "+nomeBd);
			}
		}
	}
}
