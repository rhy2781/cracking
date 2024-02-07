package linkedList.java;

import java.util.HashMap;
import java.util.Map;

public class utility {

	private utility(){}

	/**
	 * Creates a Linked List from an integer array
	 */
	public static LinkedListNode createNodeFromArray(int[] l){
		Map<Integer, LinkedListNode> hm = new HashMap<>();
		for(int i = 0; i < l.length; i++){
			hm.put(i, new LinkedListNode(l[i]));
		}
		for(int k: hm.keySet()){
			if (hm.containsKey(k + 1)){
				LinkedListNode n = hm.get(k);
				n.next = hm.get(k + 1);
			}
		}
		return hm.get(0);
	}

	/**
	 * Gets the Kth node where k represents the position of the node from the start including the beginning node
	 */
	public static LinkedListNode getKthNode(LinkedListNode n, int k){
		LinkedListNode curr = n;
		k -= 1;
		while(k > 0){
			if(curr == null) return null;
			curr = curr.next;
			k --;
		}
		return curr;
	}

}
