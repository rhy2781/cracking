package treesAndGraphs.java.Successor;

import treesAndGraphs.java.utility.BinaryTreeNode;

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
//		Map<Integer, Integer[]> init = new HashMap<>(){{
//			put(1, new Integer[]{-1, -1}); // Node 2
//			put(2, new Integer[]{1, -1}); // Node 2
//			put(3, new Integer[]{2, 4}); // Node 3
//			put(4, new Integer[]{-1, -1}); // Node 3
//			put(5, new Integer[]{3, 7}); // Node  5
//			put(7, new Integer[]{-1, 9}); // Node 7
//			put(9, new Integer[]{10, 13}); // Node 9
//			put(10, new Integer[]{-1, -1}); // Node 10
//			put(13, new Integer[]{-1, -1}); // Node 13
//		}};
//		BinaryTreeNode root = BinaryTreeNode.createBinaryTreeNodeFromHashMap(init, 5);
//		BinaryTreeNode.printTreeLevel(root);


		int[] init = new int[]{1, 2, 3, 4, 5, 6, 7};
		BinaryTreeNode root = BinaryTreeNode.createBinaryTreeNodeFromSortedArray(init);
		BinaryTreeNode.printTreeLevel(root);
//		System.out.println(height(root));
//		padding(height(root),0);
	}

	public static void viewTree(BinaryTreeNode root){
		int height = height(root);
		StringBuilder[] result = new StringBuilder[height];
		for(int i = 0; i < result.length; i++){
			result[i] = new StringBuilder();
		}

		StringBuilder res = new StringBuilder();
		for(StringBuilder s : result) {
			res.append(s);
			res.append("\n");
		}
		System.out.println(res);
	}
	public static int height(BinaryTreeNode root){
		if(root == null) return 0;
		return Math.max(height(root.left), height(root.right)) + 1;
	}
	public static void padding(int height, int level){
		// max amount of spacing for bottom layeris reliant on height
		int bottom = (int) (Math.pow(2, height - 1)) - 1;
		System.out.println(bottom);
	}



}
