/** This class will demonstrate the use of the singleton class
 * 
 */
package com.ss.four.sing;

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
		MyThread t1 = new MyThread();
		MyThread t2 = new MyThread();
		MyThread t3 = new MyThread();

		t1.start();
		t2.start();
		t3.start();
	}

}
