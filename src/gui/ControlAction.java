package gui;

import exceptions.OccupiedCellException;
import exceptions.UnallowedMovementException;
import exceptions.WrongTurnException;

import java.awt.Color;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import model.game.Direction;
import model.pieces.Piece;

public class ControlAction implements ActionListener{

public void actionPerformed(ActionEvent e) {
		
		ControlB control = (ControlB) e.getSource();
		Direction r = control.getDirection();
		

		// if moving only
		
		
			//current piece
	
	    	Piece p = Frame.game.getCellAt((int)Frame.curr.getCO().getX(),(int)Frame.curr.getCO().getY()).getPiece();	
			
	    	try {
				p.move(r);
			} catch (UnallowedMovementException  e1) {
				JOptionPane.showMessageDialog(null, "Unallowed Move ");
				
			} catch (OccupiedCellException e1) {
				JOptionPane.showMessageDialog(null, "there is a friendly piece here");
				e1.printStackTrace();
			} catch (WrongTurnException e1) {
				JOptionPane.showMessageDialog(null, "This is not ur turn");
			}
	  	for (int i = 0; i<7; i++) {
			for (int j = 0; j<6; j++) {
				
				Piece n =Frame.game.getCellAt(i,j).getPiece();
		
				if (n==null){
					Point c = new Point (i,j);
					((CellsB) Frame.cells[i][j]).setCO(c);
					Frame.cells[i][j].setText("N");
					
				}
				
				else{
				Point c = new Point (i,j);
				((CellsB) Frame.cells[i][j]).setCO(c);
				Frame.cells[i][j].setText(n.getName());}
			}
			
		} 
		
	  	if (Frame.game.getCurrentPlayer()== Frame.player1){
			Frame.label1.setForeground(Color.RED);
	  	    Frame.label2.setForeground(Color.BLACK);}
	            else{
				Frame.label2.setForeground(Color.RED);
				Frame.label1.setForeground(Color.BLACK);}
			
					        
	    }
			
			
			
			
			
			
		}
		
	
	
	


