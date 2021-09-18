/**This will test all the functions in the FunctionalDemos class
 * 
 */
package com.ss.func;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;


/**
 * @author Emilio_Benavente
 *
 */
public class FunctionalTest {

	@Test(expected = Test.None.class)
	public void mainTest() {
		FunctionalDemos.main(null);
	}
	
	@Test
	public void rightDigiTest() {
		List<Integer> nums = Arrays.asList(0,25,44,366,2332,15);
		List<Integer> actArr = Arrays.asList(0,5,4,6,2,5);
		nums = FunctionalDemos.rightDigi(nums);
		for(int i = 0; i < nums.size(); ++i)
			Assert.assertEquals(nums.get(i), actArr.get(i));
	}
	
	@Test
	public void doublingTest() {
		List<Integer> nums = Arrays.asList(0,25,44,366,2332,15);
		List<Integer> actArr = Arrays.asList(0,50,88,732,4664,30);
		nums = FunctionalDemos.doubling(nums);
		for(int i = 0; i < nums.size(); ++i)
			Assert.assertEquals(nums.get(i), actArr.get(i));
	}
	
	@Test
	public void xOrTest() {
		List<String> strList = Arrays.asList("xxax", "xbxbx", "xxcx");
		List<String> actArr = Arrays.asList("a","bb","c");
		actArr = FunctionalDemos.noX(actArr);
		for(int i = 0; i < actArr.size(); ++i)
			Assert.assertEquals(actArr.get(i), actArr.get(i));
	}
	
	@Test
	public void groupSumClumpTestA() {
		List<Integer> nums = Arrays.asList(2,4,8);
		Boolean isSumToTarget = FunctionalDemos.groupSumClump(nums, 10,0,1,2);
		Assert.assertEquals(isSumToTarget, true);
	}
	
	@Test
	public void groupSumClumpTestB() {
		List<Integer> nums = Arrays.asList(1,2,4,8,1);
		Boolean isSumToTarget = FunctionalDemos.groupSumClump(nums, 14,0,1,2);
		Assert.assertEquals(isSumToTarget, true);
	}
	
	@Test
	public void groupSumClumpTestC() {
		List<Integer> nums = Arrays.asList(2,4,4,8);
		Boolean isSumToTarget = FunctionalDemos.groupSumClump(nums, 14,0,1,2);
		Assert.assertEquals(isSumToTarget, false);
	}


}
