package linkedList.java.palindrome;

import linkedList.java.utility;
import linkedList.java.LinkedListNode;

import java.util.Stack;

import static java.lang.System.out;

public class Solution {
	public static void main(String [] args){
		int[] init = new int[]{1, 2, 3, 4, 5, 4, 3, 2, 1};
		int[] init2 = new int[]{1,2,3,4};
		LinkedListNode palindrome = utility.createNodeFromArray(init);
		LinkedListNode notPalindrome = utility.createNodeFromArray(init2);


		out.println("Reverse Approach");
		out.println(isPalindromeReverse(palindrome));
		out.println(isPalindromeReverse(notPalindrome));
		out.println();

		out.println("Stack Approach");
		out.println(isPalindromeStack(palindrome));
		out.println(isPalindromeStack(notPalindrome));
	}

	public static boolean isPalindromeReverse(LinkedListNode curr){
		LinkedListNode reverse = reverse(curr);
		return isEqual(curr, reverse);
	}

	public static LinkedListNode reverse(LinkedListNode curr){
		LinkedListNode prev = null;

		while(curr != null){
			LinkedListNode n = new LinkedListNode(curr.val);
			n.next = prev;
			prev = n;
			curr = curr.next;
		}
		return prev;
	}

	public static boolean isEqual(LinkedListNode one, LinkedListNode two){
		while(one != null && two != null){
			if(one.val != two.val){
				return false;
			}
			one = one.next;
			two = two.next;
		}
		return true;
	}

	public static boolean isPalindromeStack(LinkedListNode curr){
		LinkedListNode fast = curr, slow = curr;
		Stack<Integer> stack = new Stack<>();
		while(fast != null && fast.next != null){
			stack.push(slow.val);
			slow = slow.next;
			fast = fast.next.next;
		}
		if(fast != null){
			slow = slow.next;
		}

		while(slow != null){
			int top = stack.pop();
			if(top != slow.val){
				return false;
			}
			slow = slow.next;
		}
		return true;
	}


}
