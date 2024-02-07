package linkedList.java.partition;

import linkedList.java.utility;
import linkedList.java.LinkedListNode;
import static java.lang.System.out;

public class Solution {
	public static void main(String [] args){
		int[] init = new int[]{18, 5, 8, 5, 10, 2, 1};
		LinkedListNode n = utility.createNodeFromArray(init);
		out.println(n);
		out.println();
		out.println(partition(n, 6));
	}

	public static LinkedListNode partition(LinkedListNode head, int value){
		LinkedListNode parentLess = new LinkedListNode(0), parentGreater = new LinkedListNode(0);
		LinkedListNode pLess = parentLess, pGreater = parentGreater;

		while(head != null){
			if( head.val >= value){
				pGreater.next = head;
				pGreater = pGreater.next;
			}
			else{
				pLess.next = head;
				pLess = pLess.next;
			}
			head = head.next;
		}
		pGreater.next = null;

		pLess.next = parentGreater.next;
		return parentLess.next;
	}
}
