/**This class will use Java 8 to format a list of Ints
 * 
 */
package com.ss.five.comma;

import java.util.Arrays;
import java.util.List;

/**
 * @author Emilio_Benavente
 *
 */
public class CommaSepDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> intArr = Arrays.asList(2,-3,212,32,4,-2,1);
		formatInts(intArr);

	}
	
	public static List<Integer> formatInts(List<Integer> intArr) {
		intArr.stream().forEach((i) -> {if(i % 2 == 0) System.out.print("e" + i + ", "); else System.out.print("o" + i + ", ");});
		return intArr;
	}

}
