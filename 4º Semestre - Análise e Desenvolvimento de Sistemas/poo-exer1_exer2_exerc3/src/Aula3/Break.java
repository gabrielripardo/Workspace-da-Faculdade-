/**
 * Sistema de ignoração. Usado para não repetir a verificação de índice como valor repetido
 * Rascunho para o ninjaGame da Classe teste.
 */
package Aula3;

public class Break {
	public static void main(String[] args){
		int[] lista = {6, 6, 6, 6, 4, 4, 4, 3, 2};
		//             0  1  2  3  4  5  6  7  8
		String vencedor; int[] vencedorList = new int[20];
		String empateA; int[] empateAnum = new int[20];  
		String empateB;
		
		int i = 0;
		vencedor = Integer.toString(lista[i]);  
		empateA = Integer.toString(lista[i]);
		empateB = null;
		int qtd = 0;
		
		//contadores de listas
		int venc = 0;
		int emp = 0;
		while(qtd < lista.length){
			int next = i + 1;
			int vencAdd = venc + 1;
			int empAdd = emp + 1;
			if(lista[i] != lista[next]){
				System.out.println("primeiro if"+i);
				vencedorList[venc] = lista[i];
				i++;
				qtd++;
				venc++;
			}if(lista[i] == lista[next]){
				while(lista[i] == lista[next]){
					empateAnum[emp] = lista[i];
					empateAnum[empAdd] = lista[next];
					i = i + 1;
					qtd++;
					emp = emp + 1;
					System.out.println("índice: " + i);
				}
			}if(lista[i] != lista[next]){
				for(int cont=0; cont<empateAnum.length; cont++){
					if(lista[i] != empateAnum[cont] && empateAnum[cont] != 0){
						vencedorList[venc] = lista[i];
						System.out.println("primeiro if"+i);
						qtd++;
						venc++;
					 }
				}
			}	
		}
			
		for(int vence:vencedorList){
			System.out.println("Vencedor: " +vence);
		}
		for(int empat:empateAnum){
			System.out.println("Emapte:"+empat);
		}
	}
		
		/*
		
		int i = 0;
		while(i < 9){
			boolean percorrer = true;
			for(int ant = i; ant > 0 ; ant--){// Verifica do índice do i até cair no break
				System.out.println(ant);				
					if(lista[i] == lista[ant-1]){
						percorrer = false;
						System.out.println("if "+lista[ant]);
						break;
					}
				}
			if(percorrer){
				System.out.println("Aprovado " + lista[i]);
			}
			i++;
		}
		*/
}

