package com.reza.leetCode;

public class JumpGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[] = {3,2,1,0,4}; //-> false ; {2, 3 ,1 , 1, 4} -> true ;
		System.out.println(canJump(nums));
	}

	private static boolean canJump(int[] nums) {
		int currPointer = nums[0]; 
		
		for (int i = 0; i < nums.length; i++) {
			if (currPointer >= nums.length-1) {
				return true; 
			}
			if (currPointer < i) {
				return false; 
			}
			currPointer = Math.max(currPointer, nums[i] + i);
		}

		return false;
	}

}
