package com.reza.leetCode;


public class SubtreeOfAnotherTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	class Solution1 {
	    
		public boolean isSubtree(TreeNode root, TreeNode subRoot) {
	    	StringBuilder stringBuilder = new StringBuilder(); 
	    	preOrder(root, stringBuilder); 
	    	String stringRoot = stringBuilder.toString(); 
	    	stringBuilder = new StringBuilder(); 
	    	preOrder(subRoot, stringBuilder);
	    	String stringSubtree = stringBuilder.toString(); 
	    	return stringRoot.contains(stringSubtree);  
	    }
	    
	    public void preOrder(TreeNode root, StringBuilder sb) {
			if(root == null) {
				sb.append("null");
				return ; 
			}
			sb.append("#").append(root.val); 
			preOrder(root.left, sb); 
			preOrder(root.right, sb); 
		}
	    
	}
	
	class Solution2{
		// Recursive answer
		public boolean isSubtree(TreeNode root, TreeNode subtree) {
			if(root == null) {
				return subtree == null; 
			}
			
			return isSame(root, subtree) || 
					isSame(root.left, subtree) ||
					isSame(root.right, subtree);
			
		}
		private boolean isSame(TreeNode root, TreeNode subroot) {
			if(root == null && subroot == null) {
				return true; 
			}
			if(root == null || subroot == null) {
				return false; 
			}
			if(root.val != subroot.val) {
				return false; 
			}
			return isSame(root.left, subroot.right) && isSame(root.right, subroot.right); 
		}
		
	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode() {}
		TreeNode(int val) { 
			this.val = val; 
		}
		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}
}
