package linkedList.java.intersection;

import linkedList.java.Node;
import linkedList.java.utility;

public class iterativeApproach {
	public int length(Node curr){
		int i = 1;
		while(curr != null){
			curr = curr.next;
			i ++;
		}
		return i;
	}

	public Node intersection(Node one, Node two){
		Node p1 = one, p2 = two;
		while(p1.next != null) p1 = p1.next;
		while(p2.next != null) p2 = p2.next;

		if(p1 != p2) return null;

		int length1 = length(one), length2 = length(two);
		Node res = length1 < length2 ? one: two;
		return utility.getKthNode(res, Math.abs(length1 - length2) + 1);
	}
}
