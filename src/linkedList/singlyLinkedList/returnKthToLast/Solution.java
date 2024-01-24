package linkedList.singlyLinkedList.returnKthToLast;

import linkedList.singlyLinkedList.Node;

import java.util.HashMap;
import java.util.Map;

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

		runnerApproach ra = new runnerApproach();

		Node n = createNodeFromDictionary(list);
		System.out.println(n);
		Node m = ra.kth(n, 3);
		System.out.println(m);

		Node j = createNodeFromDictionary(list);
		System.out.println(j);
		Node k = ra.kth(j, 10);
		System.out.println(k);

		Node l = createNodeFromDictionary(list);
		System.out.println(j);
		Node p = ra.kth(j,7);
		System.out.println(p);
	}
}
