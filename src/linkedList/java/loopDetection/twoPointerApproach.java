package linkedList.java.loopDetection;

import linkedList.java.Node;

public class twoPointerApproach {
	public Node loopDetection(Node curr){
		Node fast = curr, slow = curr;
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
