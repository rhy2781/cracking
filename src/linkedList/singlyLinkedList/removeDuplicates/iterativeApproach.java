package linkedList.singlyLinkedList.removeDuplicates;

import java.util.HashSet;
import java.util.Set;
import linkedList.singlyLinkedList.node;

public class iterativeApproach {
	public void removeDuplicates(node n){
		Set<Integer> s = new HashSet<>();
		node prev = null;
		while(n != null){
			if(s.contains(n.data)){
				prev.next = n.next;
			}
			else{
				s.add(n.data);
				prev = n;
			}
			n = n.next;
		}
	}
}
