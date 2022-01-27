package com.reza.leetCode;

import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] digits = {1,2,3}; 
//		int[] digits = {9}; 
//		int[] digits = {9,9,9}; 
		PlusOneSolution solution = new PlusOneSolution(); 
		digits = solution.plusOne(digits);
		for (int i : digits) {
			System.out.print(i+",");
		}
	}

}

class PlusOneSolution {
    public int[] plusOne(int[] digits) {
    	int index = digits.length -1; 
    	while(index > 0 && digits[index] == 9) {
    		digits[index--] = 0; 
    	}
    	if(index == 0 && digits[index] == 9) {
    		digits = Arrays.copyOf(digits, digits.length + 1);
    		digits[0] = 1; 
    		digits[digits.length - 1] = 0; 
    	}else {
    		digits[index]++; 
    	}
    	return digits; 
    }
}
