/**This class is the main execution point for the LineClass
 * 
 */
package com.ss.four.line;

/**
 * @author Emilio_Benavente
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LineClass l1 = new LineClass(3.0,5.0,2.0,4.0);
		LineClass l2 = new LineClass(10.0,5.0,2.0,4.0);
		
		System.out.println(l1.getSlope());
		System.out.println(l1.getDistance());
		System.out.println(l2.getSlope());
		System.out.println(l2.getDistance());
	}

}
