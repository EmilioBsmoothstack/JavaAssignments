/**This thread will be getting values from an array given that the array has some value.
 * 
 */
package com.ss.four.buff;

/**
 * @author Emilio_Benavente
 *
 */
public class Consumer extends Thread{
	
	@Override
	public void run() {
		Integer num = 1;
		while(GlobalArray.isThreadsOn) {
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(int i = 0; i < GlobalArray.data.length; ++i) {
				if(GlobalArray.data[i] != 0) {
					System.out.println("The Consumer accessed number -> " + GlobalArray.data[i]);
					GlobalArray.data[i] = 0;
					i = GlobalArray.data.length + 1;
				}
			}
			num++;
		}
	}

}
