package treesAndGraphs.java.listOfDepths;

import treesAndGraphs.java.BinaryTreeNode;
import treesAndGraphs.java.minimalTree.minimalHeight;

import java.util.LinkedList;
import java.util.List;

public class Solution {
	public static void main(String[] args){
		minimalHeight m = new minimalHeight();
		int[] source = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		BinaryTreeNode root = m.createBinaryTreeNodeFromSortedArray(source);

		createLinkedListFromBinaryTree temp = new createLinkedListFromBinaryTree();
		List<LinkedList<Integer>> res = temp.createLinkedList(root);

		BinaryTreeNode.printTreeLevel(root, 0);
		System.out.println();

		System.out.println(res);
	}
}
