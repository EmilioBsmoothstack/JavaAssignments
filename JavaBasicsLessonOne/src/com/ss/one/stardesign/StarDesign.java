/**This Class is designed with for loops to create a star design
 * 
 */
package com.ss.one.stardesign;

/**
 * @author Emilio_Benavente
 *
 */
public class StarDesign {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int maxIndex = 5;
		int dashCount = 9;
		System.out.println("This is the star design assignment");
		System.out.println("----------------------------------");
		
		/***   @NOTE The nested for loop creates the design of phase 1   ***/
		System.out.println("1)");
		for(int i = 0; i < maxIndex - 1; ++i) {
			for(int j = 0; j < i + 1;++j) {
				System.out.print("*");
			}
			System.out.println();
		}
		printDots(dashCount); //Used to print out the dashes
		
		
		/***   @NOTE The nested for loop creates the design of phase 2   ***/
		System.out.println("2)");
		dashCount++; //Before a new instance of the dashes, the dashCount must increase
		printDots(dashCount);
		
		for(int i = maxIndex - 1; i > 0; --i) {
			for(int j = 0; j < i;++j) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/***   @NOTE The nested for loop creates the design of phase 3   ***/
		System.out.println("3)");
		for(int i = 0; i < maxIndex - 1; ++i) {
			for(int j = 0; j < maxIndex - i;++j) {
				System.out.print(" ");
			}
			for(int k = 0; k <  1 + (i*2);++k) {
				System.out.print("*");
			}
			System.out.println();
		}
		dashCount++;
		printDots(dashCount);
		
		
		/***   @NOTE The nested for loop creates the design of phase 4   ***/
		System.out.println("4)");
		dashCount++;
		printDots(dashCount);
		for(int i = maxIndex - 2; i >= 0; --i) {
			for(int j = 0; j < maxIndex - i;++j) {
				System.out.print(" ");
			}
			for(int k = 0; k < 1 + (i*2);++k) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	private static void printDots(int len) {
		for(int i = 0; i < len;++i) {
			System.out.print(".");
		}
		System.out.println();
	}

}
