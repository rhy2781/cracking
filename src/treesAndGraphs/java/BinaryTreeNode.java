package treesAndGraphs.java;

public class BinaryTreeNode {
	public int value;
	public BinaryTreeNode left;
	public BinaryTreeNode right;

	public BinaryTreeNode(int value){
		this.value = value;
		this.left = null;
		this.right = null;
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
