/**This will test all the methods in LambdaArrayClass
 * 
 */
package com.ss.five.arr;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Emilio_Benavente
 *
 */
public class LambdaArrayTest {
	
	@Test(expected = Test.None.class)
	public void mainTest() {
		LambdaArrayClass.main(null);
	}
	
	@Test
	public void sortByLenTest() {
		List<String> strArr = Arrays.asList("Tommy", "Sammy", "Jo", "Taylor", "Su", "Karl");
		List<String> actArr = Arrays.asList("Jo", "Su", "Karl", "Tommy", "Sammy", "Taylor");
		strArr = LambdaArrayClass.sortByLen(strArr);
		for(int i = 0; i < strArr.size(); ++i)
			Assert.assertEquals(actArr.get(i), strArr.get(i)); 
	}
	
	@Test
	public void sortByLenRevTest() {
		List<String> strArr = Arrays.asList("Tommy", "Sammy", "Jo", "Taylor", "Su", "Karl");
		List<String> actArr = Arrays.asList("Taylor", "Tommy", "Sammy", "Karl", "Jo", "Su");
		strArr = LambdaArrayClass.sortByLenRev(strArr);
		for(int i = 0; i < strArr.size(); ++i)
			Assert.assertEquals(actArr.get(i), strArr.get(i)); 
	}
	
	@Test
	public void sortByFirstCharTest() {
		List<String> strArr = Arrays.asList("Tommy", "Sammy", "Jo", "Taylor", "Su", "Karl");
		List<String> actArr = Arrays.asList( "Jo", "Karl", "Sammy", "Su", "Tommy", "Taylor");
		strArr = LambdaArrayClass.sortByFirstChar(strArr);
		for(int i = 0; i < strArr.size(); ++i)
			Assert.assertEquals(actArr.get(i), strArr.get(i)); 
	}
	
	@Test
	public void sortByIsETest() {
		List<String> strArr = Arrays.asList("Tommy", "Sammy", "Jo", "Taylor", "Su", "Karl");
		List<String> actArr = Arrays.asList("Tommy", "Sammy", "Jo", "Taylor", "Su", "Karl");
		strArr = LambdaArrayClass.sortByIsE(strArr);
		for(int i = 0; i < strArr.size(); ++i)
			Assert.assertEquals(actArr.get(i), strArr.get(i)); 
	}
	
	@Test
	public void sortByIsEStaticTest() {
		List<String> strArr = Arrays.asList("Tommy", "Sammy", "Jo", "Taylor", "Su", "Karl");
		List<String> actArr = Arrays.asList("Tommy", "Sammy", "Jo", "Taylor", "Su", "Karl");
		strArr = LambdaArrayClass.sortByIsEStatic(strArr);
		for(int i = 0; i < strArr.size(); ++i)
			Assert.assertEquals(actArr.get(i), strArr.get(i)); 
	}

}
