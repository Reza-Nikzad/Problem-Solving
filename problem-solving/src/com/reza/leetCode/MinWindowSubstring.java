package com.reza.leetCode;

import java.util.HashMap;

public class MinWindowSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ADOBECODEBANC"; 
		String t = "ABC"; 
		SolutionMinWinSub solutionMinWinSub = new SolutionMinWinSub();
		System.out.println(solutionMinWinSub.minWindow(s, t));
		
	}

}
class SolutionMinWinSub {
    public String minWindow(String s, String t) {
    	if(s == null || t == null || t.isEmpty() || s.isEmpty()) return ""; 
    	
    	HashMap<Character, Integer> map = new HashMap<>(); 
        for(int i = 0 ; i < t.length() ; i++ ) {
        	char c = t.charAt(i); 
        	map.put(c , map.getOrDefault(c,0) + 1); 
        }
        int i = 0 ; int j = 0; int count = map.size(); 
        int left = 0;
        int right = s.length() - 1 ;
        int min = s.length();   

        boolean found = false; 
        
        
        while ( j < s.length() ) {
        	char endChar = s.charAt(j++); 
        	if(map.containsKey(endChar)) {
        		map.put(endChar, map.get(endChar) - 1); 
        		if(map.get(endChar) == 0 ) count -= 1; 
        	}
        	
        	if(count > 0) continue;
        	
        	while(count == 0) {
        		char startChar = s.charAt(i++); 
        		if (map.containsKey(startChar)){
        			map.put(startChar, map.get(startChar) + 1); 
        			if(map.get(startChar) > 0) {
        				count += 1; 
        			}
        		}
        	}
        	
        	if(j - i > min ) {
        		left = i;
        		right = j; 
        		min = j-i ; 
        		
        		found = true; 
        				
        	}
        }
        
        return  !found ? "" : s.substring(left-1, right); 		
    }
}