package com.reza.leetCode;

import java.util.HashMap;

public class LongestSubStringWRC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "pwwkew";//"bbbbb";//"abcabcbb";
		System.out.println(lengthOfLongestSubstring(input));

	}
	public static int lengthOfLongestSubstring(String s) {
		char[] chars = s.toCharArray();
		HashMap<Character, Integer> map = new HashMap<>(); 
		int start = 0;
		int end = 0; 
		int maxLen = 0; 
		while (end < s.length()) {
			if(map.containsKey(chars[end]) && map.get(chars[end]) >= start ) {
				maxLen = Math.max(end - start, maxLen); 
				start= map.get(chars[end]) + 1 ; 
			}
			map.put(chars[end],end); 
			end++; 
		}
		
		return Math.max(end - start, maxLen);
		
	}
}
