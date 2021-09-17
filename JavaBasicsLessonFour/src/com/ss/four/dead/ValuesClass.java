/**This class is used to have values to deadlock threads
 * 
 */
package com.ss.four.dead;

/**
 * @author Emilio_Benavente
 *
 */
public class ValuesClass {
	private Integer myNum = 55;
	private String myStr = "Hello Dead Lock";

	public Integer getMyNum() {
		synchronized (myNum) {
			try {
				Thread.sleep(300);
				synchronized (myStr) {
					Thread.sleep(300);
				}
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return myNum;
	}

	public String getMyString() {
		synchronized (myStr) {
			try {
				Thread.sleep(300);
				synchronized (myNum) {
					Thread.sleep(300);
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return myStr;
	}
	

}
