/**
 * 
 */
package com.ss.five.filter;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Emilio_Benavente
 *
 */
public class FilterStringListTest {

	@Test(expected = Test.None.class)
	public void mainTest() {
		FilterStringListDemo.main(null);
	}
	
	@Test
	public void sortByLenTest() {
		List<String> strArr = Arrays.asList("Bob", "Tommy", "Sammy", "Jo", "Taylor", "art", "Art");
		List<String> actArr = Arrays.asList("art");
		strArr = FilterStringListDemo.filterString(strArr);
		for(int i = 0; i < strArr.size(); ++i)
			Assert.assertEquals(actArr.get(i), strArr.get(i)); 
	}
	
}
