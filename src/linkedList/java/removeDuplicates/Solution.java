package linkedList.java.removeDuplicates;

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

		Node n = utility.createNodeFromDictionary(list);
		System.out.println(n);
		setApproach sa = new setApproach();
		sa.removeDuplicates(n);
		System.out.println(n);

		System.out.println();

		Node m = utility.createNodeFromDictionary(list);
		System.out.println(m);
		runnerApproach ra = new runnerApproach();
		ra.removeDuplicates(m);
		System.out.println(m);
	}
}
