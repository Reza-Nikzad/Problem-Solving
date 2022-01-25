package com.reza.leetCode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set; 

public class ThreeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution solution= new Solution(); 
		int[] nums = {-1,0,1,2,-1,-4} ; // -> [[-1,-1,2],[-1,0,1]] //{3,0,-2,-1,1,2} ; // -> [[-2,-1,3],[-2,0,2],[-1,0,1]]
		List<List<Integer>> Lst = solution.threeSum(nums);
		for (List<Integer> list : Lst) {
			for (Integer i : list) {
				System.out.print(i+",");
			}
			System.out.println("/");
		}
	
	}
}

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
    	List<Integer> negatives = new ArrayList<>(); 
        List<Integer> positives = new ArrayList<>(); 
        List<Integer> zeroes = new ArrayList<>(); 
        Set<List<Integer>> res = new HashSet(); 
        		
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(); 
        
        for( int i = 0; i < nums.length ; i++ ){
            
            if(map.containsKey(nums[i])){
               map.put(nums[i], map.get(nums[i]) + 1); 
            }else{
                map.put(nums[i], 1); 
            }
            
            if(nums[i] < 0){
                negatives.add(nums[i]); 
            }
            else if( nums[i] > 0){
                positives.add(nums[i]); 
            }
            else{
                zeroes.add(nums[i]); 
            }
        }
        
        if(zeroes.size() > 2){
            res.add(Arrays.asList(0, 0, 0)); 
        }
        
        for(int a : positives){
            for(int b : negatives){
                int c = -(a + b); 
                
                if (map.containsKey(c) && map.get(c) > 0 && ((c != a && c != b) || map.get(c) > 1 )){
                    Integer[] temp = new Integer[] {a,b,c}; 
                    Arrays.sort(temp);
                    res.add(Arrays.asList(temp)); 
                }
            }
        }
        
        return new ArrayList<List<Integer>>(res); 
    
    }
}