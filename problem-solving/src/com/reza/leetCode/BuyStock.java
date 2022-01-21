package com.reza.leetCode;

public class BuyStock {
	public static void main(String[] args) {
		int[]  prices = {7,6,4,3,1};// -> 0 //{7,1,5,3,6,4} -> 5;
		
		System.out.println(maxProfit(prices));
		
		
	}
    public static int maxProfit(int[] prices) {
    	int diff = 0; 
    	int lowestIndex = 0; 
    	
    	for (int i = 1; i < prices.length; i++) {
			if(( prices[i] - prices[lowestIndex])> diff) {
				diff = prices[i] - prices[lowestIndex]; 
			}
			if( prices[lowestIndex] > prices[i]) {
				lowestIndex = i; 
			}
		}
    	
    	return diff ; 
    }
}
