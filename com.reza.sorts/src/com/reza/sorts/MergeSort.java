package com.reza.sorts;

public class MergeSort {
	
	public void mergeSortDescending(int[] array, int start, int end) {
		if ((end - start) < 2) {
			return; 
		}
		
		int mid = (end + start) / 2 ; 
		mergeSortDescending(array, start, mid);
		mergeSortDescending(array, mid, end);
		merge(array, start, mid, end); 
		
	}

	private void merge(int[] array, int start, int mid, int end) {
		if(array[mid-1] > array[mid]) {
			return; 
		}
		
		int i = start;
		int j = mid; 
		int[] temp = new int[end - start]; 
		int index = 0; 
		
		while(i < mid && j < end) {
			temp[index++] = array[i]>=array[j] ? array[i++] : array[j++]; 
		}
		
		System.arraycopy(array, i , array, start+index, mid - i);
		System.arraycopy(temp, 0, array, start, index);
		
	}

}
