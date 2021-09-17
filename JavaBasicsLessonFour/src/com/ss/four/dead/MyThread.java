/**This class is designed to allow multiple instances of threads to run for dead locking
 * 
 */
package com.ss.four.dead;

/**
 * @author Emilio_Benavente
 *
 */
public class MyThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("Thread 1 has started!");
		ValuesClass vc = new ValuesClass();
		vc.getMyNum();
		vc.getMyString();
		System.out.println("Thread 1 has ended!");
	}

}
