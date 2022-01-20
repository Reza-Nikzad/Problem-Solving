package com.reza.hackerRank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MigratoryBirds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> lst = new ArrayList<>(); 
		lst = Arrays.asList(1,4,4,4,5,3); 
		// output: 4
		System.out.println(migratoryBirds(lst)); 
	}

	public static int migratoryBirds(List<Integer> arr) {
	    // Write your code here
		Iterator<Integer> iter = arr.iterator(); 
		int[] types = new int[5]; 
		Arrays.fill(types, 0);
		
		while(iter.hasNext()) {
			types[iter.next()-1]++; 
		}
		
		int maxType = 0; 
		int res = 0;  
		for(int i = 0; i< 5; i++ ) {
			if(types[i]> maxType) {
				maxType = types[i]; 
				res = i;  
			}
		}
		return res+1; 
	}
}
