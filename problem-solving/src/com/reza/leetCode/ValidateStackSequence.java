package com.reza.leetCode;

import java.util.Stack;

public class ValidateStackSequence {

	public static void main(String[] args) {
		int[] pushed = {1,2,3,4,5}; 
		int[] popped = {4,5,3,2,1}; // -> false
//		int[] pushed = {2,1,0}; 
//		int[] popped = {1,2,0}; // -> true
		System.out.println(validateStackSequences(pushed, popped));

	}
	public static boolean validateStackSequences(int[] pushed, int[] popped) {
        int pushedIndx = 0; 
        int poppedIndx = 0; 
        Stack stack = new Stack(); 
        while(pushedIndx < pushed.length) {
        	stack.push(pushed[pushedIndx]); 
        	pushedIndx++; 
        	if(!stack.peek().equals(popped[poppedIndx])) {
        		continue; 
        	}

        	while (stack.size() > 0 && stack.peek().equals(popped[poppedIndx])) {
    			stack.pop(); 
    			poppedIndx++; 
    		}
        }
				
		return stack.size()==0 && poppedIndx == popped.length; 
    }
}
