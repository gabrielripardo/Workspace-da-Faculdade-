package GUI;

import javax.swing.*;
import java.awt.*;

public class LayoutsJuntos extends JFrame {
	public LayoutsJuntos(){
		super("Dois layouts");
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setSize(300, 300);
		super.setVisible(true);
		
		Container ctn2 = new JPanel();
		ctn2.setLayout(new GridLayout(4, 1));
		ctn2.add(new JButton("OK"));
		ctn2.add(new JButton("Cancel"));
		ctn2.add(new JButton("Help"));
		ctn2.add(new JButton("Salvar"));
		
		String lblCenter = "Aqui ficará outros componentes" + "\n" + "como Labels, edit Text, Combobox, radiobuttons";
		
		Container ctn = getContentPane(); // getContentPane é o container primary
		ctn.setLayout(new BorderLayout());
		ctn.add(BorderLayout.CENTER, new Label(lblCenter));
		ctn.add(BorderLayout.EAST, ctn2);
	}
	public static void main(String[] args){
		new LayoutsJuntos();
	}
}
