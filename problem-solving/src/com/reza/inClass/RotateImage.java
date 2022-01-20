package com.reza.inClass;

import java.util.Arrays;

public class RotateImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] image = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}}; 
		rotateCWImage(image); 
		printMatrix(image);
	}
	private static void rotateCWImage(int[][] image) {
		int temp;
		
		int left = 0 ; 
		int right = image.length - 1; 
		int top = 0; 
		int down = image.length - 1 ;
		
		while(left < right) {
			for(int i = 0; i < (right-left); i++){
				temp = image[top + i][left];
				image[top + i][left] = image[down][left + i];
				image[down][left + i] = image[down - i][right];
				image[down - i][right] = image[top][right - i];
				image[top][right - i] = temp ;
			}
			
			top++; right--; down--; left++; 
		}
		
		
	}
	public static void printMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			System.out.print("|");
			for (int j = 0; j < matrix[0].length; j++) {
				System.out.print(matrix[i][j]+"|");
			}
			System.out.println();
		}
	}

}
