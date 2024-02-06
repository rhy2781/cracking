package treesAndGraphs.java.minimalTree;

import treesAndGraphs.java.BinaryTreeNode;

public class Solution {
	public static void main(String[] args){
		int[] source = new int[]{1, 5, 12, 39, 46, 47, 59, 60, 100};
		minimalHeight m = new minimalHeight();
		BinaryTreeNode root = m.createBinaryTreeNodeFromSortedArray(source);

		printTreeLevel(root, 0);

	}

	public static void printTreeLevel(BinaryTreeNode root, int level) {
		if (root != null) {
			// Traverse the left subtree with an incremented level
			printTreeLevel(root.left, level + 1);

			// Print the current node's value with proper indentation
			for (int i = 0; i < level; i++) {
				System.out.print("\t");
			}
			System.out.println(root.value); // Use println to move to the next line after printing the value

			// Traverse the right subtree with an incremented level
			printTreeLevel(root.right, level + 1);
		}
	}

}
