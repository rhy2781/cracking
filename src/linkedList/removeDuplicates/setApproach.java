package linkedList.removeDuplicates;

import java.util.HashSet;
import java.util.Set;
import linkedList.Node;

public class setApproach {
	public void removeDuplicates(Node n){
		Set<Integer> s = new HashSet<>();
		Node prev = null;
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
