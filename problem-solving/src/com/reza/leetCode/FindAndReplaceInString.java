package com.reza.leetCode;

import java.util.HashMap;

public class FindAndReplaceInString {

	public static void main(String[] args) {
		// s= "abcd", indices = [0, 2], sources = ["ab","ec"], targets = ["eee","ffff"]
		// output = eeecd
		// "abcd" , [0, 2], ["a", "cd"],	["eee", "ffff"] -> Output: "eeebffff"
		S833 s833 = new S833(); 
		String s= "abcd"; 
		int[] indices = {0, 2};
		String[] sources = {"ab","ec"};
		String[] targets = {"eee","ffff"};
		System.out.println(s833.findReplaceString(s, indices, sources, targets)); 
	}

}
class S833 {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        
        StringBuilder sb = new StringBuilder(); 
        HashMap<Integer, Integer> map = new HashMap(); 
        for(int i = 0; i < indices.length; i++) {
        	if(s.substring(indices[i], indices[i] + sources[i].length()).
        			equals(sources[i])) {
        		map.put(indices[i], i); 
        	}
        }
        int sIndex = 0; 
        while(sIndex < s.length()) {
        	if (map.containsKey(sIndex)) {
        		sb.append(targets[map.get(sIndex)]) ; 
        		sIndex += sources[map.get(sIndex)].length(); 
        	}else {
        		sb.append(s.charAt(sIndex++)); 
        	}
        }
        
        return sb.toString(); 
        
    }
}