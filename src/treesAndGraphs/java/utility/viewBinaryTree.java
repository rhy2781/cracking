package treesAndGraphs.java.utility;

import java.util.*;

public class viewBinaryTree {
	/**
	 * Print a binary tree formatted in the run window
	 * @param root the root of the Binary Tree to be printed
	 */
	public static void printTree(BinaryTreeNode root){
		int[][] combo = paddingBaseCombo(root);
		BinaryTreeNode duplicate = duplicateTree(root); // duplicate tree to populate null nodes for spacing
		fillTreeWithZeros(duplicate);
		List<List<Integer>> levelOrder = levelOrderTraversal(duplicate, height(duplicate));

		// initialize stringBuilders
		StringBuilder[] strings = new StringBuilder[combo.length];
		for(int i = 0; i < strings.length; i++){
			strings[i] = new StringBuilder();
		}

		// iterate over each level
		for(int i = 0; i < combo.length; i++){
			int[] c = combo[i];
			int padding = c[0];
			int spacing = c[1];
			StringBuilder line = strings[i];
			List<Integer> level = levelOrder.get(i);

			line.append(" ".repeat(padding)); // padding
			for(int j = 0; j < level.size(); j++){
				int value = level.get(j);
				if(value != -1){
					String number = String.format("%2d", level.get(j));
					line.append(number);
				}
				else{
					line.append("  ");
				}
				if(j != level.size() - 1) line.append(" ".repeat(spacing)); // insert spacing
			}
			line.append(" ".repeat(padding)); // padding
		}

		// print the resulting strings
		int total_length = strings[0].length();
		System.out.print("=".repeat(total_length + 2));
		System.out.println();
		for(int i = 0; i < strings.length; i++){
			System.out.print("|");
			System.out.print(strings[i].toString());
			System.out.println("|");
			if(i != strings.length - 1) {
				System.out.print("|");
				System.out.print(" ".repeat(total_length));
				System.out.println("|");
			}
		}
		System.out.print("=".repeat(total_length + 2));
		System.out.println();
	}

	/**
	 * Determine the height of the tree
	 * @param root the root of the binary tree
	 * @return the height of the tree, where height = 1 represents the root node
	 */
	public static int height(BinaryTreeNode root){
		if(root == null) return 0;
		return Math.max(height(root.left), height(root.right)) + 1;
	}

	/**
	 * Create a 2D integer array to find the specific number of units that need to be used for
	 * padding and spacing on each level.
	 *  Printing out a level will consist of the process
	 *  padding | spacing | spacing | spac... | padding
	 * @param root the root of the Binary Tree
	 * @return combo  the 2D integer array containing the units to use for padding and spacing at each level
	 */
	public static int[][] paddingBaseCombo(BinaryTreeNode root){
		// variables used to calculate spacing
		// 1-digit numbers
		// space_value = 5;
		// increment = 3;

		// 2- digit numbers
		int space_value = 8;
		int increment = 5;

		int height = height(root);
		int[][] combo = new int[height][2];
		combo[height - 1][1] = space_value;

		// calculate the space required for bottom row
		int bottomNodes = (int) Math.pow(2, (height - 1));
		int bottomSpace = (bottomNodes - 1) *  space_value + (bottomNodes * 2);

		// calculate numbers for each row
		for(int i = height - 2; i >= 0; i--){
			int nodesInLevel = (int) Math.pow(2, i);
			int padding = combo[i + 1][0] + increment;
			int spaceInLevel = bottomSpace - (nodesInLevel * 2);

			// calculate padding + spacing for each level
			combo[i][0] = padding;
			if(i != 0) {
				combo[i][1] = (spaceInLevel - ( 2 * padding)) / (nodesInLevel - 1);
			}
			increment *= 2;
		}
		return combo;
	}

	/**
	 * Fill the empty spaces of the binary tree with nodes labeled with the value of -1
	 * @param root the root of the Binary Tree
	 */
	public static void fillTreeWithZeros(BinaryTreeNode root){
		int height = height(root);
		fillTreeWithZeros(root, height - 1);
	}

	/**
	 * Fill the empty spaces of the binary tree with nodes labeled with the value of -1
	 * @param root the root of the Binary Tree
	 * @param height the height of the Binary Tree
	 */
	public static void fillTreeWithZeros(BinaryTreeNode root, int height){
		if(height == 0) return;

		if(root.right == null) root.right = new BinaryTreeNode(-1);
		if(root.left == null) root.left = new BinaryTreeNode(-1);

		fillTreeWithZeros(root.right, height - 1);
		fillTreeWithZeros(root.left, height - 1);
	}

	/**
	 * return a list of integers representing the level order traversal of a binary search tree
	 * @param root the root or the Binary Tree
	 * @param height the height of the Binary Tree
	 * @return a list of the integers in level order traversal
	 */
	public static List<List<Integer>> levelOrderTraversal(BinaryTreeNode root, int height){
		List<List<Integer>> res = new ArrayList<>(height);
		for(int i = 0; i < height; i ++){
			res.add(new ArrayList<>());
		}

		Queue<Object[]> q = new LinkedList<>();
		q.add(new Object[]{0, root});
		while(!q.isEmpty()){
			Object[] temp = q.poll();
			BinaryTreeNode curr = (BinaryTreeNode) temp[1];
			int k = (Integer) temp[0];

			List<Integer> level = res.get(k);
			level.add(curr.value);
			if(curr.left != null) q.add(new Object[]{k + 1, curr.left});
			if (curr.right != null) q.add(new Object[]{k + 1, curr.right});
		}
		return res;
	}

	/**
	 * Duplicate the given binary tree in order to fill in gaps with -1 value nodes to facilitate proper spacing without
	 * affecting the original tree
	 * @param root the root of the original binary tree
	 * @return the root of the new binary tree
	 */
	public static BinaryTreeNode duplicateTree(BinaryTreeNode root){
		if(root == null) return null;
		BinaryTreeNode parent = new BinaryTreeNode(root.value);
		parent.left = duplicateTree(root.left);
		parent.right = duplicateTree(root.right);
		return parent;
	}
}
