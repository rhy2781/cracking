package treesAndGraphs.java.utility;

import java.util.HashMap;
import java.util.Map;

public class BinaryTreeNode {
	public int value;
	public BinaryTreeNode left;
	public BinaryTreeNode right;
	public BinaryTreeNode parent;

	public BinaryTreeNode(int value){
		this.value = value;
		this.left = null;
		this.right = null;
	}

//	public static void printTreeLevel(BinaryTreeNode root){
//		printTreeLevel(root, 0);
//	}
//
//	public static void printTreeLevel(BinaryTreeNode root, int level) {
//		if (root != null) {
//			// Traverse the left subtree with an incremented level
//			printTreeLevel(root.left, level + 1);
//
//			// Print the current node's value with proper indentation
//			for (int i = 0; i < level; i++) {
//				System.out.print("\t");
//			}
//			System.out.println(root.value); // Use println to move to the next line after printing the value
//
//			// Traverse the right subtree with an incremented level
//			printTreeLevel(root.right, level + 1);
//		}
//	}

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

	public static void addParents(BinaryTreeNode root){
		addParents(root, null);
	}
	public static void addParents(BinaryTreeNode root, BinaryTreeNode parent){
		if(root == null) return;
		root.parent = parent;
		addParents(root.left, root);
		addParents(root.right, root);
	}

	public static BinaryTreeNode createBinaryTreeNodeFromHashMap(Map<Integer, Integer[]> hm, Integer parent){
		HashMap<Integer, BinaryTreeNode> mappings = new HashMap<>();
		for(Integer n: hm.keySet()){
			mappings.put(n, new BinaryTreeNode(n));
		}

		for(Map.Entry<Integer, Integer[]> entry: hm.entrySet()){
			BinaryTreeNode n = mappings.get(entry.getKey());
			Integer[] children = entry.getValue();
			if (children[0] != -1){
				n.left = mappings.get(children[0]);
				n.left.parent = n;
			}
			if (children[1] != -1){
				n.right = mappings.get(children[1]);
				n.right.parent = n;
			}
		}
		return mappings.get(parent);
	}



	public int height(BinaryTreeNode root){
		if(root == null) return 0;
		return Math.max(height(root.left), height(root.right)) + 1;
	}

	public static void printTree(BinaryTreeNode root){

	}
}
