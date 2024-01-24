package linkedList.java.returnKthToLast;

import linkedList.java.Node;
import linkedList.java.utility;

public class Solution {
	public static void main(String[] args){
		Integer[][] list = new Integer[][]{
				{1, 1},
				{2, 2},
				{3, 3},
				{4, 4},
				{1, 5},
				{2, 6},
				{5, null}
		};

		runnerApproach ra = new runnerApproach();

		Node n = utility.createNodeFromDictionary(list);
		System.out.println(n);
		Node m = ra.kth(n, 3);
		System.out.println(m);

		Node k = ra.kth(n, 10);
		System.out.println(k);

		Node p = ra.kth(n,7);
		System.out.println(p);
	}
}
