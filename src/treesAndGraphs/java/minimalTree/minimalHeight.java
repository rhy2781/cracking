package treesAndGraphs.java.minimalTree;

import treesAndGraphs.java.BinaryTreeNode;

public class minimalHeight {

	public BinaryTreeNode createBinaryTreeNodeFromSortedArray(int[] source){
		return createBinaryTreeNodeFromSortedArray(source, 0, source.length - 1);
	}

	public BinaryTreeNode createBinaryTreeNodeFromSortedArray(int[] source, int start, int end){
		if(end < start) return null;

		int mid = (start + end) / 2;
		BinaryTreeNode parent = new BinaryTreeNode(source[mid]);

		parent.left = createBinaryTreeNodeFromSortedArray(source, start, mid - 1);
		parent.right = createBinaryTreeNodeFromSortedArray(source, mid + 1, end);
		return parent;
	}
}
