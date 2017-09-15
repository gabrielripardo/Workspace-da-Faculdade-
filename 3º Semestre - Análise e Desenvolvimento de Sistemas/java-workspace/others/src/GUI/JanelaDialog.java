package GUI;
/**
 * @descricao o software irá pedir a entrada de um número e ele irá verificar se ele é par ou ímpar.
 * @author Gabriel Ripardo
 * @date 22/04/17
 * @comments Primeira implementação usando o pacote swing na mão.
 */
//package WindowGraphic;
import javax.swing.JOptionPane;
public class JanelaDialog {
	public static void main(String[] args){ 
		String var = JOptionPane.showInputDialog(">> Par ou ímpar << \nDigite o número: ");
		int num = Integer.parseInt(var);
		
		String rsl;
		if(num % 2 == 0){
			rsl = "O número " + var + " é par";  
		}else{
			rsl = "O número " + var + " é impar";
		}
		JOptionPane.showMessageDialog(null, rsl);
	}
}
