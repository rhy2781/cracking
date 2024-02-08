package treesAndGraphs.java.utility;

import java.util.Arrays;

public class temp {
	public static void main(String[] args){
		int[] init = new int[200];
		for(int i = 0 ; i < 200 ; i++){
			init[i] = i;
		}


		BinaryTreeNode root = BinaryTreeNode.createBinaryTreeNodeFromSortedArray(init);
		int[][] combo = viewBinaryTree.paddingBaseCombo(root);
		viewBinaryTree.printCombination(combo);

//		BinaryTreeNode.printTreeLevel(root);
//		viewBinaryTree.fillTreeWithZeros(root);
//		viewBinaryTree.levelOrderTraversal(root, viewBinaryTree.height(root));
//		BinaryTreeNode.printTreeLevel(root);
//		viewBinaryTree.printCombination(combo);


		viewBinaryTree.printTree(root);
	}


}
