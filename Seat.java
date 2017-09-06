package edu.frostburg.cosc310;

/**
 * Class for the Seat object
 * 
 * @author Barak Shechter
 * @version 2015.10.5
 *
 */
public class Seat {

	private Kid occupiedBy;
	private int id;
	private Transform trans;
	
	/**
	 * Create a new Seat with id, and position
	 * 
	 * @param i id
	 * @param x x position
	 * @param y y position
	 */
	public Seat(int i, int x, int y) {
		occupiedBy = null;
		id = i;
		trans = new Transform(x,y);
	}
	
	/**
	 * Overload constructor, no id, just position
	 * 
	 * @param x x position of the Seat
	 * @param y y position of the Seat
	 */
	public Seat(int x, int y) {
		occupiedBy = null;
		trans = new Transform(x,y);
	}
	
	/**
	 * Overload constructor
	 * 
	 * @param k Kid to occupy the Seat
	 */
	public Seat(Kid k) {
		occupiedBy = k;
	}
	
	/**
	 * Get the occupant of the seat
	 * 
	 * @return Kid occupant of the seat
	 */
	public Kid getOccupant() {
		return occupiedBy;
	}
	
	/**
	 * Set the occupant of the Seat to a Kid k
	 * 
	 * @param k Kid to be the new occupant of the Seat
	 */
	public void setOccupant(Kid k) {
		occupiedBy = k;
	}

	
	/**
	 * Get the Transfrom object of the Seat
	 * 
	 * @return Transform trans
	 */
	public Transform getTrans() {
		return trans;
	}
	
}
