package edu.frostburg.cosc310;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 * Class for the TitlePanel of the GUI
 * 
 * @author Barak Shechter
 * @version 2015.10.4
 *
 */
public class TitlePanel extends JPanel {

	/**
	 * Creates the TitlePanel on the GUI
	 */
	public TitlePanel() {
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		setMaximumSize(new Dimension(500,100));
		setMinimumSize(new Dimension(500,100));
		add(new NextRoundButton());
	}
	
	/**
	 * Set the preferred size of the panel
	 */
	public Dimension getPreferredSize() {
		return new Dimension(10,50);
	}
	
	/**
	 * Paint method to paint the strings on the title panel
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawString("DuckDuckGoose", 20, 20);
		g.drawString("Number of kids participating: " + Main.getNumKids(), 20, 40);
		g.drawString("Round number: " + Main.getPlayground().getRounds(), 360, 40);
	}
	
	/**
	 * Update method
	 */
	public void update(Graphics g) {
		super.paintComponent(g);
		g.drawString("Round number: " + Main.getPlayground().getRounds(), 360, 40);
	}
	
}
