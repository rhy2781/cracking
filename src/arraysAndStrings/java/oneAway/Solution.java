package arraysAndStrings.java.oneAway;

import static java.lang.System.out;

public class Solution {
	public static void main(String[] args){
		out.println(oneAway("pale", "ple"));
		out.println(oneAway("pales", "pale"));
		out.println(oneAway("pale", "bale"));
		out.println(oneAway("pale", "bake"));
	}

	public static boolean oneAway(String first, String second){
		if(Math.abs(first.length() - second.length()) > 1) return false;

		String s1 = first.length() < second.length() ? first : second;
		String s2 = first.length() < second.length() ? second : first;

		int index1 = 0, index2 = 0;
		boolean difference = false;
		while(index1 < s1.length() && index2 < s2.length()){
			if(s1.charAt(index1) != s2.charAt(index2)){
				if(difference) return false;
				difference = true;

				if(s1.length() == s2.length()){
					index1 ++;
				}
			}
			else{
				index1 ++;
			}
			index2 ++;
		}
		return true;
	}
}
