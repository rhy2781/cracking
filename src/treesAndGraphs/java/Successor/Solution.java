package treesAndGraphs.java.Successor;

import treesAndGraphs.java.utility.BinaryTreeNode;
import static treesAndGraphs.java.utility.BinaryTreeNode.createBinaryTreeNodeFromHashMap;
import static treesAndGraphs.java.utility.BinaryTreeNode.getNodeByValue;
import static treesAndGraphs.java.utility.viewBinaryTree.printTree;

import static java.lang.System.out;

import java.util.HashMap;
import java.util.Map;

public class Solution {
	/**
	 * If we have a node on the right, then we want the left most of that child
	 * having a right node means that we are in a middle node
	 * 			[X]
	 * 		   /  \
	 * 		 [Y]  [Z]
	 */
	public static BinaryTreeNode successor(BinaryTreeNode root){
		if(root == null) return null;

		// we have a node on the right
		if(root.right != null){
			return leftMostNode(root.right);
		}

		else{
			BinaryTreeNode curr = root;
			BinaryTreeNode parent = root.parent;
			while( parent != null && parent.left != curr){
				curr = curr.parent;
				parent = parent.parent;
			}
			return parent;
		}
	}
	public static BinaryTreeNode leftMostNode(BinaryTreeNode root){
		if(root == null) return null;
		while(root.left != null){
			root = root.left;
		}
		return root;
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

		BinaryTreeNode three = getNodeByValue(root, 3),
				one = getNodeByValue(root, 1),
				four = getNodeByValue(root, 4);

		out.println("Successor of 3 in node traversal");
		out.println("Expected: 4");
		out.println("Result: " + successor(three).value);
		out.println();

		out.println("Successor of 1 in node traversal");
		out.println("Expected: 2");
		out.println("Result: " + successor(one).value);
		out.println();

		out.println("Successor of 4 in node traversal");
		out.println("Expected: 5");
		out.println("Result: " + successor(four).value);
		out.println();
	}
}
