package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import model.pieces.Piece;
import model.pieces.heroes.ActivatablePowerHero;

public class PowerB extends JButton implements ActionListener
{
	
	
	
public PowerB(String s){
	
	super(s);
	
}

@Override
public void actionPerformed(ActionEvent e) {
	

	
	
	
	Frame.POWER= true;
}
	
	
	
	
	

}
