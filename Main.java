package edu.frostburg.cosc310;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.SwingUtilities;
import javax.swing.Timer;

/**
 * 
 * @author Barak Shechter
 * @version 2015.10.3
 * 
 * Main class for DuckDuckGoose simulation
 */
public class Main {

	private static int numKids;
	private static Playground playground;
	private static GUI gui;
	private static final int DELAY = 17;
	
	/**
	 * Sets up the simulation, creates the playground, and has redraw loop
	 * 
	 * @param args
	 */
	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter how many kids are participating in DuckDuckGoose: ");
		numKids = scan.nextInt();
		
		playground = new Playground(numKids);
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				gui = new GUI();
			}
		});

		// Loop for redrawing the GUI
		ActionListener taskPerformer = new ActionListener() {
		      public void actionPerformed(ActionEvent evt) {
		          gui.game.repaint();
		      }
		  };
		  new Timer(DELAY, taskPerformer).start();
	}
	
	/**
	 * Get number of kids participating
	 * 
	 * @return int number of kids
	 */
	public static int getNumKids() {
		return numKids;
	}

	/**
	 * Get the active playground
	 * 
	 * @return Playground the active playground
	 */
	public static Playground getPlayground() {
		return playground;
	}
}
