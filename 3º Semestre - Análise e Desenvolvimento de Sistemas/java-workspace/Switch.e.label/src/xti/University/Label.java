/**
 * Uso do label. Um recurso do Java que permite mapear os fluxos para depois ficar mais fácil de serem chamados.
 * @date 25/05/2017
 */
package xti.University;

public class Label {

	public static void main(String[] args) {
		int cont = 0;
		int cont2 = 0;
		
		loop1:
		while(cont <= 10){
			loop2:
			while(cont2 <= 5){
				System.out.print(cont);
				cont2++;
				if (cont == 5 && cont2 == 2){
					break loop1;
				}
			}
			cont++;
		}
	}
}
