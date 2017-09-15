package Aula3.copy;

import java.util.Random;

public class NinjaVento extends Ninja{
	 /* Vento 40%
	  * Raio 25%
      * Terra 17%
	  * Água 13%
	  * Fogo 5% 
	  *  
	  * 1 = Terra
	  * 2 = Vento
	  * 3 = Água
	  * 4 = Fogo
	  * 5 = Raio
	  */
	public NinjaVento(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}

	@Override
	public byte atacar() {
		Random gera = new Random();

		byte[] lista = new byte[20];
		byte random = (byte) gera.nextInt(lista.length);
		
		for(byte i=0; i<lista.length; i++){
			if(i < 8){
				lista[i] = 2; // #1 Vento
			}else if(i <= 13){
				lista[i] = 5;  // #2 Raio
			}else if(i <= 16){
				lista[i] = 1; // #3 Terra
			}else if(i <= 18){
				lista[i] = 3; // #4 Água
			}else if(i == 19){
				lista[i] = 4; // # Fogo
			}
		}	
		byte golpe = lista[random];
		return golpe;
	}
}
