package aula2;

public class No { //armazenar um valor inteiro e a referência para os próximos nós da fila,
	int elemento;
	No proxElemento;
	
	No(int elemento){
		this.elemento = elemento;
		proxElemento = null;
	}
}
