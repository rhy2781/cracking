package linkedList.java.palindrome;

import linkedList.java.Node;

import java.util.Stack;

public class stackApproach {
	public boolean isPalindrome(Node curr){
		Node fast = curr, slow = curr;
		Stack<Integer> stack = new Stack<>();
		while(fast != null && fast.next != null){
			stack.push(slow.data);
			slow = slow.next;
			fast = fast.next.next;
		}
		if(fast != null){
			slow = slow.next;
		}

		while(slow != null){
			int top = stack.pop();
			if(top != slow.data){
				return false;
			}
			slow = slow.next;
		}
		return true;
	}
}
