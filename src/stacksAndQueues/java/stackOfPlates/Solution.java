package stacksAndQueues.java.stackOfPlates;

import static java.lang.System.out;

public class Solution {
	public static void main(String [] args){
		setOfStacks s = new setOfStacks(5);
		for(int i = 0 ; i < 50; i ++){
			s.push(i);
		}
		out.println(s);


		for(int i = 0 ; i < 6; i++){
			out.println(s.pop());
		}

		out.println();
		out.println(s);

		for(int i = 0; i < 44; i++){
			out.println(s.pop());
		}
		out.println(s);
	}
}
