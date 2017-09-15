package ContaGui;

import java.awt.Container;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.InputMismatchException;

import javax.swing.*;

public class JCorrente extends JFrame implements ActionListener{
	JTextField valDep;
	JTextField valSac;
	JTextField vallim;
	JButton depos;
	JButton sacar;
	JTextArea saida;
	Corrente corr;
	JLabel lblValD;
	JLabel lblValS;
	JLabel lblLmt;
	JLabel lblSai;
	
	public JCorrente(){
		super("Conta Corrente");
		
		corr = new Corrente();
		
		vallim = new JTextField();
		valSac = new JTextField();
		valDep = new JTextField();
		depos = new JButton("Depositar");
		depos.addActionListener(this);
		sacar = new JButton("Sacar");
		sacar.addActionListener(new SacarClass());
		saida = new JTextArea();
		lblValD = new JLabel("Valor: ");
		lblValS = new JLabel("Valor: ");
		lblLmt = new JLabel("Limite: ");
		lblSai = new JLabel("Saldo: ");
		
		Container JDepos = new JPanel();
		JDepos.setLayout(new GridLayout(2, 2));
		
		JDepos.add(lblValD);
		JDepos.add(valDep);
		JDepos.add(lblLmt);
		JDepos.add(vallim);
		
		Container JSacar = new JPanel();
		JSacar.setLayout(new GridLayout(1, 2));
		JSacar.add(lblValS);
		JSacar.add(valSac);
		
		Container JSaida = new JPanel();
		JSaida.setLayout(new GridLayout(1, 2));
		JSaida.add(lblSai);
		JSaida.add(saida);
		
		Container Jtwo = getContentPane();
		Jtwo.setLayout(new GridLayout(5, 1));
		Jtwo.add(JDepos);
		Jtwo.add(depos);
		Jtwo.add(JSacar);
		Jtwo.add(sacar);
		Jtwo.add(JSaida);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setSize(400, 400);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		double dep = 0;
		double limite = 0;
	
			try{
				dep = Double.parseDouble(valDep.getText());
				// cast limite
				limite = Double.parseDouble(vallim.getText());
				
				
				// Inserir o valor no método classe
				if (valDep.getText() != "" && vallim.getText() != ""){
					corr.depositar(dep);
					corr.setLimite(limite);
				}else{
					JOptionPane.showMessageDialog(null, "Preencha os dois campos!");
				}
	
				// printa na GUI
				saida.setText("Saldo = " + corr.getSaldo());
				
			}catch(NumberFormatException var){
				JOptionPane.showMessageDialog(null, "Utilize apenas números!");
			}
	}
	class SacarClass implements ActionListener{
		double sac = 0;
		@Override
		public void actionPerformed(ActionEvent e) {
			sac = Double.parseDouble(valSac.getText());
			corr.sacar(sac);
			saida.setText("Saldo = " + corr.getSaldo());
		}
	}

	public static void main(String[] args){
		new JCorrente();
	}
}
