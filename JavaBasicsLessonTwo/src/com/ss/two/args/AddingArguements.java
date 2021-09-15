/**This class will allow the user to add command line arguements. The program then prints the summation of all floating point values.
 * 
 */
package com.ss.two.args;

/**
 * @author Emilio Benavente
 *
 */
public class AddingArguements {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Float result = 0.0f;
		System.out.print("\nArgs: <");
		for(int i = 0; i < args.length; ++i) {
			try {
				System.out.print(Float.parseFloat(args[i]));
				result += Float.parseFloat(args[i]);
			}catch(Exception e) {
				System.out.print(" ");
			}
			System.out.print(", ");
		}
		System.out.println(">");
		System.out.println("Summation of all floats given is -> " + result + "f");
	}

}
