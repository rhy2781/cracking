package treesAndGraphs.java.utility;

import java.util.Arrays;

public class temp {
	public static void main(String[] args){
		int n = 28;
		int[] init = new int[n];
		for(int i = 0 ; i < n; i++){
			init[i] = i;
		}
		BinaryTreeNode root = BinaryTreeNode.createBinaryTreeNodeFromSortedArray(init);
		viewBinaryTree.printTree(root);
	}
}
