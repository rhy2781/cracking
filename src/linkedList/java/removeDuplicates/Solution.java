package linkedList.java.removeDuplicates;

import linkedList.java.LinkedListNode;

import linkedList.java.utility;

import java.util.HashSet;
import java.util.Set;
import static java.lang.System.out;

public class Solution {

	public static void main(String[] args){
		int[] init = new int[]{1, 2, 3, 4, 1, 2, 5};
		LinkedListNode n = utility.createNodeFromArray(init);
		LinkedListNode m = utility.createNodeFromArray(init);

		out.println("Set Approach");
		out.println(n);
		removeDuplicatesSet(n);
		out.println(n);
		out.println();

		out.println("Runner Approach");
		out.println(m);
		removeDuplicatesRunner(m);
		out.println(m);
	}

	public static void removeDuplicatesSet(LinkedListNode n){
		Set<Integer> s = new HashSet<>();
		LinkedListNode prev = null;
		while(n != null){
			if(s.contains(n.val)){
				prev.next = n.next;
			}
			else{
				s.add(n.val);
				prev = n;
			}
			n = n.next;
		}
	}

	public static void removeDuplicatesRunner(LinkedListNode curr){
		while(curr != null){
			LinkedListNode runner = curr;
			while(runner.next != null){
				if(runner.next.val == curr.val){
					runner.next = runner.next.next;
				}
				else{
					runner = runner.next;
				}
			}
			curr = curr.next;
		}
	}
}
