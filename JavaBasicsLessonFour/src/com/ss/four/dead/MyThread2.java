/**This class is designed to allow multiple instances of threads to run for dead locking
 * 
 */
package com.ss.four.dead;

/**
 * @author Emilio_Benavente
 *
 */
public class MyThread2 extends Thread{

	@Override
	public void run() {
		System.out.println("Thread 2 has started!");
		ValuesClass vc = new ValuesClass();
		vc.getMyString();
		vc.getMyNum();
		System.out.println("Thread 2 has ended!");
	}
	
}
