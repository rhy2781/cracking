package arraysAndStrings.isUnique;

import java.util.Set;
import java.util.HashSet;

public class setApproach {
	public boolean isUnique(String s){
		Set<Character> hs = new HashSet<>();
		for(int i = 0; i < s.length(); i++) {
			if (hs.contains(s.charAt(i))) return false;
			hs.add(s.charAt(i));
		}
		return true;
	}
}
