package linkedList.java.deleteMiddleNode;

import linkedList.java.Node;

public class iterativeApproach {
	public void deleteMiddleNode(Node curr){
		if(curr == null || curr.next == null) return;
		Node next = curr.next;
		curr.data = next.data;
		curr.next = next.next;
	}
}
