package linkedList.java.intersection;

import linkedList.java.Node;
import linkedList.java.utility;

public class Solution {
	public static void main(String [] args){
		int[] init = new int[]{3, 1, 5, 9, 7, 2, 1};
		int[] init2 = new int[]{4, 6};
		int[] init3 = new int[]{1, 2, 3, 4, 5};
		Node longer = utility.createNodeFromArray(init);
		Node shorter = utility.createNodeFromArray(init2);
		Node intersection = utility.getKthNode(longer, 5);
		Node append = utility.getKthNode(shorter, 2);
		append.next = intersection;

		iterativeApproach ia = new iterativeApproach();
		System.out.println("Intersection of two nodes");
		System.out.println(longer);
		System.out.println(shorter);
		System.out.println("Intersection at"  + ia.intersection(longer,  shorter));
		System.out.println("-----");
		System.out.println();

		Node unrelated = utility.createNodeFromArray(init3);
		System.out.println("Intersection of unrelated nodes");
		System.out.println(longer);
		System.out.println(unrelated);
		System.out.println("Intersection at " + ia.intersection(longer, unrelated));
	}
}
