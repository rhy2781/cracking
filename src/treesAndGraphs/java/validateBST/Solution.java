package treesAndGraphs.java.validateBST;

import treesAndGraphs.java.utility.BinaryTreeNode;
import static treesAndGraphs.java.utility.BinaryTreeNode.createBinaryTreeNodeFromSortedArray;
import static treesAndGraphs.java.utility.viewBinaryTree.printTree;
import static java.lang.System.out;

public class Solution {
	public static void main(String[] args){
		int[] init = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		BinaryTreeNode root = createBinaryTreeNodeFromSortedArray(init);
		printTree(root);
		out.println(validate(root));
		out.println();

		BinaryTreeNode override = root.right;
		override.value = 99;
		printTree(root);
		out.println(validate(root));
	}

	public static boolean validate(BinaryTreeNode root){
		return validate(root, null, null);
	}
	public static boolean validate(BinaryTreeNode root, Integer min, Integer max){
		if(root == null) return true;
		if((min != null && root.value < min) || (max != null) && root.value > max) return false;
		return validate(root.left, min, root.value) && validate(root.right, root.value, max);
	}
}
