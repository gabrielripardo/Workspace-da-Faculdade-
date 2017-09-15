package Aula3;

public class Teste2 {
	 /*void imprimirRank(){
		// Imprimir o rank dos vencedores
		System.out.print(">>> Vecendores <<<<");
		System.out.print("1º" + nome);
		System.out.print("2º" + nome);
		System.out.print("3º" + nome);
	}
	*/
	static String rank(Ninja njA, Ninja njB, Ninja njC, Ninja njD, Ninja njE){
		njA.getPontos();
		
		
		return null;
	}
	
	public static void main(String[] args){
		Luta mma = new Luta();
		NinjaTerra ninjaTerra = new NinjaTerra("Terra");
		NinjaFogo ninjaFogo = new NinjaFogo("Fogo");
		NinjaAgua ninjaAgua = new NinjaAgua("Agua");	
		NinjaRaio ninjaRaio = new NinjaRaio("Raio");
		NinjaVento ninjaVento = new NinjaVento("Vento");
		
		//mma.iniciarLuta(ninjaTerra, ninjaFogo); // Fighter
		 // Fighter
		//mma.iniciarLuta(ninjaTerra, ninjaFogo);
				
		
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
		
		System.out.println(ninjaAgua.getNome() + " " + ninjaAgua.getPontos());
		System.out.println(ninjaFogo.getNome() + " " + ninjaFogo.getPontos());
		System.out.println(ninjaVento.getNome() + " " + ninjaVento.getPontos());
		System.out.println(ninjaRaio.getNome() + " " + ninjaRaio.getPontos());
		System.out.println(ninjaTerra.getNome() + " " + ninjaTerra.getPontos());
		
		
		
		
		//Sort
		//rank(ninjaTerra, ninjaFogo, null, null, null);
		
		int[] listaPts = new int[5];
		String[] listaNoms = new String[5];
		
		listaPts[0] = ninjaTerra.getPontos();  listaNoms[0] = ninjaTerra.getNome();
		listaPts[1] = ninjaFogo.getPontos();   listaNoms[1] = ninjaFogo.getNome();
		listaPts[2] = ninjaAgua.getPontos();   listaNoms[2] = ninjaAgua.getNome();
		listaPts[3] = ninjaRaio.getPontos();   listaNoms[3] = ninjaRaio.getNome();
		listaPts[4] = ninjaVento.getPontos();  listaNoms[4] = ninjaVento.getNome();
		
		
		
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
		for(int i = 0; i < listaPts.length; i++){
			System.out.println(listaNoms[i] +" - "+listaPts[i]);
		}
		listaPts[5] = 0;
		//
		int i = 1;
		int qtd = 4;
		while(i < 6){
			int back = i - 1;
			int next = i + 1;
			if(listaPts[back] > 0){
				if(listaPts[back] != listaPts[i]){
					System.out.println(next+"º - "+listaNoms[back]+" Pontos: "+listaPts[back]);
					qtd--;		
				}else if(listaPts[back] == listaPts[i]){
					System.out.println(next+"º (Empate) - "+listaNoms[back]+" / "+listaNoms[i]+" Pontos: "+listaPts[i]);
					qtd = qtd - 2;
				}
			}
			i++;
		}
	}
}

/*
 * 
 * for(int i=0; i<lista.length; i++){ // De quem é esse número?
			int next = i + 1;
			if(lista[i] == ninjaTerra.getPontos()){
				if(lista[i] != 0){ // Esse índice está sendo usado
					ranking[next] = ninjaTerra.getNome();
					next++;
				}else{ // Procedimento normal
					ranking[i] = ninjaTerra.getNome();
				}
			}if(lista[i] == ninjaAgua.getPontos()){
				if(lista[i] != 0){
					ranking[next] = ninjaAgua.getNome();
					next++;
				}else{
					ranking[i] = ninjaAgua.getNome();
				}
			}if(lista[i] == ninjaFogo.getPontos()){
				if(lista[i] != 0){
					ranking[next] = ninjaFogo.getNome();
					next++;
				}else{
					ranking[i] = ninjaFogo.getNome();
				}
			}if(lista[i] == ninjaRaio.getPontos()){
				if(lista[i] != 0){
					ranking[next] = ninjaRaio.getNome();
					next++;
				}else{
					ranking[i] = ninjaRaio.getNome();
				}
			}if(lista[i] == ninjaVento.getPontos()){
				if(lista[i] != 0){
					ranking[next] = ninjaVento.getNome();
					next++;
				}else{
					ranking[i] = ninjaVento.getNome();
				}
			}
		}
 */
