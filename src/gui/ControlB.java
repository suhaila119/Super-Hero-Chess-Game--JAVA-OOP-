package gui;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import exceptions.OccupiedCellException;
import exceptions.UnallowedMovementException;
import exceptions.WrongTurnException;
import model.game.Direction;
import model.pieces.Piece;
import model.pieces.heroes.ActivatablePowerHero;

public class ControlB extends JButton {

	public Direction direction;
	
	public ControlB(String string, Direction direction) {
		super (string);
		this.direction = direction;
		
	
	}
	
	


	public Direction getDirection() {
		return direction;
	}





	
	
}
