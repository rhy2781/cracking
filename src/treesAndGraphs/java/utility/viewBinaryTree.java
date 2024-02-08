package treesAndGraphs.java.utility;

import javax.print.attribute.standard.JobName;
import java.util.*;

public class viewBinaryTree {
	public static void printTree(BinaryTreeNode root){
		int[][] combo = paddingBaseCombo(root);
		fillTreeWithZeros(root);
		List<List<Integer>> levelOrder = levelOrderTraversal(root, height(root));

		// initialize stringBuilders
		StringBuilder[] strings = new StringBuilder[combo.length];
		for(int i = 0; i < strings.length; i++){
			strings[i] = new StringBuilder();
		}

		// iterate over each level
		for(int i = 0; i < combo.length; i++){
			System.out.println(Arrays.toString(combo[i]));
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
//					line.append(level.get(j));
				}
				else{
					line.append("  ");
//					line.append(" X");
				}
				if(j != level.size() - 1) line.append(" ".repeat(spacing)); // insert spacing
			}
			line.append(" ".repeat(padding)); // padding
		}

		for(StringBuilder s: strings){
			System.out.println(s.toString());
		}




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
		int space_value = 8;
		int increment = 5;

		int height = height(root);
		int[][] combo = new int[height][2];
		combo[height - 1][1] = space_value;

		// calculate the space required for bottom row
		int bottomNodes = (int) Math.pow(2, (height - 1));
		int bottomSpace = (bottomNodes - 1) *  space_value + (bottomNodes * 2);

		System.out.println(bottomNodes);
		System.out.println(bottomSpace);
		// good up to here at least

		// calculate numbers for each row
		for(int i = height - 2; i >= 0; i--){
			int nodesInLevel = (int) Math.pow(2, i);
			int padding = combo[i + 1][0] + increment;
			int spaceInLevel = bottomSpace - (nodesInLevel * 2);

			System.out.println("Nodes: " + nodesInLevel);
			System.out.println("padding: "  + padding);
			System.out.println("spaceInLevel: " + spaceInLevel);
			System.out.println();

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


	public static void printCombination(int[][] combo){
		System.out.println("[");
		for(int[] c: combo){
			System.out.print("\t");
			System.out.println(Arrays.toString(c));
		}
		System.out.println("]");
	}
}
