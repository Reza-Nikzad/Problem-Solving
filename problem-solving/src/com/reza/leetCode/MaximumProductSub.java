package com.reza.leetCode;

public class MaximumProductSub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-2,0,-1};//{0,1,2,0,-1,0};//{3,0,1} ;//{3,0,1};//{2,3,-2,4};// 
		System.out.println(maxProduct(nums)); 
	}
	/*
	 * public static int maxProduct(int[] nums) { int left = 0; int right = 0; int
	 * result = nums[left]; while(left < nums.length) { while(left < nums.length &&
	 * nums[left] == 0 ) { result = Math.max(result, 0); left++; }
	 * 
	 * int prod = 1; right = left; while(right < nums.length && nums[right]!= 0) {
	 * prod *= nums[right]; result = Math.max(result, prod); right++; }
	 * 
	 * while(left < right-1) { prod /= nums[left]; result = Math.max(result, prod);
	 * left++; } left++; } return result; }
	 */
	public static int maxProduct(int[] nums) {
		int res = nums[0]; 
		int min = nums[0];
		int max = nums[0]; 
		for(int i = 1; i < nums.length ; i++) {
			if(nums[i] >= 0) {
				max = Math.max(nums[i], max*nums[i]); 
				min = Math.min(nums[i], min*nums[i]);
				
			}else {
				int temp = max ; 
				max = Math.max(nums[i], min * nums[i]); 
				min = Math.min(nums[i], temp * nums[i]); 
			}
			res = Math.max(max, res); 
		}
		return res; 
	}
}
