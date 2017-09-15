package GUI;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.*;

public class GuiGridLayout extends JFrame {
	public GuiGridLayout(){
		super("Famoso Layout do tipo Grid");
		
		super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		super.setSize(200, 100);
		super.setVisible(true);
		
		Container cnt = getContentPane();
		cnt.setLayout(new GridLayout(2, 3));
		cnt.add(new JButton("1"));
		cnt.add(new JButton("2"));
		cnt.add(new JButton("3"));
		cnt.add(new JButton("4"));
		cnt.add(new JButton("5"));
	}
	public static void main(String[] args){
		new GuiGridLayout();
	}
}
