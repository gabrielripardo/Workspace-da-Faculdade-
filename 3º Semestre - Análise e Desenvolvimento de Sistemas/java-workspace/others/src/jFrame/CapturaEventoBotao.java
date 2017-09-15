package jFrame;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class CapturaEventoBotao implements ActionListener {
	private JButton botao;
	
	public void janela(){
		JFrame frame = new JFrame();
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 500);
		frame.setVisible(true);
		
		botao = new JButton();
		botao.addActionListener(this);
		
		frame.getContentPane().add(botao);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 100);
		frame.setVisible(true);
		botao.setText("Clique");
		
	}
	
	@Override
	public void actionPerformed(ActionEvent evento){
		botao.setText("botao foi clicado");
		botao.setFont(new Font("SansSerif", Font.BOLD, 20));
	}
}
