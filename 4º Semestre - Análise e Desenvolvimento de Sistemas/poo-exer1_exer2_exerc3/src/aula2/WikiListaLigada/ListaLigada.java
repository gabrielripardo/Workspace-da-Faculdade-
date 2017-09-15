package aula2.WikiListaLigada;


public class ListaLigada{
	No primeiro, ultimo, nos;
	int nroNos;
	
	ListaLigada (){
		ultimo = null;
		nroNos = 0;
	}

	public void inserir(int o)	{
		nroNos++;
		No novoNo = new No(o);
			if (primeiro == null && ultimo == null)
				primeiro = novoNo;
			else
				ultimo.proxElemento = novoNo;
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
        	System.out.println(nos.elemento); // Printa o elemento atual do No
        	nos = nos.proxElemento; // Atualiza o objeto com o proximo elemento
        	cont++;
        }
	}
	
	public static void main(String[] args){
		ListaLigada list = new ListaLigada();
		
		list.inserir(9);
		list.inserir(4);
		list.inserir(1);
		list.inserir(2);
	
		list.remover();
		list.remover();
		list.remover();
		
		list.inserir(4);
		
		list.mostrar();
	}
	
}