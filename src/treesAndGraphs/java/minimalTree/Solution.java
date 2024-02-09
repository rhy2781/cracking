package treesAndGraphs.java.minimalTree;

import treesAndGraphs.java.utility.BinaryTreeNode;
import treesAndGraphs.java.utility.viewBinaryTree;

public class Solution {
	public static void main(String[] args){
		int[] source = new int[]{1, 5, 12, 39, 46, 47, 59, 60, 100};
		BinaryTreeNode root = BinaryTreeNode.createBinaryTreeNodeFromSortedArray(source);
		viewBinaryTree.printTree(root);
	}

}