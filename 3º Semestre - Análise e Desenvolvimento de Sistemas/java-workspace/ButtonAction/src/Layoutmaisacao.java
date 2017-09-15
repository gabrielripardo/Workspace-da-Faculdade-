import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Layoutmaisacao extends JFrame {
	JButton ok;
	JButton help;
	JLabel lb1;
	JLabel lb2;

	public Layoutmaisacao(){
		super("Dois layouts");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 80);
		setVisible(true);
	
		Container ctn = getContentPane(); // getContentPane é o container principal
		
		// Container dos botões
		Container ctn2 = new JPanel();
		ctn2.setLayout(new GridLayout(2, 1));
		
		ok = new JButton("OK");		
		help = new JButton("Help");

		ctn2.add(ok);
		ctn2.add(help);

		// Container das labels
		Container lbs = new JPanel();
		lbs.setLayout(new GridLayout(2,1));
		
		lb1 = new JLabel("botao ok...");
		lb2 = new JLabel("botao help...");
		
		lbs.add(lb1);
		lbs.add(lb2);
		
		// Container principal, que organiza as outros labels
		ctn.setLayout(new BorderLayout());
		ctn.add(BorderLayout.CENTER, lbs);
		ctn.add(BorderLayout.EAST, ctn2);
		
		// Métodos que irão dar ação aos botões
		ok.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				lb1.setText("clicou em ok");;
			}
		});
		help.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent arg0) {
				lb2.setText("clicou em help");;
			}
		});	
	}
	public static void main(String[] args){
		new Layoutmaisacao();
	}
}
