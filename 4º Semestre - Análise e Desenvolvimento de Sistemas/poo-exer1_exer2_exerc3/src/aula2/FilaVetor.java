/**
 * @author Gabriel Ripardo de Sena
 * Desenvolva a estrutura de dados Fila. Você deverá criar	duas novas
 * classes,	uma	chamada	No,	que	deverá armazenar um	valor inteiro e	a
 * referência para os próximos nós da fila, e uma chamada Fila que
   deverá controlar	a estrutura	de dados, ela deverá ter dois métodos
   além	do construtor: inserir e remover. Esses	dois métodos deverão
   receber um valor inteiro	como parâmetro,	o método inserir deverá
   inserir um novo nó na estrutura com o valor passado e o método
   remover deverá remover o nó com o valor passado.

 */
package aula2;

public class FilaVetor extends NoVetor { // Controla a estrutura de Dados
	int qtd = 0;
	public FilaVetor(){
		
	}
	public void inserir(int num){
		elemento[qtd] = num;
		qtd++;
	}
	public void remover(int val){
		for(int i = 0; i < elemento.length; i++){
			if(elemento[i] == val){
				for(int ii = i; ii > -1; ii--){
					elemento[ii] = 0;
				}
			}
		}
	}
	public void mostrar(){
		for(int item:elemento){
			if(item > 0){
				System.out.println(item);
			}
		}
	}
		
	public static void main(String[] args){
		FilaVetor valor = new FilaVetor();
		
		valor.inserir(3);
		valor.inserir(4);
		valor.inserir(8);
		valor.inserir(2);
		valor.inserir(6);
		
		valor.remover(8);
		
		valor.mostrar();
	}
}
