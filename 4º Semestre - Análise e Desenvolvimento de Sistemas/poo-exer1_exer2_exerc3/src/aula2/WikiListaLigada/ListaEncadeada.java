package aula2.WikiListaLigada;

public class ListaEncadeada {
	private class No{
	    int valor;
	    No prox;

	    private No(int v){
	        valor = v;
	        prox = null;
	    }
	}

	    No primeiro,ultimo;
	    int totalNos;

	    public ListaEncadeada(){
	        primeiro = ultimo = null;
	        totalNos = 0;
	    }

	    public int getTotalNos(){
	        return totalNos;
	    }

	    public boolean checkIfListaVazia(){
	        if (getTotalNos() == 0){
	            return true;
	       }
	       return false;
	    }

	    public void inserirNoInicio(No n) {
	        if ( checkIfListaVazia() ){
	            primeiro = ultimo = n;
	        }
	        else{
	            n.prox = primeiro;
	            primeiro = n;
	        }
	        totalNos++;
	    }

	    public void inserirNoFim(No n){
	        // caso não existam nós inseridos,
	        // insere o primeiro nó (n) na lista
	        if ( checkIfListaVazia() ){
	            primeiro = ultimo = n;
	        }
	        else{
	            ultimo.prox = n;
	            ultimo = n;
	       }
	       totalNos++;
	    }

	    public void excluirNo(No n){
	        No noAtual;
	        No noAnterior;
	        noAtual = noAnterior = primeiro;
	        int contador = 1;

	        if (checkIfListaVazia() == false){
	            while (contador <= getTotalNos() &&
	                     noAtual.valor != n.valor){
	                noAnterior = noAtual;
	                noAtual = noAtual.prox;
	                contador++;
	            } 

	        if(noAtual.valor == n.valor){
	            if ( getTotalNos() == 1){
	                primeiro = ultimo = null;
	           }
	           else{
	               if (noAtual == primeiro){
	                   primeiro = noAtual.prox;
	               }
	               else{
	                   noAnterior.prox = noAtual.prox;
	               }
	           }
	           totalNos--;
	        }
	    }
	}

	public void exibirLista(){
	    No temp = primeiro;
	    String valores = "";
	    int contador = 1;
	    if ( checkIfListaVazia() == false ){
	        while (contador <= getTotalNos()){
	            valores += Integer.toString(temp.valor)+"-";
	            temp = temp.prox;
	            contador++;
	        }
	    }
	    System.out.println(valores);
	}
	
	public static void main(String[] args){
		ListaEncadeada dinam;
		dinam = new ListaEncadeada();
		
		dinam.inserirNoFim(3);
	}

}
