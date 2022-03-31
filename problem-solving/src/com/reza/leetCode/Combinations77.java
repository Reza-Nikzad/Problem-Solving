package com.reza.leetCode;

import java.util.ArrayList;
import java.util.List;

public class Combinations77 {

	public static void main(String[] args) {
		int n = 4; 
		int k = 2; 
		
		List<List<Integer>> comb = combine(n,k);
		StringBuilder sb = new StringBuilder(); 
		for (List<Integer> list : comb) {
			sb.append("[");
			for (Integer num : list) {
				sb.append(num); 
				sb.append(",");
			}
			sb.append("]");
			sb.append(",");
		}
		System.out.println(sb.toString());
	}
	
	public static List<List<Integer>> combine(int n, int k) {
		List<List<Integer>> answ = new ArrayList(); 
		List<Integer> sample = new ArrayList(); 
		recursiveCombine2( n, k,1, sample , answ );
		return answ; 
    }
	
	public static void recursiveCombine(int n, int k, List<Integer> sample , List<List<Integer>> answ ){
		if(n < 0 || k < 0) {
			return; 
		}
		if(k == 0) {
			answ.add(sample); 
			return;
		}
		recursiveCombine(n-1, k, sample, answ);
		List<Integer> sample2 = new ArrayList<>();
		sample2.addAll(sample); 
		sample2.add(n); 
		recursiveCombine(n-1, k-1, sample2 , answ);
	}

	public static void recursiveCombine2(int n, int k, int last, List<Integer> sample , List<List<Integer>> answ ){
		if( sample.size()>k ) {
			return; 
		}
		if(k == sample.size()) {
			answ.add((List<Integer>) ((ArrayList) sample).clone()); 
			return;
		}
		for(int i = last; i<= n ; i++) {
			sample.add(i);
			recursiveCombine2(n,k,i+1,sample,answ);
			sample.remove(sample.size()-1); 
		}
	}
}
