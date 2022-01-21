package com.reza.leetCode;

import org.graalvm.compiler.nodes.IfNode;

public class SubtreeOfAnotherTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	class Solution {
	    
		public boolean isSubtree(TreeNode root, TreeNode subRoot) {
	    	StringBuilder stringBuilderR = new StringBuilder(); 
	    	StringBuilder stringBuilderSR = new StringBuilder();
	    	stringBuilderR = traverse(root, stringBuilderR); 
	    	stringBuilderSR = traverse(subRoot, stringBuilderSR); 
	    	return stringBuilderR.toString().contains(stringBuilderSR.toString()); 
	    }
	    
	    public StringBuilder traverse(TreeNode root, StringBuilder sb) {
			if(root != null) {
				return sb.append(traverse(root.left, sb)).append(traverse(root.right, sb));  
			}
	    	return sb.append("None"); 
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
