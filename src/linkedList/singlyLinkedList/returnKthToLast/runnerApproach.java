package linkedList.singlyLinkedList.returnKthToLast;
import linkedList.singlyLinkedList.Node;

public class runnerApproach {
	public Node kth(Node n, int k){
		Node curr = n;
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
