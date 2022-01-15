package com.reza.sorts;

public class Merge {
	
	
	public void partition(int[] array, int start, int end) {
		if ((end - start) < 2 ) {
			return ; 
		}
		
		int mid = (end + start)/2; 
		partition(array, start, mid); // left partition 
		partition(array, mid, end); // right partition
		merge(array, start, mid, end); 
	}
	
	public void merge(int[] array, int start, int mid, int end) {
		if (array[mid-1] <= array[mid]) { // 
			return; 
		}
		
		int i = start ;
		int j =  mid ;
		int tempindex = 0; 
		int [] temp = new int[end - start]; 

		while (i < mid && j < end) {
			temp[tempindex++] = array[i] <= array[j] ? array[i++] : array[j++]; 
		}
		
		// if i<mid satisfies: means we are done with indexes bigger than j
		// However, if j<end satisfies, then elements from i to mid should be added to the end
		// as follows: 
		System.arraycopy(array, i, array, start + tempindex, mid - i);
		System.arraycopy(temp, 0, array, start, tempindex);
			
	}
}
