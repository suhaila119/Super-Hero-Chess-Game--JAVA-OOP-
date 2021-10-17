package gui;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.SwingUtilities;

import exceptions.InvalidPowerUseException;
import exceptions.WrongTurnException;
import model.pieces.Piece;
import model.pieces.heroes.ActivatablePowerHero;

public class CellsB extends JButton {
	
	Point CO;
	
	
	public CellsB( String s, Point co)
	{
		super(s);
		this.CO= co;
	
	}



	public CellsB() {
		// TODO Auto-generated constructor stub
	}



	public Point getCO() {
		return CO;
	}





	public void setCO(Point cO) {
		CO = cO;
	}



	

	
}
