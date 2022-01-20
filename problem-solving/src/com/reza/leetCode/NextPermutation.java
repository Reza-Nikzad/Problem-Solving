package com.reza.leetCode;

public class NextPermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5,1,1};
		//{1,3,2}
		//{3,2,1} -> {1,2,3}
		nextPermutation(nums); 
		for (int i : nums) {
			System.out.print(i+",");
		}
		
	}
	
	public static void nextPermutation(int[] nums) {
        int left = nums.length-1;
        
        while (left > 0 && nums[left - 1 ] >= nums[left] ) {
        	left--; 
        }
		
        if (left == 0) {
        	flip(nums, 0 , nums.length - 1);
        }else{
        	
        	int right = left; 
        	left--; 
        	
        	while (right < nums.length && nums[left] < nums[right]) {
            	right++;  
            }
        	right--; 
        	
        	int temp = nums[left]; 
        	nums[left] = nums[right];
        	nums[right] = temp; 
        	
        	flip(nums, left + 1, nums.length - 1);
        }
        
    }
	
	public static void flip(int[] nums, int left, int right) {
		int temp; 
		while (left < right) {
        	temp = nums[left]; 
        	nums[left] = nums[right];
        	nums[right] = temp; 
        	left++; right--;
        }
	}

}
