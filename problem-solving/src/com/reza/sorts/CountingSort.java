package com.reza.sorts;

/***
 * 
 * @author reza
 * Time: O(n)
 * For Positive numbers and for values in certain range of numbers
 */
public class CountingSort {
	public void countringSort(int[] array, int min, int max) {
		int[] counter = new int[max - min + 1]; 
		
		for (int i = 0; i < array.length; i++) {
			counter[array[i] - min]++; 
		}
		
		int  j = 0; 
		
		for (int i = min; i <= max ; i++) {
			while (counter[i-min]>0) {
				array[j++] = i; 
				counter[i - min]--;
			}	
		}
	}

}
