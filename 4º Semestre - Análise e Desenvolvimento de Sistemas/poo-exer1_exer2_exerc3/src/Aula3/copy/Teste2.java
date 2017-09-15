package Aula3.copy;

public class Teste2 {
	static String mostrarRank(int[] lista, String[] nomes){		
		String vencedor = null; 
		String empateA = null; 
		String empateB = null;
		
		int coloc = 1;
		int i = 0;
		while(i < lista.length - 1){ //qtd = tamanho da lista - 1 = 5 loops
			int next = i + 1;	
			
			if(lista[i] != lista[next]){
				System.out.println(coloc+"º - "+nomes[i]+" Pontuação: "+lista[i]);
				String temp = Integer.toString(lista[i]);
				vencedor = vencedor + temp + "\n";
				coloc++;
				i++;
			}else{
				if(empateA == null){
					System.out.print(coloc+"º - ");
					while(lista[i] == lista[next]){	
						System.out.print(nomes[i]+"/ ");
						String temp = Integer.toString(lista[i]); 
						empateA = empateA + temp;
						i++;
					}
					System.out.println(" Pontuação: " + empateA.charAt(5));
					coloc++;
				}else{
					System.out.print(coloc+"º - ");
					while(lista[i] == lista[next]){
						System.out.print(nomes[i]+"/ ");
						String temp = Integer.toString(lista[i]);
						empateB = empateB + temp;
						i++;
					}
					System.out.println(" Pontuação: " + empateB.charAt(5));
					coloc++;
				}
			}
		}	
		return vencedor;
	}
	
	public static void main(String[] args){
		Luta mma = new Luta();
		NinjaTerra ninjaTerra = new NinjaTerra("Terra");
		NinjaFogo ninjaFogo = new NinjaFogo("Fogo");
		NinjaAgua ninjaAgua = new NinjaAgua("Agua");	
		NinjaRaio ninjaRaio = new NinjaRaio("Raio");
		NinjaVento ninjaVento = new NinjaVento("Vento");
		
		
		System.out.println("Ganhador da luta: " + mma.iniciarLuta(ninjaAgua, ninjaFogo));
		System.out.println("Ganhador da luta: " + mma.iniciarLuta(ninjaRaio, ninjaFogo));
		System.out.println("Ganhador da luta: " + mma.iniciarLuta(ninjaTerra, ninjaAgua));
		System.out.println("Ganhador da luta: " + mma.iniciarLuta(ninjaVento, ninjaRaio));
		System.out.println("Ganhador da luta: " + mma.iniciarLuta(ninjaRaio, ninjaAgua));
		System.out.println("Ganhador da luta: " + mma.iniciarLuta(ninjaVento, ninjaFogo));
		System.out.println("Ganhador da luta: " + mma.iniciarLuta(ninjaVento, ninjaTerra));
		System.out.println("Ganhador da luta: " + mma.iniciarLuta(ninjaVento, ninjaAgua));
		System.out.println("Ganhador da luta: " + mma.iniciarLuta(ninjaFogo, ninjaTerra));
		System.out.println("Ganhador da luta: " + mma.iniciarLuta(ninjaTerra, ninjaRaio));
		//Sort
		//rank(ninjaTerra, ninjaFogo, null, null, null);
		
		int[] listaPts = new int[6];
		String[] listaNoms = new String[6];
		// Amarra os pontos dos ninjas com seus respectivos nomes
		listaPts[0] = ninjaTerra.getPontos();  listaNoms[0] = ninjaTerra.getNome();
		listaPts[1] = ninjaFogo.getPontos();   listaNoms[1] = ninjaFogo.getNome();
		listaPts[2] = ninjaAgua.getPontos();   listaNoms[2] = ninjaAgua.getNome();
		listaPts[3] = ninjaRaio.getPontos();   listaNoms[3] = ninjaRaio.getNome();
		listaPts[4] = ninjaVento.getPontos();  listaNoms[4] = ninjaVento.getNome();
		listaPts[5] = -1;
		
		
		
		
		// Bubble Sort com pontos e nomes amarrados 
		for(int a=0; a<listaPts.length; a++){
			for(int b=0; b < listaPts.length - 1; b++){;
				int next = b + 1;
				if(listaPts[b] < listaPts[next] ){
					int aux = listaPts[b];            String aux2 = listaNoms[b];           
					listaPts[b] = listaPts[next];     listaNoms[b] = listaNoms[next];
					listaPts[next] = aux;             listaNoms[next] = aux2;   
				}
			}
		}
		System.out.println("\n\n||||||||||||||||| Rank - melhor pontuação ||||||||||||||||");
		mostrarRank(listaPts, listaNoms);
	}
}
