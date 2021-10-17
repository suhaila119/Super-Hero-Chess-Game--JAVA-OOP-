package gui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class StartGameView extends JFrame{
	
	
   JPanel panel;
   JLabel label;
   JButton button1;
   JTextField field1;
   JTextField field2;
	
	
	public StartGameView() {
		
		this.setTitle("SUPER HERO CHESS");
		label= new JLabel ("PLAYER 1:");
		label.setVisible(true);
		label.setBounds(100,50,400,200);
		this.getContentPane().add(label);
		field1 = new JTextField();
		field1.setBounds(170, 135, 100, 30);
		this.getContentPane().add(field1);
		label= new JLabel ("PLAYER 2:");
		label.setVisible(true);
		label.setBounds(100,1,400,200);
		this.getContentPane().add(label);
		field2 = new JTextField();
		field2.setBounds(170, 100, 100, 30);
		this.getContentPane().add(field2);
		button1 = new JButton ("YALLAAA");
		button1.setBounds(100, 200, 100, 30);
		this.getContentPane().add(button1);
		panel = new JPanel();
		panel.setSize(800 ,500);
		panel.setVisible(true);
		//panel.setBackground(Color.BLACK);
		this.setLayout(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setSize(800,500);
		this.add(panel);
		
		
	}
	
	
	
	
	public static void main (String[]args) {
		StartGameView s = new StartGameView();
		
	}

}
