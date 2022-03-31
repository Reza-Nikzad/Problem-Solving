package com.reza.leetCode;

import java.util.*;


public class LetterCombinationsPhoneNumbers17 {

	public static void main(String[] args) {
		String digits = "23";
		List<String> comb ; 
		comb = letterCombinations(digits); 
		for(String s: comb) {
			System.out.println(s);
		}

	}
	
    
    public static List<String> letterCombinations(String digits) {
    	
    	HashMap<Character, String> map = new HashMap(); 
	    map.put('2',"abc"); 
	    map.put('3',"def"); 
	    map.put('4',"ghi"); 
	    map.put('5',"jkl"); 
	    map.put('6',"mno"); 
	    map.put('7',"pqrs"); 
	    map.put('8',"tuv");
	    map.put('9',"wxyz");
	    List<String> comb = new ArrayList();
	    char[] possible = new char[digits.length()];
	    getPermutations(comb,possible, map, digits.toCharArray(), 0);
	    return comb; 
    }


	private static void getPermutations(
			List<String> comb, 
			char[] possible , 
			HashMap<Character,String> map,
			char[] digitsChar, 
			int index) {
		
		if(digitsChar.length == index) {
			comb.add(String.valueOf(possible)); 
			return; 
		}
		for(char c : map.get(digitsChar[index]).toCharArray()) {
			possible[index] = c; 
			getPermutations(comb, possible, map, digitsChar, index+1);
		}
		
	}
    
    
}
