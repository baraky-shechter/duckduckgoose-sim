package edu.frostburg.cosc310;

import java.util.Random;
import java.awt.Color;

/**
 * Class for the Kid objects
 * 
 * @author Barak Shechter
 * @version 10.3.2015
 *
 */
public class Kid {
	
	private int speed;
	private int id;
	private Transform trans;
	private Color color;
	private Random rand = new Random(System.nanoTime());
	
	/**
	 * Constructor for Kid
	 * 
	 * @param i int id of the Kid
	 */
	public Kid(int i) {
		id = i;
		trans = new Transform();
		speed = rand.nextInt(3)+1;
		color = new Color(rand.nextInt(256),rand.nextInt(256), rand.nextInt(256));

		
	}
	
	
	/**
	 * Returns the Transform of the kid
	 * 
	 * @return Transform the transform object of the Kid
	 */
	public Transform getTrans() {
		return trans;
	}
	
	/**
	 * Set the Transform of Kid to a Transform, t
	 * 
	 * @param t Transform transfrom to be set to
	 */
	public void setTrans(Transform t) {
		trans.setXPos(t.getXPos());
		trans.setYPos(t.getYPos());
	}
	
	/**
	 * Return speed of Kid
	 * 
	 * @return speed of Kid
	 */
	public int getSpeed() {
		return speed;
	}
	
	/**
	 * Randomize the speed of Kid
	 */
	public void randomizeSpeed() {
		speed = rand.nextInt(3)+1;
	}
	
	/**
	 * Return color of Kid object
	 * 
	 * @return Color
	 */
	public Color getColor() {
		return color;
	}
	
	/**
	 * Return the id of Kid
	 * 
	 * @return int id
	 */
	public int getID() {
		return id;
	}

}
