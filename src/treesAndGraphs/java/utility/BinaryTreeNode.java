package treesAndGraphs.java.utility;

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
	public static BinaryTreeNode createBinaryTreeNodeFromSortedArray(int[] source){
		return createBinaryTreeNodeFromSortedArray(source, 0, source.length - 1);
	}

	public static BinaryTreeNode createBinaryTreeNodeFromSortedArray(int[] source, int start, int end){
		if(end < start) return null;

		int mid = (start + end) / 2;
		BinaryTreeNode parent = new BinaryTreeNode(source[mid]);

		parent.left = createBinaryTreeNodeFromSortedArray(source, start, mid - 1);
		parent.right = createBinaryTreeNodeFromSortedArray(source, mid + 1, end);
		return parent;
	}
}
