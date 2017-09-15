package jFrame;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;


public class CapturaEventoBotao2 extends JFrame implements ActionListener {
	private JButton botao;
	
	public CapturaEventoBotao2(){
		super("Ação no botão");
		
		botao = new JButton("Clique aqui");
		botao.addActionListener(this);	
		getContentPane().add(botao);
		
		//botao.setText("Clique");
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent evento){
		botao.setText("botao foi clicado");
		//botao.setFont(new Font("SansSerif", Font.BOLD, 20));
	}
	public static void main(String[] args){
		new CapturaEventoBotao2();
	}
}
