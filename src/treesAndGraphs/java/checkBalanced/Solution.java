package treesAndGraphs.java.checkBalanced;

import treesAndGraphs.java.utility.BinaryTreeNode;
import static java.lang.System.out;

public class Solution {
	public static void main(String[] args){
		int[] source = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		BinaryTreeNode root = BinaryTreeNode.createBinaryTreeNodeFromSortedArray(source);

		BinaryTreeNode.printTreeLevel(root, 0);
	}

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


