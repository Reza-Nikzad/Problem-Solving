package com.reza.sorts;

public class QuickSort {
	public void quickSort(int[] array, int start, int end) {
		if ((end - start) < 2) {
			return; 
		}
		
		int pivotIndex = partition(array, start, end); 
		quickSort(array, start, pivotIndex);
		quickSort(array, pivotIndex+1, end);
	}

	private int partition(int[] array, int start, int end) {
		int pivot = array[start]; 
		int i = start; 
		int j = end ; 
		
		while ( i < j) {
			
			while (i < j && pivot <= array[--j]); 
			if (i < j) {
				array[i] = array[j];  
			}
			
			while (i < j && pivot >= array[++i]); 
			if( i < j ) {
				array[j] = array[i];
			}
			
		}
		array[j] = pivot; 
		return j;
	}
	
	

}
