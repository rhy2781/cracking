package linkedList.singlyLinkedList.removeDuplicates;

import linkedList.singlyLinkedList.Node;

import java.util.Map;
import java.util.HashMap;

public class Solution {
	public static Node createNodeFromDictionary(Integer[][] l){
		Map<Integer, Node> hm = new HashMap<>();
		for(int i = 0; i < l.length; i++){
			hm.put(i, new Node(l[i][0]));
		}
		for(int i = 0; i < l.length; i++){
			Node curr = hm.get(i);
			if(l[i][1] != null){
				curr.next = hm.get(l[i][1]);
			}
		}
		return hm.get(0);
	}

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

		Node n = createNodeFromDictionary(list);
		System.out.println(n);
		setApproach sa = new setApproach();
		sa.removeDuplicates(n);
		System.out.println(n);

		System.out.println();

		Node m = createNodeFromDictionary(list);
		System.out.println(m);
		runnerApproach ra = new runnerApproach();
		ra.removeDuplicates(m);
		System.out.println(m);
	}
}
