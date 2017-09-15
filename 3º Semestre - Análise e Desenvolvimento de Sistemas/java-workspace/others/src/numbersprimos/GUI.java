package numbersprimos;
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
			// Cast EditText to int
			int numb = Integer.parseInt(entrada.getText());
			
			// Criação do objeto primo  + primo.info()	
			NumbersPrimos primo = new NumbersPrimos(numb);
			
			// mostrar no JTextField
			entrada.setText(entrada.getText() + primo.info());
		}
	}
	public static void main(String[] args){
		new GUI();
	}
}
