package linkedList.java;

import java.util.HashSet;
import java.util.Set;

public class LinkedListNode {
	public LinkedListNode next = null;
	public int val;
	public LinkedListNode(int val){
		this.val = val;
	}

	@Override
	public String toString(){
		Set<LinkedListNode> seen = new HashSet<>();
		LinkedListNode curr = this;
		StringBuilder s = new StringBuilder();
		while(curr != null){
			if(seen.contains(curr)){
				s.append("-> Loop at: ");
				s.append(curr.val);
				return s.toString();
			}
			s.append(curr.val);
			s.append(" -> ");
			seen.add(curr);

			curr = curr.next;
		}
		return s.toString();
	}
}