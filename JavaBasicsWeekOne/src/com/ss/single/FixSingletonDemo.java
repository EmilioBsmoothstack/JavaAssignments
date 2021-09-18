/**This class will demonstrate the use of the fixed version of the singleton class given
 * 
 */
package com.ss.single;

/**
 * @author Emilio_Benavente
 *
 */
public class FixSingletonDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		SampleSingleton = new SampleSingleton() Error
		SampleSingleton.getInstance();
		SampleSingleton.getInstance(); // Does not create 2 instances and is thread safe		
	}

}
