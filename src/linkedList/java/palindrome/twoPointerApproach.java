package linkedList.java.palindrome;

import linkedList.java.Node;
import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class twoPointerApproach {
	public boolean isPalindrome(Node curr){
		List<Integer> contents = new ArrayList<>();
		while(curr != null){
			contents.add(curr.data);
			curr = curr.next;
		}

		int left = 0, right = contents.size() - 1;
		while(left < right){
			if(!Objects.equals(contents.get(left), contents.get(right))){
				return false;
			}
			left += 1;
			right -= 1;
		}
		return true;
	}
}
