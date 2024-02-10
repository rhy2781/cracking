package treesAndGraphs.java.utility;

import java.util.Arrays;
import static treesAndGraphs.java.utility.viewBinaryTree.paddingBaseCombo;

public class temp {
	public static void main(String[] args) {
		int n = 50;
		int[] init = new int[n];
		for (int i = 0; i < n; i++) {
			init[i] = i;
		}
		BinaryTreeNode root = BinaryTreeNode.createBinaryTreeNodeFromSortedArray(init);
		viewBinaryTree.printTree(root);

		int[][] combo = paddingBaseCombo(root);
		for(int[] c: combo){
			System.out.println(Arrays.toString(c));
		}
	}
}
