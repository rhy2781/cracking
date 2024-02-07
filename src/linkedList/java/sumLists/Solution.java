package linkedList.java.sumLists;

import linkedList.java.utility;
import linkedList.java.LinkedListNode;
import static java.lang.System.out;

public class Solution {
	public static void main(String []args){
		int[] init = new int[]{7, 1, 6};
		int[] init2 = new int[]{5, 9, 3};

		LinkedListNode m = utility.createNodeFromArray(init);
		LinkedListNode n = utility.createNodeFromArray(init2);
		out.println(m);
		out.println(n);

		out.println("Sum of two Lists");
		out.println(sumLists(m, n));
	}

	public static LinkedListNode sumLists(LinkedListNode m, LinkedListNode n){
		LinkedListNode res = new LinkedListNode(0);
		LinkedListNode curr = res;
		int carry = 0;

		while (m != null || n != null){
			int val1 = m != null ? m.val : 0;
			int val2 = n != null ? n.val : 0;
			int sum = val1 + val2 + carry;

			curr.next = new LinkedListNode(sum % 10);
			carry = sum / 10;

			curr = curr.next;
			m = m.next;
			n = n.next;
		}
		if(carry != 0){
			curr.next = new LinkedListNode(carry);
		}
		return res.next;
	}
}
