package treesAndGraphs.java.checkBalanced;

import treesAndGraphs.java.BinaryTreeNode;
import treesAndGraphs.java.minimalTree.minimalHeight;


public class Solution {
	public static void main(String[] args){
		int[] source = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
		BinaryTreeNode root = new minimalHeight().createBinaryTreeNodeFromSortedArray(source);

		implementation i = new implementation();
		BinaryTreeNode.printTreeLevel(root, 0);
		System.out.println(implementation.checkBalanced(root));

	}
}


