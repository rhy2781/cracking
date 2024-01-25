package linkedList.java.deleteMiddleNode;

import linkedList.java.utility;
import linkedList.java.Node;

public class Solution {
	public static void main(String[] args){
		Integer[][] list = new Integer[][]{
			{1, 1},
			{2, 2},
			{3, 3},
			{4, 4},
			{5, null}
		};
		Node n = utility.createNodeFromDictionary(list);
		Node k = utility.getKthNode(n, 3);
//		System.out.println(k);

		System.out.println(n);
		iterativeApproach ia = new iterativeApproach();
		assert k != null;
		ia.deleteMiddleNode(k);
		System.out.println(n);
	}
}
