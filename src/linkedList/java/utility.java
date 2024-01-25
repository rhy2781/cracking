package linkedList.java;

import java.util.HashMap;
import java.util.Map;

public class utility {

	private utility(){}

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
	public static Node getKthNode(Node n, int k){
		Node curr = n;
		k -= 1;
		while(k > 0){
			if(curr == null) return null;
			curr = curr.next;
			k --;
		}
		return curr;
	}
}
