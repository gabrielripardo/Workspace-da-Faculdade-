package ContaGui;
import java.awt.*;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class JPoupanca extends JFrame implements ActionListener{
	JTextField val;
	JTextField limit;
	JButton sacar;
	JButton depos;
	JTextArea saida;
	
	public JPoupanca(){
		super("Conta Poupança");
		
		val = new JTextField("VALOR");
		limit = new JTextField("LIMITE");
		sacar = new JButton("Sacar");
		depos = new JButton("Depositar");
		saida = new JTextArea("SAIDA");
		
		Container options = new JPanel();
		options.setLayout(new FlowLayout());
		options.add(depos);
		options.add(sacar);
		
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(4,1));
		c.add(val);
		c.add(limit);
		c.add(options);
		c.add(saida);
		
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setSize(250, 150);
		super.setVisible(true);
	
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		
	}
	public static void main(String[] args){
		new JPoupanca();
	}

}
