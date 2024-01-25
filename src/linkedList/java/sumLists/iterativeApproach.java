package linkedList.java.sumLists;

import linkedList.java.Node;

public class iterativeApproach {
	public Node sumLists(Node m, Node n){
		Node res = new Node(0);
		Node curr = res;
		int carry = 0;

		while (m != null || n != null){
			int val1 = m != null ? m.data : 0;
			int val2 = n != null ? n.data : 0;
			int sum = val1 + val2 + carry;

			curr.next = new Node(sum % 10);
			carry = sum / 10;

			curr = curr.next;
			m = m.next;
			n = n.next;
		}
		if(carry != 0){
			curr.next = new Node(carry);
		}
		return res.next;
	}
}
