package linkedList.java.palindrome;

import linkedList.java.Node;

public class reverseApproach {
	public boolean isPalindrome(Node curr){
		Node reverse = reverse(curr);
		return isEqual(curr, reverse);
	}
	public Node reverse(Node curr){
		Node prev = null;

		while(curr != null){
			Node n = new Node(curr.data);
			n.next = prev;
			prev = n;
			curr = curr.next;
		}
		return prev;
	}
	public boolean isEqual(Node one, Node two){
		while(one != null && two != null){
			if(one.data != two.data){
				return false;
			}
			one = one.next;
			two = two.next;
		}
		return true;
	}
}
