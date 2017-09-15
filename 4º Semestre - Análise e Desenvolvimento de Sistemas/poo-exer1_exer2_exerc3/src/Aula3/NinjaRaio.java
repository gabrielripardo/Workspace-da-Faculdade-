package Aula3;

import java.util.Random;

public class NinjaRaio extends Ninja {

	public NinjaRaio(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
		/*
		 * 	Raio 40%
		 *	Terra 25%
		 *	Água 17%
		 *	Fogo 13%
		 *	Vento 5%
         *
         * 1 = Terra
         * 2 = Vento
         * 3 = Água
         * 4 = Fogo
         * 5 = Raio
		 * 
		 */
	}

	@Override
	public byte atacar() {
		Random gera = new Random();

		byte[] lista = new byte[20];
		byte random = (byte) gera.nextInt(lista.length);

		for(byte i=0; i<lista.length; i++){
			if(i < 8){
				lista[i] = 5; // #Raio 
			}else if(i <= 13){
				lista[i] = 1;  // #Terra
			}else if(i <= 16){
				lista[i] = 3; // #Água 
			}else if(i <= 18){
				lista[i] = 4; // #Fogo
			}else if(i == 19){
				lista[i] = 2; // #Vento
			}
		}	
		byte golpe = lista[random];
		return golpe;
	}
}
