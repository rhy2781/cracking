package linkedList.java.loopDetection;

import linkedList.java.Node;
import linkedList.java.utility;

public class Solution {
	public static void main(String[] args){
		int[] l = new int[]{1, 2, 3, 4, 5};
		Node n = utility.createNodeFromArray(l);
		Node loopStart = utility.getKthNode(n, 3);
		Node end = utility.getKthNode(n, 5);
		System.out.println(n);
		System.out.println(end);

		end.next = loopStart;
		twoPointerApproach ta = new twoPointerApproach();
		Node res = ta.loopDetection(n);
		System.out.println("Encountered cycle at " + res.data);
	}
}
