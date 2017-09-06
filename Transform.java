package edu.frostburg.cosc310;

/**
 * Transform class - controls position and movement
 * 
 * @author Barak Shechter
 * @version 2015.10.4
 *
 */
public class Transform {

	private int xPos;
	private int yPos;
	
	/**
	 * Create a new Transform object
	 * 
	 * @param x x position
	 * @param y y position
	 */
	public Transform(int x, int y) {
		xPos = x;
		yPos = y;
	}
	
	/**
	 * Default constructor
	 */
	public Transform() {
		xPos = 0;
		yPos = 0;
	}
	
	/**
	 * Get the X position of the Transform
	 * 
	 * @return xPos the x position
	 */
	public int getXPos() {
		return xPos;
	}
	
	/**
	 * Get the y position of the Transform
	 * 
	 * @return yPos the y position
	 */
	public int getYPos() {
		return yPos;
	}
	
	/**
	 * Set the x position
	 * 
	 * @param x the X position to be set
	 */
	public void setXPos(int x) {
		xPos = x;
	}
	
	/**
	 * Set the y position
	 * 
	 * @param y the Y position to be set
	 */
	public void setYPos(int y) {
		yPos = y;
	}
	
	/**
	 * Set both x and y positions
	 * 
	 * @param x the X position to be set
	 * @param y the Y position to be set
	 */
	public void setPos(int x, int y) {
		xPos = x;
		yPos = y;
	}
	
	/**
	 * Move the object to the left
	 * 
	 * @param x X units to be moved
	 */
	public void moveX(int x) {
		xPos -= x;
	}
	
	/**
	 * Move the object down
	 * 
	 * @param y Y units to be moved
	 */
	public void moveY(int y) {
		yPos -= y;
	}
	
}
