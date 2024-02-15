package treesAndGraphs.java.firstCommonAncestor;

import treesAndGraphs.java.utility.BinaryTreeNode;

import java.util.HashMap;
import java.util.Map;

import static java.lang.System.out;
import static treesAndGraphs.java.utility.BinaryTreeNode.createBinaryTreeNodeFromHashMap;
import static treesAndGraphs.java.utility.BinaryTreeNode.getNodeByValue;
import static treesAndGraphs.java.utility.viewBinaryTree.printTree;

public class Solution {

	public static int height(BinaryTreeNode root){
		if(root == null) return 0;
		return Math.max(height(root.left), height(root.right)) + 1;
	}
	public static BinaryTreeNode goUp(BinaryTreeNode root, int height){
		while(height > 0){
			root = root.parent;
			height -= 1;
		}
		return root;
	}

	public static BinaryTreeNode ancestor(BinaryTreeNode q, BinaryTreeNode p){
		if(p == q) return p;
		int qHeight = height(q), pHeight = height(p);
		BinaryTreeNode shorter = qHeight < pHeight ? q : p;
		BinaryTreeNode taller = qHeight < pHeight ? p : q;

		int delta = Math.abs(qHeight - pHeight);
		shorter = goUp(shorter, delta);

		while(taller != shorter){
			taller = taller.parent;
			shorter = shorter.parent;
		}
		return shorter;
	}


	public static void main(String[] args){
		Map<Integer, Integer[]> init = new HashMap<>(){{
			put(1, new Integer[]{-1, -1}); // Node 2
			put(2, new Integer[]{1, -1}); // Node 2
			put(3, new Integer[]{2, 4}); // Node 3
			put(4, new Integer[]{-1, -1}); // Node 3
			put(5, new Integer[]{3, 7}); // Node  5
			put(7, new Integer[]{-1, 9}); // Node 7
			put(9, new Integer[]{10, 13}); // Node 9
			put(10, new Integer[]{-1, -1}); // Node 10
			put(13, new Integer[]{-1, -1}); // Node 13
		}};
		BinaryTreeNode root = createBinaryTreeNodeFromHashMap(init, 5);
		out.println("Binary Tree Example");
		printTree(root);

		out.println("Finding ancestor of one and 9");
		BinaryTreeNode one = getNodeByValue(root, 1), nine = getNodeByValue(root, 9);

		printTree(ancestor(nine, one));
	}
}
