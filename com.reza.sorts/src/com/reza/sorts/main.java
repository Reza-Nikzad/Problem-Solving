package com.reza.sorts;

import java.security.PublicKey;

public class main {

	public static void main(String[] args) {

		int[] array = { 5, 6, 10, 0, 2, 7, 9, 20, 8, -1 };
		/*
		 * array = bubleSort(array); printArray(array); array = reverse(array);
		 * printArray(array);
		 */
		/*
		 * array = insertionSort(array); printArray(array);
		 */
		
		/*array = selectionSort(array); 
		printArray(array); */
		
		/*
		 * array = shellSort(array); 
		 * printArray(array);
		 */ 
		/*
		 * Merge merge = new Merge(); merge.partition(array, 0, array.length) ;
		 */
//		mergeSort(array, 0, array.length);
//		QuickSort quick = new QuickSort();
//		quick.quickSort(array, 0, array.length); 
		
//		quickSort(array, 0, array.length); 
		
		MergeSort merge = new MergeSort(); 
		merge.mergeSortDescending(array, 0, array.length); 
		printArray(array); 
		
	}

	/**
	 * 
	 * @param array
	 */
	public static void printArray(int[] array) {
		for (int i : array) {
			System.out.print(i);
			System.out.print(",");
		}
		System.out.println();
	}

	public static int[] bubleSort(int[] array) {
		int temp = 0;
		for (int i = array.length; i > 0; i--) {
			for (int j = 1; j < i; j++) {
				if (array[j - 1] > array[j]) {
					temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}
		return array;
	}

	public static int[] reverse(int[] array) {
		int left = 0;
		int right = array.length - 1;
		int temp = 0;

		while (left < right) {
			temp = array[left];
			array[left] = array[right];
			array[right] = temp;
			right--;
			left++;
		}
		return array;
	}
	
	public static int[] insertionSort(int[] array){
		int temp = 0; 
		for (int i = 1 ; i < array.length; i++ ) {
			for (int j = i; j > 0 && array[j] < array[j-1]; j-- ) {
				temp = array[j-1]; 
				array[j-1] = array[j]; 
				array[j] = temp; 
			}
		}
		return array; 
	}
	 
	public static int[] selectionSort(int[] array) {
		for (int i = array.length-1; i >= 0; i--) {
			int index = 0; 
			
			for (int j = 1; j <= i; j++) {
				if (array[index] < array[j]) {
					index = j ; 
				}
			}
			
			int temp = array[index];
			array[index] = array[i]; 
			array[i] = temp; 
		}
		return array; 
	}
	 
	public static int[] shellSort(int[] array) {
		int index = 0; 
		int temp = 0; 
		for (int gap = array.length/2 ; gap > 0 ; gap/=2 ) { 
			
			for( int j = gap ; j < (array.length); j++) {
				index = j; 
				temp = array[index]; 
				
				while (index >= gap && temp < array[index - gap]) {
					array[index] = array[index - gap]; 
					index -= gap; 
				}
				array[index] = temp; 
			}
		}
		
		return array; 
	}
	
	
	public static void mergeSort(int[] array, int start, int end) {
		if ((end - start) < 2) {
			return; 
		}
		
		int mid = (start + end) / 2 ; 
		
		mergeSort(array, start, mid);
		mergeSort(array, mid, end);
		merge(array, start, mid, end); 
	}

	private static void merge(int[] array, int start, int mid, int end) {
		if (array[mid-1] <= array[mid]) {
			return ; 
		}
		
		int i = start ;
		int j = mid ; 
		int index = 0;
		int[] temp = new int[end-start]; 
		
		while (i < mid && j < end) {
			temp[index++] = array[i] <= array[j] ? array[i++] : array[j++]; 
		}
		
		System.arraycopy(array, i, array, start + index, mid - i);
		System.arraycopy(temp, 0, array, start, index);
	}
	
	/**
	 * 
	 * @param array
	 * @param start
	 * @param end
	 */
	public static void quickSort(int[] array, int start, int end) {
		if ((end - start)  < 2) {
			return; 
		}
		
		int index = partition(array, start, end); 
		quickSort(array, start, index);
		quickSort(array, index+1, end);
	}

	/**
	 * 
	 * @param array
	 * @param start
	 * @param end
	 * @return
	 */
	private static int partition(int[] array, int start, int end) {
		int pivot = array[start]; 
		int i = start;
		int j = end; 
		
		while(i < j) {
			while (i < j && pivot <= array[--j]); 
			if (i < j) {
				array[i] = array[j]; 
			}
			
			while(i < j  && pivot >= array[++i]); 
			if (i < j) {
				array[j] = array[i] ; 
			}
			
		}
		
		array[j] = pivot; 	
		return j;
	}
}












