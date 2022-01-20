package com.reza.leetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;

public class twoSum {
	public static void main(String args[]) {
		int[] nums = {2,7,11,15};
		int target = 9; 
		int[] res = twoSum(nums, target);
		System.out.println(res[0]+", "+ res[1]);
	}
	
	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer , Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < nums.length; i++) { 
			Integer temp = (Integer)(target - nums[i]); 
			if(map.containsKey(temp)) {
				int[] res = {map.get(temp),i}; 
				return res; 
			}
			map.put(nums[i],  i); 
		}
		return null; 
	}

}
