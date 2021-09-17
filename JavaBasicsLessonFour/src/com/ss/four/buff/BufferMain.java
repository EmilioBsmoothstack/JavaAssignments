/**This program will demonstrate multiple threads using the same buffer.
 * 
 */
package com.ss.four.buff;

/**
 * @author Emilio_Benavente
 *
 */
public class BufferMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producer p = new Producer();
		Consumer c = new Consumer();
		TimerThread t = new TimerThread();
		GlobalArray.data = new Integer[GlobalArray.maxSize];
		for(int i = 0; i < GlobalArray.maxSize; ++i)
			GlobalArray.data[i] = 0;
		
		t.start();
		p.start();
		c.start();
		
	}

}
