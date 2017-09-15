package AplicationsUsual;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Container;

public class Layoutmaisacao extends JFrame implements ActionListener {
	JButton ok;
	JButton help;
	JButton salvar;
	JButton cancel;
	
	public Layoutmaisacao(){
		super("Dois layouts");
		
		ok = new JButton("OK");
		ok.addActionListener(this);
		help = new JButton("Help");
		help.addActionListener(this);
		salvar = new JButton("Salvar");
		salvar.addActionListener(this);
		cancel = new JButton("Cancel");
		
		Container ctn2 = new JPanel();
		ctn2.setLayout(new GridLayout(4, 1));
		ctn2.add(ok);
		ctn2.add(cancel);
		ctn2.add(help);
		ctn2.add(salvar);
		
		String lblCenter = "Aqui ficará outros componentes" + "\n" + "como Labels, edit Text, Combobox, radiobuttons";
		
		Container ctn = getContentPane(); // getContentPane é o container principal
		ctn.setLayout(new BorderLayout());
		ctn.add(BorderLayout.CENTER, new Label(lblCenter));
		ctn.add(BorderLayout.EAST, ctn2);
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (isEnabled() == ok){
		ok.setText("clicou ok");
		}else if(){
			//cancel.setText("cliclou em cancel");
		}else if(){
			
		}else{
			
		}
		//help.setText("pediu ajuda");
		//salvar.setText("savar o documento");
	}
	public static void main(String[] args){
		new Layoutmaisacao();
	}
}
