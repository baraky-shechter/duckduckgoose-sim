package edu.frostburg.cosc310;


import java.awt.event.*;
import javax.swing.JButton;

/**
 * Creates the next round button and controls its behavior
 * 
 * @author Barak Shechter
 * @version 2015.10.4
 *
 */
public class NextRoundButton extends JButton {
	
	public NextRoundButton() {
		setText("Next Round");
		this.addActionListener(new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            Main.getPlayground().incrememntRounds();
	            GUI.title.repaint();
	            Main.getPlayground().newRound();
	         };
		});

	}
}
