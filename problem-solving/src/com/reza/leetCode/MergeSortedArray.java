package com.reza.leetCode;

public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		/**
		[1,0]
		1
		[2]
		1
		output : [1,2]
		**/
		int[] nums1 = {1,2,3,0,0,0};//{0}; 
		int m = 3 ; //0 ; 
		int[] nums2 = {2,5,6}; //{1};
		int n = 3; //1; output = {1}
		MSASolution solution = new MSASolution(); 
		int[] res = solution.merge(nums1, m, nums2, n); 
		for (int i : res) {
			System.out.println(i);
		}
	}

}
class MSASolution {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        if(m == 0 || nums1[m-1] <= nums2[0]){
        	System.arraycopy(nums2, 0, nums1,m,n);
        }
        else{
        	while(m > 0 && n > 0) {
            	nums1[m+n-1] = (nums1[m-1] >= nums2[n-1]) ? nums1[--m] : nums2[--n] ; 
            }
            if(n > 0) {
            	for(int i = 0 ; i < n ; i++) {
            		nums1[i] = nums2[i]; 
            	}
            }
        }
        return nums1 ; 
        
    }
}