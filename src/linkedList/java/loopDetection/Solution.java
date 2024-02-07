package linkedList.java.loopDetection;

import linkedList.java.LinkedListNode;
import linkedList.java.utility;
import static java.lang.System.out;

public class Solution {
	public static void main(String[] args){
		int[] l = new int[]{1, 2, 3, 4, 5};
		LinkedListNode n = utility.createNodeFromArray(l);
		LinkedListNode loopStart = utility.getKthNode(n, 3);
		LinkedListNode end = utility.getKthNode(n, 5);


		out.println(n);
		out.println("Last Node: " + end);

		out.println("Creating loop at: " + loopStart);
		end.next = loopStart;
		out.println("Resulting LinkedList: " + n);
		out.println();

		out.println("Encountered cycle at " + loopDetection(n).val);
	}

	public static LinkedListNode loopDetection(LinkedListNode curr){
		LinkedListNode fast = curr, slow = curr;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast){
				break;
			}
		}
		if(fast == null || fast.next == null){
			return null;
		}
		slow = curr;
		while(slow != fast){
			slow = slow.next;
			fast = fast.next;
		}
		return slow;
	}
}
