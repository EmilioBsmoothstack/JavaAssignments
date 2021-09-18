/**This Class will demonstrate a few number based lambda functions
 * 
 */
package com.ss.lambda;

/**
 * @author Emilio_Benavente
 *
 */
public class LambdaDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int len = 0;
		try {
			len = Integer.parseInt(args[0]);
		}
		catch(Exception e) {}
		
		int y = 1;
		for(int i = 0; i < len; i++, y+=2) {
			if(y + 2 < args.length) {
				try {
					Integer op = Integer.parseInt(args[y]);
					Integer val = Integer.parseInt(args[y + 1]);
					if(op == 1) printIsOdd(val);
					else if(op == 2) printIsPrime(val);
					else printIsPalindrome(val);
				}
				catch(Exception e) {
					continue;
				}
			}
		}
		
	}
	
	private static void printIsOdd(Integer x) {
		FunctInt isOdd = (a) -> a % 2 != 0;
		Boolean result = isOdd.numOperation(x);
		System.out.print("Is " + x + " an Odd Number -> ");
		if(result)
			System.out.println("ODD");
		else
			System.out.println("EVEN");
	}
	
	private static void printIsPrime(Integer x) {
		FunctInt isPrime = (a) -> {
			for(int i = 2; i <= a / 2; i++) {
				if(a % i == 0) return false;
			}
			return true;
		};
		
		Boolean result = isPrime.numOperation(x);
		System.out.print("Is " + x + " a Prime Number -> ");
		if(result)
			System.out.println("PRIME");
		else
			System.out.println("NOT A PRIME");
	}
	
	private static void printIsPalindrome(Integer x) {
		FunctInt isPalindrome = (a) -> {
			int tmp = a, num= 0, remainder = 0;
		    while (tmp != 0) {
		      remainder = tmp % 10;
		      num = num * 10 + remainder;
		      tmp /= 10;
		    }
		    if (a == num)return true;
		    return false;
		};
		Boolean result =  isPalindrome.numOperation(x);
		System.out.print("Is " + x + " a Palindrome -> ");
		if(result)
			System.out.println("PALINDROME");
		else
			System.out.println("NOT A PALINDROME");
	}

}
