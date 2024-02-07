package linkedList.java.intersection;

import linkedList.java.LinkedListNode;
import linkedList.java.utility;
import static java.lang.System.out;

public class Solution {
	public static void main(String [] args){
		int[] init = new int[]{3, 1, 5, 9, 7, 2, 1};
		int[] init2 = new int[]{4, 6};
		int[] init3 = new int[]{1, 2, 3, 4, 5};

		LinkedListNode longer = utility.createNodeFromArray(init);
		LinkedListNode shorter = utility.createNodeFromArray(init2);
		LinkedListNode unrelated = utility.createNodeFromArray(init3);
		out.println("Longer: " + longer);
		out.println("Shorter: " + shorter);
		out.println();

		out.println("connecting the lists");
		LinkedListNode intersection = utility.getKthNode(longer, 5);
		LinkedListNode append = utility.getKthNode(shorter, 2);
		append.next = intersection;
		out.println("Longer: " + longer);
		out.println("Shorter: " + shorter);
		out.println();
		out.println("Intersection at: " + intersection(longer, shorter));
		out.println();
		out.println();

		out.println("Longer Node: " + longer);
		out.println("Unrelated Node: " + unrelated);
		out.println();
		out.println("Intersection at: " + intersection(longer, unrelated));
	}

	public static int length(LinkedListNode curr){
		int i = 1;
		while(curr != null){
			curr = curr.next;
			i ++;
		}
		return i;
	}

	public static LinkedListNode intersection(LinkedListNode one, LinkedListNode two){
		LinkedListNode p1 = one, p2 = two;
		while(p1.next != null) p1 = p1.next;
		while(p2.next != null) p2 = p2.next;

		if(p1 != p2) return null;

		int length1 = length(one), length2 = length(two);
		LinkedListNode res = length1 < length2 ? one: two;
		return utility.getKthNode(res, Math.abs(length1 - length2) + 1);
	}
}
