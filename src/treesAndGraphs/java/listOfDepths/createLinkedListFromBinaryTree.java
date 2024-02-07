package treesAndGraphs.java.listOfDepths;

import treesAndGraphs.java.BinaryTreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;

public class createLinkedListFromBinaryTree {
	public List<LinkedList<Integer>> createLinkedList(BinaryTreeNode root) {
		List<LinkedList<Integer>> res = new ArrayList<>();
		createLinkedList(root, res, 1);
		return res;
	}

	public void createLinkedList(BinaryTreeNode root, List<LinkedList<Integer>> res, int level) {
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
