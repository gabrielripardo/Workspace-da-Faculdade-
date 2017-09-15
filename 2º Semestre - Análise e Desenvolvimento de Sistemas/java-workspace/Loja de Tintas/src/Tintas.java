/* Loja de tintas
 * Autor: Gabriel Ripardo
 * Data 26/09/16
 * Função: Definir o preço para latas e/ou tintas.
 */
import java.util.Scanner;

public class Tintas {
	public static void main(String []args){
		Scanner m_quad = new Scanner (System.in);
		float m_2;
		System.out.println("Digite a quantidade de m²: ");
		m_2 = m_quad.nextInt();
		int ltrs = (int) (1 * m_2);
		float litros = (float) ltrs / 6;
			float latas = (float) ((float)(80 * litros) / 18);
			float galao = (float) ((float)(25 * litros) / 3.6);
			float mix = (float) ((float)(latas + galao) * 0.10);
			System.out.println(litros);
			System.out.printf("$$$$$$$$$$$$$$ Preços $$$$$$$$$$$$$$$ \n");
			System.out.printf("1.Comprar apenas latas de 18 litros: R$ %s  \n", latas);
			System.out.printf("2.Comprar apenas galões de 3,6 litros: R$ %s \n", galao);
			System.out.printf("3.Mix - Latas e galões: R$ %s ", mix);
	}
}
