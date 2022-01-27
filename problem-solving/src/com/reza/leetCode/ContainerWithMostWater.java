package com.reza.leetCode;

public class ContainerWithMostWater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {1,3,2,5,25,24,5};//= 24 ,{1,8,6,2,5,4,8,3,7} = 49; 
		SolutionCWM solution = new SolutionCWM(); 
		System.out.println(solution.maxArea(height));  
	}

}
class SolutionCWM {
    public int maxArea(int[] height) {
    	int l = 0;
    	int r = height.length-1; 
    	int vol = Math.min(height[l], height[r]) * (r-l); 
    	
    	while (l < r ) {
    		vol = Math.max(Math.min(height[l],height[r])*(r-l), vol); 
    		if (height[l] > height[r]) {
    			r--; 
    		}else {
				l++; 
			}
    	}
        return vol; 
    }
}
