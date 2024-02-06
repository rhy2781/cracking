package treesAndGraphs.java.minimalTree;

import treesAndGraphs.java.BinaryTreeNode;

public class Solution {
	public static void main(String[] args){
		int[] source = new int[]{1, 5, 12, 39, 46, 47, 59, 60, 100};
		minimalHeight m = new minimalHeight();
		BinaryTreeNode root = m.createBinaryTreeNodeFromSortedArray(source);

		BinaryTreeNode.printTreeLevel(root, 0);

	}



}
