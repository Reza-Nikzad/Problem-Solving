package com.reza.leetCode;

import java.util.*;

public class CombinationSumIII {

	public static void main(String[] args) {
		 int k = 3; 
		 int n = 7; 
		 List<List<Integer>> lst = combinationSum3(k, n);
		 StringBuilder sb = new StringBuilder(); 
		 sb.append("["); 
		 for(List<Integer> l : lst) {
			 sb.append("["); 
			 for(int i= 0; i < l.size(); i++) {
				 sb.append(l.get(i));
				 sb.append(","); 
			 }
			 sb.deleteCharAt(sb.length()-1); 
			 sb.append("]");
		 }
		 sb.append("]");
		 System.out.println(sb.toString());

	}
	
	public static List<List<Integer>> combinationSum3(int k, int n) {
		List<List<Integer>> combination = new ArrayList();
		Integer[] sample = new Integer[k]; 
		backtracking(1 , 0, n, 0 , sample,combination); 
		return combination; 
    }

	private static void backtracking(int start,int index, 
			int n, int sum, Integer[] sample,
			 List<List<Integer>> combination) { 
		
		if(sum > n || index > 9) {
			return; 
		}
		
		if(sum == n && index == sample.length ) {
			List<Integer> newPerm = new ArrayList<Integer>(); 
			newPerm.addAll(Arrays.asList(sample)); 
			combination.add(newPerm);
			return; 
		}
		if(index >= sample.length) {
			return; 
		}
		
		for(int i = start; i <= 9; i++) {
			sample[index] = i; 
			backtracking(i + 1, index+1, n, sum+i, sample, combination);
		}
		
	}
	

}
