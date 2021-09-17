/**This thread will be designed as a timer for the consumer and the producer
 * 
 */
package com.ss.four.buff;

/**
 * @author Emilio_Benavente
 *
 */
public class TimerThread extends Thread{

	@Override
	public void run() {
		try {
			sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		GlobalArray.isThreadsOn = false;
	}
}
