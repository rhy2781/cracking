package treesAndGraphs.java.minimalTree;

import treesAndGraphs.java.utility.BinaryTreeNode;

import static treesAndGraphs.java.utility.viewBinaryTree.printTree;
import static treesAndGraphs.java.utility.BinaryTreeNode.createBinaryTreeNodeFromSortedArray;

public class Solution {
	public static void main(String[] args){
		int[] source = new int[]{1, 5, 12, 39, 46, 47, 59, 60, 99};
		BinaryTreeNode root = createBinaryTreeNodeFromSortedArray(source);
		printTree(root);
	}
}