package stacksAndQueues.java.sortStack;

import java.util.Stack;

public class Solution {
	public static void main(String[] args){
		sortStack a = new sortStack();
		Stack<Integer> s = new Stack<>();
		int[] add = new int[]{1,54,67,30,20,15,30,43};
		for(int i: add){
			s.push(i);
		}

		System.out.println(s);
		a.sortStack(s);
		System.out.println(s);

		System.out.println();
		System.out.println(s.pop());
	}
}
