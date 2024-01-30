package stacksAndQueues.java.stackOfPlates;

public class Solution {
	public static void main(String [] args){
		setOfStacks s = new setOfStacks(5);
		for(int i = 0 ; i < 50; i ++){
			s.push(i);
		}
		System.out.println(s);


		for(int i = 0 ; i < 6; i++){
			System.out.println(s.pop());
		}

		System.out.println();
		System.out.println(s);

		for(int i = 0; i < 44; i++){
			System.out.println(s.pop());
		}
		System.out.println(s);
	}
}
