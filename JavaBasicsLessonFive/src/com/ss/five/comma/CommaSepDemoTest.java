/** This class will test all the functions of the CommaSepDemo class
 * 
 */
package com.ss.five.comma;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Emilio_Benavent
 *
 */
public class CommaSepDemoTest {

	
	@Test(expected = Test.None.class)
	public void mainTest() {
		CommaSepDemo.main(null);
	}
	
	@Test
	public void formatIntsTest() {
		List<Integer> intArr = Arrays.asList(2,-3,212,32,4,-2,1);
		CommaSepDemo.formatInts(intArr);
		List<Integer> actArr = Arrays.asList(2,-3,212,32,4,-2,1);
		for(int i = 0; i < intArr.size(); ++i)
			Assert.assertEquals(actArr.get(i), intArr.get(i)); 
	}
	
}
