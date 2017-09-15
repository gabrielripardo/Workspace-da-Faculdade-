package windowBuilder;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Calc extends JFrame{
	private JPanel contentPane;
	private JTextField number;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calc frame = new Calc();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Calc() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 298, 226);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		number = new JTextField();
		number.setBounds(46, 12, 198, 19);
		contentPane.add(number);
		number.setColumns(10);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(24, 152, 245, 25);
		contentPane.add(btnCalcular);
		
		JButton somar = new JButton("+");
		somar.addActionListener(new ButtonSoma()); 
	
		somar.setBounds(24, 56, 117, 25);
		contentPane.add(somar);
		
		JButton subt = new JButton("-");
		subt.setBounds(24, 101, 117, 25);
		contentPane.add(subt);
		subt.addActionListener(new ButtonSubt());
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.setBounds(153, 56, 117, 25);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(152, 101, 117, 25);
		contentPane.add(btnNewButton_3);
		
		btnCalcular.addActionListener(new ButtonRsl());
		
	}
	
	float num1;
	boolean btnSoma;
	boolean btnSubt;
	float rsl = 0;
	
	class ButtonSoma implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			num1 = Float.parseFloat(number.getText());
			btnSoma = true;
			number.setText("");
		}
	}
	class ButtonSubt implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			num1 = Float.parseFloat(number.getText());
			btnSubt = true;
			number.setText("");
		}
	}

	class ButtonRsl implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			float num2 = Float.parseFloat(number.getText());
			
			if(btnSoma = true){
				rsl = num2 + num1;
			}if(btnSubt = true){
				rsl = num1 - num2;
			}
			number.setText(Float.toString(rsl));
		}
	}
}
