/**
 * Descricao: Aprimoramento do programa com tratamento de erros com o Try, Catch.
 * @date 17/05/17
 */
package numberprimosv1_1_.noBugs;
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;

public class GUI extends JFrame {
	JButton ver; 
	JLabel aces;
	JTextField entrada;
	Container con = getContentPane();
	
	public GUI(){
		super("Números PRIMOS");
		
		aces = new JLabel("Digite um número:");
		entrada = new JTextField();
		ver = new JButton("Verificar");
		ver.addActionListener(new actionBtn());
		
		// Layout Organization
		con.setLayout(new BorderLayout(5, 5));
		con.add(BorderLayout.PAGE_START, aces);
		con.add(BorderLayout.CENTER, entrada);
		con.add(BorderLayout.SOUTH, ver);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250, 100);
		setVisible(true);
	}
	class actionBtn implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e){
			int numb = 0;
			
			// Tratamento de error
			// Se não haver conversão para int então não é um número, logo a sintaxe está incorreta.
			try{
				numb = Integer.parseInt(entrada.getText()); // Cast JTextField to int
				NumbersPrimos primo = new NumbersPrimos(numb); // Criação do objeto primo  + primo.info()	
				entrada.setText(entrada.getText() + primo.info()); // Mostrar resultado no JTextField
			
			}catch(NumberFormatException e1){
				JOptionPane.showMessageDialog(null, "Sintaxe Incorreta \nInsira um número inteiro");
				entrada.setText("");
			}
		}
	}
	public static void main(String[] args){
		new GUI();
	}
}
