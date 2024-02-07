package arraysAndStrings.java.stringRotation;

import static java.lang.System.out;

public class Solution {
	public static void main(String[] args){
		out.println(stringRotation("waterbottle", "erbottlewat"));
	}

	public static boolean stringRotation(String s, String t){
		if(s.length() == t.length() && s.length() > 0){
			String s1 = s + s;
			return isSubstring(t, s1);
		}
		return false;
	}
	public static boolean isSubstring(String subString, String original){
		return original.contains(subString);
	}
}
