/**This class will demonstrate the use of lambdas with arrays
 * 
 */
package com.ss.five.arr;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Emilio_Benavente
 *
 */
public class LambdaArrayClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strArr = Arrays.asList("Bob", "Tommy", "Sammy", "Jo", "Taylor");
		sortByLen(strArr);
		System.out.println();
		sortByLenRev(strArr);
		System.out.println(strArr);
		sortByFirstChar(strArr);
		System.out.println();
		sortByIsE(strArr);
		System.out.println();
		sortByIsEStatic(strArr);
		
	}

	
	public static List<String> sortByLen(List<String> strArr) {
		strArr.sort((a, b) -> Integer.compare(a.length(), b.length()));
		strArr.forEach((s) -> System.out.println(s));
		return strArr;
	};

	public static List<String> sortByLenRev(List<String> strArr) {
		strArr.sort((a, b) -> Integer.compare(b.length(), a.length()));
		strArr.forEach((s) -> System.out.println(s));
		return strArr;
	};

	public static List<String> sortByFirstChar(List<String> strArr) {
		strArr.sort((a, b) -> Integer.compare(a.charAt(0), b.charAt(0)));
		strArr.forEach((s) -> System.out.println(s));
		return strArr;
	};
	
	public static List<String> sortByIsE(List<String> strArr) {
		Comparator<String> comp = (a,b) -> {
			int num = a.contains("e") ? 0 : 1;
			return Integer.compare(num, 1);
		};
		strArr.sort(comp);
		strArr.forEach((s) -> System.out.println(s));	
		return strArr;
	};
	
	public static List<String> sortByIsEStatic(List<String> strArr) {
		strArr.sort((a,b) -> isEStaticHelper(a));
		strArr.forEach((s) -> System.out.println(s));
		return strArr;
	};
	
	private static Integer isEStaticHelper(String a) {
			int num = a.contains("e") ? 0 : 1;
			return Integer.compare(num, 1);
	};
}
