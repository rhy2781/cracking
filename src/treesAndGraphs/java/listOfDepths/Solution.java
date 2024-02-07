package treesAndGraphs.java.listOfDepths;

import treesAndGraphs.java.utility.BinaryTreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import static java.lang.System.out;

public class Solution {
	public static void main(String[] args){
		int[] source = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
		BinaryTreeNode root = BinaryTreeNode.createBinaryTreeNodeFromSortedArray(source);
		List<LinkedList<Integer>> res = createLinkedList(root);

		BinaryTreeNode.printTreeLevel(root, 0);
		out.println();
		out.println(res);
	}

	public static List<LinkedList<Integer>> createLinkedList(BinaryTreeNode root) {
		List<LinkedList<Integer>> res = new ArrayList<>();
		createLinkedList(root, res, 1);
		return res;
	}

	public static void createLinkedList(BinaryTreeNode root, List<LinkedList<Integer>> res, int level) {
		if (res.size() < level) {
			res.add(new LinkedList<>());
		}

		LinkedList<Integer> temp = res.get(level - 1);
		if (root.left != null) {
			createLinkedList(root.left, res, level + 1);
		}
		temp.add(root.value);
		if (root.right != null) {
			createLinkedList(root.right, res, level + 1);
		}
	}
}
