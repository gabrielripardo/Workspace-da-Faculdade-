import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ImparPar extends JFrame {
	JButton calc;
	JButton clean;
	JButton other;
	JTextField num;
	
	public ImparPar(){
		super("Ímpar ou Par");
	
		num = new JTextField(); 	
		calc = new JButton("Verificar");
		calc.addActionListener(new BotaoCalc()); // Faz referência ao BotaoCalc que a classe que está implementado o ActionEvent que irá realizar alguma ação.
		clean = new JButton("Limpar");
		clean.addActionListener(new BotaoNum());
		other = new JButton("Outros");
		//Layoutmaisacao otherWindow = new Layoutmaisacao();
		//other.addActionListener((ActionListener) otherWindow);
		
		Container cPbtn = new JPanel();
		cPbtn.setLayout(new GridLayout(1, 2));
		cPbtn.add(calc);
		cPbtn.add(clean);
		
		Container cP = getContentPane();
		cP.setLayout(new BorderLayout(150, 150));
		cP.add(BorderLayout.NORTH, num);
		cP.add(BorderLayout.SOUTH, cPbtn);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // CRIAÇÃO DA JANELA SEMPRE CODIFICADO DEPOIS DE CRIAR E ADICINONAR OS COMPONENTES
		setSize(300, 75);
		setVisible(true);
		
	}
	public static void main(String[] args){
		new ImparPar();
	}
	public class BotaoCalc implements ActionListener{
	
		@Override
		public void actionPerformed(ActionEvent arg0) {
			int entry = Integer.parseInt(num.getText());
			String parImpar;
			//if (entry == ints){
				if (entry % 2 == 0){
					parImpar = " é par";
				}else{
					parImpar = " é ímpar";
				}
			num.setText("Número = " + num.getText() + parImpar);	
			//else{
			//	num.setText("Caractere Inválido!"); 
			//}
		}	
	}
	public class BotaoNum implements ActionListener{
		
		@Override
		public void actionPerformed(ActionEvent arg){
			num.setText("");
		}
	}	
}

