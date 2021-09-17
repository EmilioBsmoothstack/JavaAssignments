/**This class is designed to allow multiple instances of threads to run for testing
 * 
 */
package com.ss.four.sing;

/**
 * @author Emilio_Benavente
 *
 */
public class MyThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("This thread is starting!");
		
		SingletonClass.getSingletonClass();
		
		System.out.println("This thread has ended!");
	}

}
