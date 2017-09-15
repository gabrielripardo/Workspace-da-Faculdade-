/**
 * Descricao: O Flow layout é um tipo de layout bastante simples. Os componentes são inseridos em ordem crescente.
 * @date 07/05/2017
 * @author Gabriel Ripardo
 */
package GUI;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class GuiFlowLayout extends JFrame {
	public GuiFlowLayout(){
		super("Layout do tipo FLow");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setSize(500, 500);
		super.setVisible(true);
		
		Container ctn = getContentPane();
		ctn.setLayout(new FlowLayout());
		ctn.add(new JButton("1")); // O primeiro componente
		ctn.add(new JButton("2")); // Ficará do lado do componente anterior.
		ctn.add(new JButton("3"));	// E assim por diante.
		ctn.add(new JButton("3"));	
		ctn.add(new JButton("3"));	
		ctn.add(new JButton("3"));	
		ctn.add(new JButton("3"));	
		ctn.add(new JButton("3"));	
		ctn.add(new JButton("3"));	
		ctn.add(new JButton("3"));	
		ctn.add(new JButton("3"));	
		ctn.add(new JButton("3"));	
		ctn.add(new JButton("3"));	
		ctn.add(new JButton("3"));	
		
	}
	public static void main(String[] args){
		new GuiFlowLayout();
	}
}
