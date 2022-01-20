package com.reza.hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class DividableSum {

	public static void main(String[] args) {
		List<Integer> ar = new ArrayList<>(); 
		ar.addAll(Arrays.asList(1,3,2,6,1,2)); 
		
		int n = 6; 
		int k = 3; 
		
		System.out.println(divisibleSumPairs(n, k, ar));
		
		// output is 5 : (1,2), (1,2), (3,6), (2,1), (1,2) 
	}
	
	public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
	    // Write your code here

		Iterator<Integer> iterator = ar.iterator(); 
		int ans[] = new int[k]; 
		int count = 0;
		
		while(iterator.hasNext()) {
			int num = iterator.next() % k;
			int complement = num == 0 ? k : num; 
			count += ans[k - complement]; 
			ans[num] += 1; 
		}
		return count; 
		}
}
