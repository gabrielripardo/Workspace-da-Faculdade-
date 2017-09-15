import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class UsingInterface {
	public static void main(String []args){
		JFrame frame = new JFrame("swing_button_1");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Box vbox = new Box(BoxLayout.Y_AXIS);
		frame.add(vbox);
		
		JButton button1 = new JButton("Ok");
		JTextField entry1 = new JTextField("");
		
		ActionListener al = new ActionListener(){	
			public void actionPerformed (ActionEvent e)
			{
				System.out.print("Ok");
			}
		};
		
		button1.addActionListener(al);
		vbox.add(button1);
		vbox.add(entry1);
		
		frame.setSize(212, 258);
		frame.setVisible(true);
	}
	
}
