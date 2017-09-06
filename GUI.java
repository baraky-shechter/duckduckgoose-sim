package edu.frostburg.cosc310;

import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;


/**
 * 
 * @author Barak Shechter
 * @version 2015.10.3
 * 
 * Creates the main GUI class to create the frame and contain the panels
 */
public class GUI {

	public final static int ONE_SECOND = 1000;
	private static JFrame f;
	public static JPanel main, title, game;
	public static JLabel text;
	
	/**
	 * Constructor for GUI creates new frame and adds panels to it
	 */
	public GUI() {
		
		f = new JFrame("DuckDuckGoose - Barak Shechter");
		main = new JPanel();
		title = new TitlePanel();
		game = new GamePanel();
		text = new JLabel();
		text.setPreferredSize(new Dimension(500,100));
		text.setMaximumSize(new Dimension(300,100));
		text.setVerticalAlignment(SwingConstants.CENTER);
		text.setHorizontalAlignment(SwingConstants.LEFT);
		text.setText("Press next round!");
		createMainPanel();
		createAndShowGUI(f);
			

	}
	
	/**
	 * Create the main GUI frame
	 * 
	 * @param f JFrame frame to be manipulated
	 */
	public static void createAndShowGUI(JFrame f) {
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(500, 1000);
		f.add(main);
		f.pack();
		f.setVisible(true);
	}
	
	/**
	 * Create the main panel
	 */
	public static void createMainPanel() {
		main.setLayout(new BoxLayout(main,BoxLayout.Y_AXIS));
		main.setPreferredSize(new Dimension(500,700));
		main.setMinimumSize(new Dimension(500,700));
		main.add(title);
		main.add(game);
		main.add(text);
	}
	
}
