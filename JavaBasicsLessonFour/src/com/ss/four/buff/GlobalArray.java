/**This class is simply a middle man for data to be stored from the producer to consumer
 * 
 */
package com.ss.four.buff;

/**
 * @author Emilio_Benavente
 *
 */
public class GlobalArray {
	
	public static int maxSize = 5;
	public static volatile Integer[] data;
	
	public static boolean isThreadsOn = true;
	
	
}
