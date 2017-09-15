/**
 * Sistema de ignoração. Usado para não repetir a verificação de índice como valor repetido
 * Rascunho para o ninjaGame da Classe teste.
 */
package Aula3.copy;

public class Break {
	public static void main(String[] args){
		int[] lista = {7, 5, 1, 2, 2, 0}; //Acrescenta o zero no final para não dar error 
		//             0  1  2  3  4  5  6  7  8
		String vencedor = null; 
		String empateA = null; 
		String empateB = null;
		
		int i = 0;
		
		int qtd = 0;
		
		while(i < lista.length - 1){ //qtd = tamanho da lista - 1 = 5 loops
			int next = i + 1;	
			
			if(lista[i] != lista[next]){
				System.out.println("index: "+i + " -> value:" + lista[i] );
				String temp = Integer.toString(lista[i]);
				vencedor = vencedor + temp + "\n";
				i++;
				qtd++;
			}else{
				if(empateA == null){
					while(lista[i] == lista[next]){	
						System.out.println("atual: " + lista[i]);
						String temp = Integer.toString(lista[i]); 
						empateA = empateA + temp;
						System.out.println("índice: " + i);
						i = i + 1;
						qtd++;
					}
				}else{
					while(lista[i] == lista[next]){
						String temp = Integer.toString(lista[i]);
						empateB = empateB + temp;
						i = i + 1;
						qtd++;
					}
				}

			}
		}
		System.out.println(empateA);
		System.out.println(empateB);
		System.out.println(vencedor);
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

