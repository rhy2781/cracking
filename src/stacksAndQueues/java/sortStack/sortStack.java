package stacksAndQueues.java.sortStack;

import java.util.Stack;

public class sortStack {
	public void sortStack(Stack<Integer> s){
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
