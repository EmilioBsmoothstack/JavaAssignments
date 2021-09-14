/**This is a simple guess the number game, the user will have 5 guesses.
 * 
 */
package com.ss.one.guessgame;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

/**
 * @author Emilio_Benavente
 *
 */
public class NumberGuessGame {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Random rand = new Random();
		int num = rand.nextInt(100) + 1;
		int currGuess = 0;
		
		
		while(currGuess < 5) {
			/*** @NOTE try/case simply for error prone user tactics   ***/ 
			try {
			System.out.println("Try and guess a number");
			String str = br.readLine();
			int n = Integer.parseInt(str);
			if(n < 1 || n > 100)
				throw new Exception();
				
			if(n == num) {
				System.out.println("Congrats, you have guessed the number!!");
				break;
			}
			else if(currGuess == 4) 
				System.out.println("Sorry, you have ran out of guesses, the correct number was -> " + num);
			else if(((n < num) && (n + 10 >= num)) || ((n > num) && (n - 10 <= num))) {
				System.out.println("You are getting warmer!");
			}
			else {
				System.out.println("You are getting colder!");
			}
			currGuess++;
			}
			catch(Exception e){
				System.out.println("You MUST enter a number to guess between 1 - 100.");
				continue;
			}
		}
	}

}
