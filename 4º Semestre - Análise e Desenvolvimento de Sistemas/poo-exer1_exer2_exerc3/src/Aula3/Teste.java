package Aula3;

public class Teste {
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
		
		int[] lista = new int[5];
		
		lista[0] = ninjaTerra.getPontos();
		lista[1] = ninjaFogo.getPontos();
		lista[2] = ninjaAgua.getPontos();
		lista[3] = ninjaRaio.getPontos();
		lista[4] = ninjaVento.getPontos();
		
		// Bubble Sort
		for(int a=0; a<lista.length; a++){
			for(int b=0; b < lista.length - 1; b++){;
				int plus = b + 1;
				if(lista[b] < lista[plus] ){
					int aux = lista[b];
					lista[b] = lista[plus];
					lista[plus] = aux;
				}
			}
		}
		for(int item:lista){
			System.out.println(item);
		}
		
		String[] ranking = new String[100];
		
		int qtd=0;
		int i=0;
		while(qtd < 6){ // De quem é esse número?
			int next = i + 1;
				boolean percorrer = true;
				
			if(i < 5){	
				for(int ant = i; ant > 0 ; ant--){// Verifica do índice i tem valor repetido
					if(lista[i] == lista[ant-1]){
						percorrer = false;
						System.out.println("if "+lista[ant]);
						break;
					}
				}
				if(percorrer){
					if(lista[i] == ninjaTerra.getPontos()){
						if(ranking[i] != null){ // Esse índice está sendo usado
							ranking[next] = ninjaTerra.getNome();
							next++;
							qtd++;
						}else{ // Procedimento normal
							ranking[i] = ninjaTerra.getNome();
							qtd++;
						}
					}if(lista[i] == ninjaAgua.getPontos()){
						if(ranking[i] != null){
							ranking[next] = ninjaAgua.getNome();
							next++;
							qtd++;
						}else{
							ranking[i] = ninjaAgua.getNome();
							qtd++;
						}
					}if(lista[i] == ninjaFogo.getPontos()){
						if(ranking[i] != null){
							ranking[next] = ninjaFogo.getNome();
							next++;
							qtd++;
						}else{
							ranking[i] = ninjaFogo.getNome();
							qtd++;
						}
					}if(lista[i] == ninjaRaio.getPontos()){
						if(ranking[i] != null){
							ranking[next] = ninjaRaio.getNome();
							next++;
							qtd++;
						}else{
							ranking[i] = ninjaRaio.getNome();
							qtd++;
						}
					}if(lista[i] == ninjaVento.getPontos()){
						if(ranking[i] != null){
							ranking[next] = ninjaVento.getNome();
							next++;
							qtd++;
						}else{
							ranking[i] = ninjaVento.getNome();
							qtd++;
						}
					}
				}
			}
			i++;
		}
		
		for(int item=0; item < lista.length; item++){
			System.out.print(ranking[item]);
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
