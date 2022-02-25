package com.reza.leetCode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

import com.reza.leetCode.definition.TreeNode;

public class MaximumDepthOfBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(3, 
				new TreeNode(9), new TreeNode(20,
						new TreeNode(15), new TreeNode(7))); 
		
		
	}
	 public static int maxDepth(TreeNode root) {
		 if (root == null) return 0; 
		 int depth = 0; 
		 Deque<TreeNode> q = new ArrayDeque(); 
		 q.add(root); 
		 
		 while(!q.isEmpty()) {
			 int n = q.size(); 
			 for(int i = 0; i< n; i++) {
				 TreeNode node = q.poll(); 
				 if(node.left != null) {
					 q.add(node.left); 
				 }
				 if(node.right != null) {
					 q.add(node.right); 
				 }
			 }
			 depth++; 
		 }
		 
		 return depth; 
	 }
}
