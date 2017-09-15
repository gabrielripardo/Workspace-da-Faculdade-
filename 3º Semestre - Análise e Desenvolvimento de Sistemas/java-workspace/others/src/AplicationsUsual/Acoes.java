package AplicationsUsual;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Acoes implements ActionListener{
	JButton cancelar;
	
	public Acoes(){
		cancelar = new JButton("CANCELAR");
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		cancelar.setText("clicou em cancelar");
		
	}

}
