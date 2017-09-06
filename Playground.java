package edu.frostburg.cosc310;

import java.awt.Color;
import java.util.Random;

/**
 * Creates a Playground object, and controls main simulation logic
 *
 * @author Barak Shechter
 * @version 2015.10.4
 *
 */
public class Playground {

	private CircularlyLinkedList<Seat> seatList;
	private Kid it;
	private int numRounds;
	private int numSeats;
	public final double PI = 3.14159265359;
	
	/**
	 * Create a new Playground object
	 * 
	 * @param k int Number of Kids participating in the game
	 */
	public Playground(int k) {
		seatList = new CircularlyLinkedList<Seat>();
		numRounds = 0;
		numSeats = k-1;
		double deltaAngle = (2*PI)/numSeats;
		
		
		// Create the seats and the kids, assign the kids to
		// the seats, and set their Transform to the seats'
		// Transform
		for (int i = 0; i< numSeats; ++i) {
			double angle = i*deltaAngle;
			Double x = 180 * Math.cos(angle);
			Double y = 180 * Math.sin(angle);
			int xInt = x.intValue() + 240;
			int yInt = y.intValue() + 240;
			Seat s = new Seat(i,xInt,yInt);
			Kid kid = new Kid(i);
			s.setOccupant(kid);
			seatList.addLast(s);
			kid.setTrans(s.getTrans());
		}
		// Create the last kid who will be designated 'it'
		Kid kid = new Kid(k);
		it = kid;
		it.setTrans(new Transform(455,240));
		
		
	}
	
	/**
	 * Get the circularly linked list of the seats
	 * 
	 * @return the circularly linked list of seats in the playground
	 */
	public CircularlyLinkedList<Seat> getList() {
		return seatList;
	}
	
	/**
	 * Get the number of rounds that have been played
	 * @return the number of rounds played
	 */
	public int getRounds() {
		return numRounds;
	}
	
	/**
	 * Add one to the number rounds that have been played
	 * i.e. next round
	 */
	public void incrememntRounds() {
		++numRounds;
		System.out.println(numRounds);
	}
	
	/**
	 * Get the Kid that is 'it'
	 * @return the Kid that is 'it'
	 */
	public Kid getIt() {
		return it;
	}
	
	/**
	 * Set the 'it' to a new Kid taken from the seat he occupies
	 * 
	 * @param s The seat of the target Kid
	 */
	public void setIt(Seat s) {
		Kid ref = s.getOccupant();
		s.setOccupant(it);
		it = ref;
		it.getTrans().setPos(455, 240);
		s.getOccupant().setTrans(s.getTrans());
	}
	
	/**
	 * Logic of the new round
	 * 
	 * Randomizes the speed of the Kid that is 'it'
	 * Randomly selects a target for the 'it'
	 * Moves 'it' to the target Kid
	 * Competes with the target Kid
	 * The Kid with the 
	 */
	public void newRound() {
		// Prints out information to the GUI about the state of the game
		GUI.text.setForeground(Color.BLUE);
		GUI.text.setText("New Round!");
		System.out.println("New Round");
		// Randomizes the speed of the Kid that is 'it'
		it.randomizeSpeed();
		// Randomly select target for 'it'
		Random rand = new Random(System.nanoTime());
		int target = rand.nextInt(numSeats);
		CircularlyLinkedList.Node<Seat> ref = seatList.getTail();
		for (int i = 0; i< target; ++i) {
			ref = ref.getNext();
		}
		Seat refSeat = ref.getElement();
		// Move 'it' to target seat
		it.setTrans(refSeat.getTrans());
    	it.getTrans().moveX(10);
		
		// Competes with target Kid, comparing speeds
    	// If successful
    	if (it.getSpeed() > refSeat.getOccupant().getSpeed()) {
			setIt(refSeat);
			GUI.text.setForeground(Color.RED);
			GUI.text.setText("'It' has changed! The 'it' is now #: " + it.getID());
		}
		// If fails
		else {
			GUI.text.setForeground(Color.DARK_GRAY);
			GUI.text.setText("'It' has failed, go again!");
		}
	}
	
}
