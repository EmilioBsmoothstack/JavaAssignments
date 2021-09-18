/**This class demonstrates a few simple algorithms
 * 
 */
package com.ss.func;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Emilio_Benavente
 *
 */
public class FunctionalDemos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> nums = Arrays.asList(2,4,4,8);
//		List<String> strList = Arrays.asList("xxax", "xbxbx", "xxcx");
		Boolean results = groupSumClump(nums, 14, 0, 1, 2);
		System.out.println(results);
//		List<String> results = noX(strList);
//		for(int i = 0; i <results.size();++i)
//			System.out.println(results.get(i));
	}
	
	public static List<Integer> rightDigi(List<Integer> nums){
		List<Integer> result = new ArrayList<>();
		for(int i = 0 ; i < nums.size();++i) {
			int currNum = nums.get(i);
			int tmp = currNum;
			while(tmp / 10 > 0) {
				tmp = tmp % 10;
				currNum = currNum % 10;
			}
			result.add(currNum);
		}
		return result;
	}
	
	public static List<Integer> doubling(List<Integer> nums){
		List<Integer> result = new ArrayList<>();
		for(int i = 0 ; i < nums.size();++i) {
			result.add(nums.get(i) * 2);
		}
		return result;
	}
	
	public static List<String >noX(List<String> strList){
		List<String> result = new ArrayList<>();
		for(int i = 0 ; i < strList.size();++i) {
			result.add(strList.get(i).replace("x", ""));
		}
		return result;
	}
	
	public static Boolean groupSumClump(List<Integer> nums, int target, int start, int mid, int end) {
		int sum = nums.get(start);
		
		for(int i = mid; i < end; ++i)
		{
			if(i > start && nums.get(i - 1) == nums.get(i))
				sum += nums.get(i);
			sum += nums.get(i);
			if(i + 1 < end && nums.get(i + 1) == nums.get(i))
				sum += nums.get(i);
		}
		if(sum == target) return true;
		
		if(end != nums.size() && groupSumClump(nums, target, start, mid, end + 1)) 
			return true;
			
		if(mid < end && groupSumClump(nums, target, start, mid + 1, end))
			return  true;
		if(start < nums.size() - 1 && groupSumClump(nums, target, start + 1, mid, end))
			return true;
		else return false;
		
	}

}
