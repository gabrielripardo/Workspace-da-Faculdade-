package ContaGui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Jframe extends JFrame{
	JButton corr;
	JButton poup;
	JLabel account;
	
	public Jframe(){
		super("Conta Bancária");
		
		account = new JLabel("Escolha o tipo de conta:");
		
		corr = new JButton("Corrente");
		corr.addActionListener(new btnCorr());
		poup = new JButton("Poupança");
		poup.addActionListener(new btnPoup());
		
		Container btns = new JPanel(); // Container dos dois botões
		btns.setLayout(new GridLayout(1,2));
		btns.add(corr);
		btns.add(poup);
		
		Container c = getContentPane(); // Container principal
		c.setLayout(new BorderLayout(5, 5));
		c.add(BorderLayout.NORTH, account);
		c.add(BorderLayout.SOUTH, btns); 

		setVisible(true);
		setSize(250, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	class btnCorr implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			new JCorrente();
			
		}
		
	}
	class btnPoup implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			
			new JPoupanca();
		}
		
	}
	public static void main(String[] args){
		new Jframe();
	}
}
