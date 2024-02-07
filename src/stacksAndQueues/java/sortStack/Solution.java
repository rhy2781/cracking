package stacksAndQueues.java.sortStack;

import java.util.Stack;
import static java.lang.System.out;

public class Solution {
	public static void main(String[] args){
		Stack<Integer> s = new Stack<>();
		int[] add = new int[]{1,54,67,30,20,15,30,43};
		for(int i: add){
			s.push(i);
		}

		out.println(s);
		sortStack(s);
		out.println(s);

		out.println();
		while(!s.isEmpty())
			out.println(s.pop());
	}

	public static void sortStack(Stack<Integer> s){
		Stack<Integer> buffer = new Stack<>();
		while(!s.isEmpty()){
			int temp = s.pop();
			while(!buffer.isEmpty() && buffer.peek() > temp){
				s.push(buffer.pop());
			}
			buffer.push(temp);
		}
		while(!buffer.isEmpty()){
			s.push(buffer.pop());
		}
	}
}
