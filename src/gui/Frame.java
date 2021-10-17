package gui;

import exceptions.OccupiedCellException;
import exceptions.UnallowedMovementException;
import exceptions.WrongTurnException;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.JProgressBar;

import model.game.Direction;
import model.game.Game;
import model.game.Player;
import model.pieces.Piece;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Frame extends JFrame implements ActionListener{

	public static JPanel panel1;
	public static JPanel panel2;
	public static JPanel panel3;
	public static JButton [] [] cells;
	public static CellsB curr;
	public static Game game;
	public static CellsB target;
	public static boolean POWER=false;
	ControlB up;
	ControlB down;
	ControlB right;
	ControlB left;
	ControlB upright;
	ControlB upleft;
	ControlB downleft;
	ControlB downright;
	PowerB usepower;
	public static JLabel label1;
	public static JLabel label2;
	JProgressBar P1 ;
	JProgressBar P2;
	public static JLabel prog1;
	public static JLabel prog2;
	public static Player player1;
	public static Player player2;
	public static JComboBox dead;
	
	
	public Frame(){
		
		player1 = new Player("dd");
		player2= new Player("cc");
		
		game = new Game(player1, player2);
		this.setVisible(true);
		this.setLayout(null);
		this.setSize(1000,800);
		this.setTitle("suhaila's game");
		
	
		
	
		
		        	
		// the game board
		panel1 = new JPanel();
		panel1.setLayout(new GridLayout(7,6));
		panel1.setBackground(Color.YELLOW);
		panel1.setVisible(true);
		panel1.setBounds(200, 25, 600, 500);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.getContentPane().add(panel1);
		this.setBackground(Color.BLACK);
		cells = new JButton [7][6];
		CellAction x = new CellAction();
		for (int i = 0; i<7; i++) {
			for (int j = 0; j<6; j++) {
				
				Piece p =this.game.getCellAt(i,j).getPiece();
		
				if (p==null){
					Point c = new Point (i,j);
					cells[i][j]=new CellsB("N",c);	
					 panel1.add(cells[i][j]);
					 cells[i][j].addActionListener(x);}
				
				else{
				Point c = new Point (i,j);
				 cells[i][j]=new CellsB(p.getName(),c);   
                 panel1.add(cells[i][j]);
                 cells[i][j].addActionListener(x);}
			}
		} 

		
		// buttons of direction and use power
		ControlAction y = new ControlAction();
		up = new ControlB ("UP",Direction.UP);
		up.setBounds(500, 525, 100, 30);
		this.getContentPane().add(up);
		up.addActionListener(y);
		right = new ControlB ("RIGHT",Direction.RIGHT);
		right.setBounds(590, 555, 100, 30);
		this.getContentPane().add(right);
		right.addActionListener(y);
		left = new ControlB ("LEFT",Direction.LEFT);
		left.setBounds(410, 555, 100, 30);
		this.getContentPane().add(left);
		left.addActionListener(y);
		down= new ControlB ("DOWN",Direction.DOWN);
		down.setBounds(500, 585, 100, 30);
		this.getContentPane().add(down);
		down.addActionListener(y);
		upright = new ControlB ("UP RIGHT",Direction.UPRIGHT);
		upright.setBounds(590, 525, 100, 30);
		this.getContentPane().add(upright);
		upright.addActionListener(y);
		upleft = new ControlB ("UP LEFT",Direction.UPLEFT);
		upleft.setBounds(410, 525, 100, 30);
		this.getContentPane().add(upleft);
		upleft.addActionListener(y);
		downleft = new ControlB("downleft",Direction.DOWNLEFT);
		downleft.setBounds(410, 585, 100, 30);
		this.getContentPane().add(downleft);
		downleft.addActionListener(y);
		downright = new ControlB ("DOWN RIGHT",Direction.DOWNRIGHT);
		downright.setBounds(590, 585, 100, 30);
		this.getContentPane().add(downright);
		downright.addActionListener(y);
		usepower = new PowerB ("USE POWER");
		usepower.setBounds(500, 555, 100, 30);
		usepower.addActionListener(usepower);
		this.getContentPane().add(usepower);
		
		//players labels
		label1 = new JLabel ("PLAYER 1");
		label1.setBounds(740, 525, 100, 25);
		this.getContentPane().add(label1);
		
		
		label2 = new JLabel ("PLAYER 2");
		label2.setBounds(200, 0, 100, 25);
		this.getContentPane().add(label2);
		
		prog1= new JLabel ("Player 1 PAYLOAD");
		prog1.setBounds(10, 100, 150, 25);
		this.getContentPane().add(prog1);
		
		prog2= new JLabel ("Player 2 PAYLOAD");
		prog2.setBounds(10, 250, 150, 25);
		this.getContentPane().add(prog2);
		
		if (this.game.getCurrentPlayer()== player1)
		label1.setForeground(Color.RED);
            else
			label1.setForeground(Color.RED);
		
		// progress bars
		
		P1= new JProgressBar(0,6);
		P1.setValue(0);
		P1.setStringPainted(true);
		P1.setBounds(10, 150, 150, 100);
		this.getContentPane().add(P1);

		P2= new JProgressBar(0,6);
		P2.setValue(0);
		P2.setStringPainted(true);
		P2.setBounds(10, 300, 150, 100);
		this.getContentPane().add(P2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		repaint();
		revalidate();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main (String[]args) {
		Frame p = new Frame();
		p.revalidate();
	}




  public static void updatepayload(JProgressBar e){
  
  }






















	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
	
	
}
