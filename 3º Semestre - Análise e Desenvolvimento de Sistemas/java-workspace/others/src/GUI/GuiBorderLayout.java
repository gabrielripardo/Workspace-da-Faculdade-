/**
 * @Descricao: O Border Layout é um layout que tem básicamente 5 posições em seus componentes, o sul, norte, leste, oeste e centro.
 *
 * @date 07/05/2017
 *
 */

package GUI;

import javax.swing.JFrame;

import java.awt.BorderLayout;
import java.awt.Container;
import javax.swing.JButton;

public class GuiBorderLayout extends JFrame {
	public GuiBorderLayout(){
		super("Layout do tipo Border");
		JButton btn1 = new JButton();
		btn1.setText("Botão 1");
		
		Container conteiner = getContentPane();
		conteiner.setLayout(new BorderLayout(150, 150)); // 150 é o espaçamento entre os componentes
		conteiner.add(BorderLayout.NORTH, btn1); // Adiciona o objeto do tipo Button do lado norte da Janela.
		conteiner.add(BorderLayout.SOUTH, new JButton("2")); // Cria e inseri um botão, cujo nome é 2 no lado sul da janela
		conteiner.add(BorderLayout.CENTER, new JButton("3"));
		
		setVisible(true);
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public static void main(String[] args){
		new GuiBorderLayout();
	}
}
