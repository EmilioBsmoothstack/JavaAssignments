/**This class is used to demonstrate a deadlock
 * 
 */
package com.ss.four.dead;


/**
 * @author Emilio_Benavente
 *
 */
public class DeadLockClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1 = new MyThread();
		MyThread2 t2 = new MyThread2();
		t1.start();
		t2.start();
	}

}
