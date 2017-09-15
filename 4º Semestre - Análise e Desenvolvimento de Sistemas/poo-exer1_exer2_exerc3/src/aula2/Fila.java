/**
 * Fila com Lista Dinâmica
 * @author Gabriel Ripardo de Sena
 * @date 24.08.2017
 * Desenvolver a estrutura de dados Fila utilizando Lista Dinâmica. 
 * 
 */
package aula2;

public class Fila{
	No primeiro, ultimo, nos; // Referência da Classe No
	int nroNos;
	
	Fila (){
		ultimo = null;
		nroNos = 0;
	}

	public void inserir(int o)	{
		nroNos++; // Toda vez que passar que o método for chamado incrementar + 1.
		No novoNo = new No(o); // Cria um objeto No
			if (primeiro == null && ultimo == null) // Se nenhum nó criar o primeiro 
				primeiro = novoNo; // O primeiro nó recebe o novoNo = elemento
			else
				ultimo.proxElemento = novoNo;  // Se tiver algum nó inserir no último elemento.
		ultimo = novoNo; 
	}
	
	public void remover(){
	    nos = primeiro;
	    primeiro = nos.proxElemento; // Substitui o primeiro nó pelo próximo
	    nroNos--; //Diminui os nós
	}
	public void mostrar(){
	    nos = primeiro; // Cria um objeto do tipo nó e referencia-o como o primeiro elemento
	    
	    int cont = 1; 
        while (cont <= nroNos){ // Percorrer pelos por todos os nós
        	System.out.printf(" %s ", nos.elemento); // Printa o elemento atual do No
        	nos = nos.proxElemento; // Atualiza o objeto com o proximo elemento
        	cont++;
        }
	}
	
	public static void main(String[] args){
		Fila list = new Fila();
		
		list.inserir(9);
		list.inserir(4);
		list.inserir(1);
		list.inserir(2);
	
		list.remover();
		list.remover();
		list.remover();
		
		list.inserir(4);
		list.inserir(7);
		
		list.mostrar();
	}
	
}
