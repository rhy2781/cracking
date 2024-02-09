package treesAndGraphs.java.checkBalanced;

import treesAndGraphs.java.utility.BinaryTreeNode;
import treesAndGraphs.java.utility.viewBinaryTree;
import static java.lang.System.out;

public class Solution {
	public static void main(String[] args){
		int[] source = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		BinaryTreeNode root = BinaryTreeNode.createBinaryTreeNodeFromSortedArray(source);

		BinaryTreeNode root1 = new BinaryTreeNode(10);
		root1.right = new BinaryTreeNode(15);
		root1.left = new BinaryTreeNode(3);

		BinaryTreeNode left = root1.left;
		left.right = new BinaryTreeNode(4);
		left.right.right = new BinaryTreeNode(5);
		left.right.right.right = new BinaryTreeNode(9);

		viewBinaryTree.printTree(root);
		out.println(checkBalanced(root));
		out.println();

		viewBinaryTree.printTree(root1);
		out.println(checkBalanced(root1));
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


