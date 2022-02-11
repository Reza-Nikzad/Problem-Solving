package com.reza.leetCode;

public class MaximizeDistanceToClosestPearson {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] seats = {1,0,0,0,1}; 
		int[] seats = {1,0,1,1}; 
		S849 s849 = new S849(); 
		System.out.println(s849.maxDistToClosest(seats));  
	}

}
class S849 {
    public int maxDistToClosest(int[] seats) {
        int leftIndex = 0 ; 
        int diff = 0 ;  
        int leftMax = 0 ; 
        int rightMax = 0 ; 
        for( int i = 1; i <= seats.length ; i++ ){
            
            if(i == seats.length || seats[leftIndex] != seats[i]){
            	if(seats[leftIndex] == 0) {
            		int temp = i - leftIndex + 1; 
                    if(diff < (temp) ){
                    	if(leftIndex == 0) {
                    		diff = Math.max(diff,temp-1) ;
                    	}else if(i == seats.length) {
                    		diff = Math.max(diff,temp-1); 
                    	}
                    	else {
                    		if((temp) % 2 == 0) {
                    			diff = Math.max(diff, (temp)/2 ); 
                    		}else {
                    			diff = Math.max(diff, (temp)/2 ); 
                    		}
                    	}
                        
                    }
            	}
            	
                leftIndex = i; 
            }
        }
        
        return diff ; 
    }
}