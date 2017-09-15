/**
 * Descrição: Uma das primeiras implementação da biblioteca Swing. 
 * O objetivo foi criar uma janela, com seu tamanho e seus padrões e inserir um botão ação de mudar de texto.
 * 
 * @date 07/05/17
 */
package GUI;

import javax.swing.JFrame;
//import java.awt.event.ActionEvent; // Biblioteca java para dar ação ao botão
//import java.awt.event.ActionListener; // Biblioteca Java Swing para dar ação, 
import javax.swing.JButton;
import java.awt.event.*;

public class JFrameStudy extends JFrame implements ActionListener{
	private JButton btn;
	
	public JFrameStudy(){
		super("Simples Botão");
		
		btn = new JButton("Clique aqui");
		btn.addActionListener(this);
		getContentPane().add(btn);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setVisible(true);		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		btn.setText("Botão clicado");
	//	System.out.println("Botão clicado!");
	}
	public static void main(String[] args){
		new JFrameStudy();
	}
}
