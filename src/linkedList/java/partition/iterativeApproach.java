package linkedList.java.partition;

import linkedList.java.Node;

public class iterativeApproach {
	public Node partition(Node head, int value){
		Node parentLess = new Node(0), parentGreater = new Node(0);
		Node pLess = parentLess, pGreater = parentGreater;

		while(head != null){
			if( head.data >= value){
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
