/**This program will give the position of the max number in a 2D array
 * 
 */
package com.ss.two.pos;

/**
 * @author Emilio Benavente
 *
 */
public class LoocateMaxInArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Integer[][] nums = {{3,4,5,},{1,1,4},{6,4,3},{7,3,5}};
		Integer maxNum = 0;
		Integer posX = 0;
		Integer posY = 0;
		for(int i = 0; i < nums.length; ++i) {
			for(int j = 0; j < nums[0].length; ++j) {
				if(nums[i][j] > maxNum) {
					maxNum = nums[i][j];
					posX = j;
					posY = i;
				}
			}
		}
		System.out.println("The Max Number in the array is -> " + maxNum + " at nums[" + posY + "][" + posX + "]");
	}

}
