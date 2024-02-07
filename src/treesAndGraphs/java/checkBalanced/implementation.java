package treesAndGraphs.java.checkBalanced;

import treesAndGraphs.java.BinaryTreeNode;

public class implementation {
	public static boolean checkBalanced(BinaryTreeNode root){
		if(root == null) return true;
		int diff = Math.abs(height(root.left) - height(root.right));
		if(diff > 1){
			return false;
		}
		else{
			return checkBalanced(root.left) && checkBalanced(root.right);
		}
	}
	public static int height(BinaryTreeNode root){
		if(root == null) return -1;
		return Math.max(height(root.left), height(root.right)) + 1;
	}
}
