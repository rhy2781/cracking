package linkedList.java.returnKthToLast;

import linkedList.java.LinkedListNode;
import linkedList.java.utility;
import static java.lang.System.out;

public class Solution {
	public static void main(String[] args){
		int[] init = new int[]{1, 2, 3, 4, 1, 2, 5};
		LinkedListNode n = utility.createNodeFromArray(init);
		out.println(n);

		out.println("k = 3 : " + kth(n, 3));
		out.println("k = 10 : " + kth(n, 10));
		out.println("k = 7 : " + kth(n, 7));
	}

	public static LinkedListNode kth(LinkedListNode n, int k){
		LinkedListNode curr = n;
		while(k > 0){
			if(curr == null) return null;
			curr = curr.next;
			k --;
		}
		while(curr != null){
			curr = curr.next;
			n = n.next;
		}
		return n;
	}
}
