package linkedList.java.palindrome;

import linkedList.java.Node;

import java.util.Map;
import java.util.HashMap;

public class frequencyApproach {
	public boolean isPalindrome(Node curr){
		Map<Integer, Integer> hm = new HashMap<>();
		while(curr != null){
			hm.computeIfPresent(curr.data, (k, v) -> v + 1);
			hm.putIfAbsent(curr.data, 1);
			curr = curr.next;
		}

		boolean oneDiff = false;
		for(Integer i: hm.values()){
			if(i % 2 == 1){
				if(oneDiff) return false;
				oneDiff = true;
			}
		}
		return true;
	}
}
