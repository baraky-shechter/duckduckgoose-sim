package edu.frostburg.cosc310;

/**
 * Utility class
 * 
 * @author Barak Shechter
 * @version 2015.10.4
 */
public abstract class Utils {
	
	/**
	 * Calculate the angle based on coordinate
	 * 
	 * @param x X coordinate
	 * @param y Y coordinate
	 * @return double Angle in radians
	 */
	public static double calcAngle(int x, int y) {
		double angle = 0.0;
		if (y >=0) {
    		if (x >= 0) {
    			angle = Math.asin(y/215);
    		}
    		else {
    			angle = (Math.asin(y/215))+(Math.PI/2);
    		}
    	} 
    	else if (y <0) {
    		if (x >= 0) {
    			angle = (2*Math.PI)+(Math.asin(y/215));
    		}
    		else{
    			angle = Math.PI - (Math.asin(y/215));
    		}
    	}
    	else {
    		if (x>=0) {
    			angle = Math.PI/2;
    		}
    	}
		return angle;
	}
}
