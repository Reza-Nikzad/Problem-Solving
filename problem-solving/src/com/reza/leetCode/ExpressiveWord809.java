package com.reza.leetCode;


public class ExpressiveWord809 {

	public static void main(String[] args) {
		// s = "zzzzzyyyyy", words = ["zzyy","zy","zyy"] -> 3
		// s = "heeellooo", words = ["hello", "hi", "helo"] -> 1
		// s= "abcd", words = ["abc"] -> 0
		// s ="dddiiiinnssssssoooo", words=["dinnssoo","ddinso","ddiinnso","ddiinnssoo","ddiinso","dinsoo","ddiinsso","dinssoo","dinso"] -> 3
		S809 s = new S809(); 
		System.out.println(s.expressiveWords("dddiiiinnssssssoooo", new String[] {"dinnssoo","ddiinnso","ddiinnssoo"})); 
	}

}
class S809 {
    public int expressiveWords(String s, String[] words) {
        int count = 0; 
        
        for(String word : words) {
            if(isExpressive(s, word)) {
                count ++;
            }
        }
        
    	return count; 
    }

	private boolean isExpressive(String s, String w) {
		if( s.length() == 0 || w.length() == 0 || w.length() > s.length() ) {
            return false;
        }
		
		if(s.equals(w)) {
            return true;
        }
		int sIndex = 0; 
		int wIndex = 0; 
		while(sIndex < s.length() && wIndex < w.length()) {
			char sChar = s.charAt(sIndex); 
			char wChar = w.charAt(wIndex); 
			
			if(wChar != sChar) {
				return false; 
			}
			int wCount = 0; 
			while(wIndex < w.length() && w.charAt(wIndex)== wChar) {
				wIndex++ ;
				wCount++ ; 
			}
			int sCount= 0; 
			while(sIndex < s.length() && s.charAt(sIndex) == sChar) {
				sIndex++ ; 
				sCount++; 
			}
			
			if(wCount > sCount || (sCount > wCount  && sCount < 3)) {
                return false;
            }
		}
		
		return sIndex == s.length() && wIndex == w.length();
	}
}


