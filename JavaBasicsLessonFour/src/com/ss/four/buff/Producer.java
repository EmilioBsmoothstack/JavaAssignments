/**This thread will be producing values to a global array so long as the array is not filled
 * 
 */
package com.ss.four.buff;

/**
 * @author Emilio_Benavente
 *
 */
public class Producer extends Thread{
	
	@Override
	public void run() {
		Integer num = 1;
		while(GlobalArray.isThreadsOn) {
			try {
				sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			for(int i = 0; i < GlobalArray.data.length; ++i) {
				if(GlobalArray.data[i] == 0) {
					GlobalArray.data[i] = num;
					i = GlobalArray.data.length + 1;
				}
			}
			num++;
		}
	}

}
