package com.reza.leetCode;

import java.util.Arrays;
import java.util.Iterator;

public class MaximumPointsYouCanObtainFromCards {

	public static void main(String[] args) {
		int[] cardPoints = {2,2,2};// {9,7,7,9,7,7,9};// {1,2,3,4,5,6,1}; 
		int k = 2;//7;//3; output : // 4 // 55// 12
		System.out.println(maxScore(cardPoints, k)); 
	}
	public static int maxScoreRecurssive(int[] cardPoints, int k) {
        if(k <= 0){ 
            return 0; 
        }
        return Math.max(cardPoints[0]+maxScoreRecurssive(Arrays.copyOfRange(cardPoints, 1, cardPoints.length),k-1),
        		cardPoints[cardPoints.length-1]+maxScoreRecurssive(Arrays.copyOfRange(cardPoints, 0, cardPoints.length-1),k-1));
    }
	
	public static int maxScore(int[] cardPoints, int k) {
		int max = 0; 
		for(int i = 0 ; i < k ; i++) {
			max += cardPoints[i]; 
		}
		int left = k-1;  
		int temp = max; 
		int right = cardPoints.length-1; 
		for(int i = 0; i< k; i++) {
			temp = temp - cardPoints[left--] + cardPoints[right--]; 
			max = Math.max(temp, max); 
		}
		return max; 
	
	}
}
