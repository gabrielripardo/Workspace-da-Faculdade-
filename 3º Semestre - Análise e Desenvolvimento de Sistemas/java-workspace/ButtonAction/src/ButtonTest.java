import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonTest implements ActionListener {
	private JButton botao;
	public void janela()
	{
		JFrame frame = new JFrame();
		botao = new JButton();
		botao.addActionListener(this);
		frame.getContentPane().add(botao);	
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 100);
		frame.setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent evento)
	
	{ 
		botao.setText("Botão foi clicado!");
		//botao.setFont("new font ("SansSerif", Font);
	}
	
}
