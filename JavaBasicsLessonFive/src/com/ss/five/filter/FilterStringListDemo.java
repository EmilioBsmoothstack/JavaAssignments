/**THis class will demonstrate the use of streams and lambdas to filter out a list of strings
 * 
 */
package com.ss.five.filter;

import java.util.Arrays;
import java.util.List;

/**
 * @author thesp
 *
 */
public class FilterStringListDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> strArr = Arrays.asList("Bob", "Tommy", "Sammy", "Jo", "Taylor", "art", "Art");
		filterString(strArr);
	}
	
	public static List<String> filterString(List<String> strArr) {
		strArr.stream().filter((s) -> s.charAt(0) == 'a' && s.length() == 3).forEach((s) -> System.out.println(s));
		return strArr.stream().filter((s) -> s.charAt(0) == 'a' && s.length() == 3).toList();
	}

}
