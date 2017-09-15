/**
 * @Name: JavaCat aplication
 * @Description: Essa é classe é reponsável por criar um objeto da Classe Gato. No método principal 
 * é executado os métodos das classes Animal e Cachorro.
 * @author Gabriel Ripardo de Sena 
 * @version 
 */

public class Objeto {
	public static void main(String[] args){
		Gato javaCat = new Gato("JavaCat", "preto");
			javaCat.nascer();
			javaCat.miar();
			javaCat.dormir();
			javaCat.morrer();
	}
}
