package edu.frostburg.cosc310;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 * 
 * @author Barak Shechter
 * @version 2015.10.4
 * 
 * Creates the Game JPanel
 */
public class GamePanel extends JPanel  {
	
	public final int ONE_SECOND = 1000;
	public Timer timer;
	
	
	/**
	 * Constructor for the GamePanel
	 * Sets the border and maximum size
	 */
	public GamePanel() {
		setBorder(BorderFactory.createLineBorder(Color.BLACK));
		setMaximumSize(new Dimension(500,500));
		
	}
	
	/**
	 * Paint components for the game panel
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		g.drawOval(1,1, 498, 498);
		g.drawOval(35, 35, 430, 430);

		
		CircularlyLinkedList.Node<Seat> ref = Main.getPlayground().getList().getTail();
		for (int i=0 ; i < Main.getPlayground().getList().size(); ++i)
		{
			g.setColor(ref.getElement().getOccupant().getColor());
			g.fillOval(ref.getElement().getOccupant().getTrans().getXPos(), ref.getElement().getOccupant().getTrans().getYPos(), 20, 20);
			ref = ref.getNext();

		}
		g.setColor(Main.getPlayground().getIt().getColor());
		g.fillOval(Main.getPlayground().getIt().getTrans().getXPos(), Main.getPlayground().getIt().getTrans().getYPos(), 20, 20);
		
		

		
	}
	
	/**
	 * Return the preferred size of the game panel
	 * 
	 * @return Dimension preferred size
	 */
	public Dimension getPrefferedSize() {
		return new Dimension(500,500);
	}
	
	/**
	 * Set the maximum size of the game panel
	 * 
	 * @return Dimension maximum size
	 */
	public Dimension setMaximumSize() {
		return new Dimension(500,500);
	}

}
