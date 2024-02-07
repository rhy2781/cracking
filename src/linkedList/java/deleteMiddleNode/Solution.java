package linkedList.java.deleteMiddleNode;

import linkedList.java.utility;
import linkedList.java.LinkedListNode;

import static java.lang.System.out;

public class Solution {
	public static void main(String[] args){
		int[] init = new int[]{1, 2, 3, 4, 5};

		LinkedListNode n = utility.createNodeFromArray(init);
		LinkedListNode k = utility.getKthNode(n, 3);

		out.println("Full Linked List");
		out.println(n);
		out.println("Node to Remove");
		out.println(k);

		deleteMiddleNode(k);

		out.println();
		out.println("Full Linked List After Removal");
		out.println(n);
	}

	public static void deleteMiddleNode(LinkedListNode curr){
		if(curr == null || curr.next == null) return;
		LinkedListNode next = curr.next;
		curr.val = next.val;
		curr.next = next.next;
	}
}
