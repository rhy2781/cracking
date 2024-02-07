package stacksAndQueues.java.queueViaStacks;

import static java.lang.System.out;

public class Solution {
	public static void main(String[] args){
		MyQueue q = new MyQueue();
		for(int i =0; i < 10; i++){
			q.push(i);
			out.println(q);
		}

		out.println();
		for(int i = 0; i < 10; i++){
			out.println(q.pop());
		}
	}
}
