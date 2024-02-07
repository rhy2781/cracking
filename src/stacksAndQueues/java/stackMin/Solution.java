package stacksAndQueues.java.stackMin;

import static java.lang.System.out;

public class Solution {
	public static void main(String []args){
		minStack m = new minStack();
		m.push(1);
		m.push(2);
		m.push(3);
		m.push(4);
		out.println(m.peek());
		out.println(m.min());
		out.println(m);
		out.println();

		m.push(0);
		out.println(m);
		out.println(m.min());
		out.println(m.pop());
		out.println(m);
	}
}
